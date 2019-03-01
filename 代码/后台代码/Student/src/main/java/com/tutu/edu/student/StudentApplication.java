package com.tutu.edu.student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableDiscoveryClient
//微服务feign组件支持
@EnableFeignClients
//微服务Hystrix组件支持
//@EnableHystrixDashboard
@EnableEurekaClient
@EnableCircuitBreaker
@SpringBootApplication
@MapperScan("com.tutu.edu.student.mapper")
public class StudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
    }

}
