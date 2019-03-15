package com.bootdo.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zzzzzzzzq
 * @Date: 2019/3/13 13:28
 */
@Controller
@RequestMapping("/common/sum")
public class SumController {

    @GetMapping("/classlist")
        /*    @RequiresPermissions("common:sysFile:sysFile")*/
    String sysFile(Model model) {
        Map<String, Object> params = new HashMap<>(16);
        return "common/sum/classlist";
    }

}