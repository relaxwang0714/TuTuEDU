# -*- coding: utf-8 -*-
import scrapy
from zhengfang.items import ZhengfangItem
from scrapy.contrib.spiders import CrawlSpider, Rule
from scrapy.http import Request, FormRequest
from scrapy.selector import Selector
from scrapy.contrib.linkextractors.sgml import SgmlLinkExtractor

class zhengfangSpiderSpider(scrapy.Spider):
    #这里是爬虫名
    name = 'zhengfang_spider'
    #允许的域名
    allowed_domains = ['124.160.107.91']
    #入口url,扔到调度器里去
    start_urls = ['http://124.160.107.91:9090/xskbcx.aspx?xh=16905533&xm=%E5%BC%A0%E6%B5%99%E6%9D%83&gnmkdm=N121603']


    headers = {
        "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
        "Accept-Encoding": "gzip,deflate",
        "Accept-Language": "zh-CN,zh;q=0.9",
        "Connection": "keep-alive",
        "Content-Type": " application/x-www-form-urlencoded",
        "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/66.0.3359.139 Safari/537.36",
        "Referer": "http://124.160.107.91:9090/default2.aspx"
    }


    # 重写了爬虫类的方法, 实现了自定义请求, 运行成功后会调用callback回调函数
    def start_requests(self):
        return [Request("http://124.160.107.91:9090/default2.aspx", meta={'cookiejar': 1}, callback=self.post_login)]

    # FormRequeset出问题了
    def post_login(self, response):
        print('Preparing login')
        # FormRequeset.from_response是Scrapy提供的一个函数, 用于post表单
        VIEWSTATE = Selector(response).xpath('//*[@id="__VIEWSTATE"]/@value').extract()
        print(VIEWSTATE)
        EVENTVALIDATION = Selector(response).xpath('//*[@id="__EVENTVALIDATION"]/@value').extract()
        print(EVENTVALIDATION)
        # 登陆成功后, 会调用after_login回调函数
        return [FormRequest.from_response(response,
                                          meta={'cookiejar': response.meta['cookiejar']},
                                          headers=self.headers,  # 注意此处的headers
                                          formdata={
                                              '__VIEWSTATE':VIEWSTATE,
                                              '__EVENTVALIDATION':EVENTVALIDATION,
                                              'TextBox1': '16905533',
                                              'TextBox2': 'Hdu138390',
                                              'RadioButtonList1': '%D1%A7%C9%FA',
                                              'Button1':''
                                          },
                                          callback=self.parse,
                                          dont_filter=True
                                          )]

    # def after_login(self, response):
    #     print('success!!!')
    #     for url in self.start_urls:
    #         yield self.make_requests_from_url(url)

    #默认的解析方法
    def parse(self, response):
        problem = Selector(response)
        zhengfang_item = ZhengfangItem()
        zhengfang_item['course_name']=problem.xpath("//*[@id='Table1']/tr[5]/td[2]/text()").extract()
        zhengfang_item['course2'] = problem.xpath("//*[@id='Table1']/tr[3]/td[7]/text()").extract()
        print(zhengfang_item['course_name'])
        print(zhengfang_item['course2'])
        yield scrapy.Request(
            "http://124.160.107.91:9090/xskbcx.aspx?xh=16905533&xm=%E5%BC%A0%E6%B5%99%E6%9D%83&gnmkdm=N121603",
             meta={'cookiejar': 1}, )
        # for i_item in movie_list:
        #     #item文件导进来
        #     douban_item =MyScrapyItem()
        #     #写详细的xpath，进行数据的解析
        #     douban_item['serial_number']=i_item.xpath(".//div[@class='item']//em/text()").extract_first()#返回字符串
        #     douban_item['movie_name']=i_item.xpath(".//div[@class='hd']//span[@class='title']/text()").extract_first()
        #     content=i_item.xpath(".//div[@class='info']//div[@class='bd']/p[1]/text()").extract()#返回数组
        #     #多行数据处理
        #     for i_content in content:
        #         content_s="".join(i_content.split()) #分割开再用""# 拼接成一个字符串
        #         douban_item['introduce'] =content_s
        #     douban_item['star']=i_item.xpath(".//span[@class='rating_num']/text()").extract_first()
        #     douban_item['evaluate']=i_item.xpath(".//div[@class='star']//span[4]/text()").extract_first()
        #     douban_item['describe']=i_item.xpath(".//span[@class='inq']/text()").extract_first()
        #     print(douban_item)
        #     #需要将数据yield到piplines里面去
        #     yield douban_item #类似return，返回一个迭代生成器
        # #解析下一页，取后一页的xpath
        # next_link=response.xpath("//span[@class='next']/link/@href").extract()
        # if next_link:
        #     next_link=next_link[0]
        #     yield scrapy.Request("https://movie.douban.com/top250"+next_link,callback=self.parse)
