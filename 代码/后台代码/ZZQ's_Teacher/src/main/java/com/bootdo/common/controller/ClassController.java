package com.bootdo.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zzzzzzzzq
 * @Date: 2019/3/11 15:00
 */
@Controller
@RequestMapping("/common/class")
public class ClassController {

    @GetMapping()
        /*    @RequiresPermissions("common:sysFile:sysFile")*/
    String sysFile(Model model) {
        Map<String, Object> params = new HashMap<>(16);
        return "common/class/list";
    }

    @GetMapping("/add")
        // @RequiresPermissions("common:bComments")
    String add() {
        return "common/class/add";
    }


    @GetMapping("/add2")
        // @RequiresPermissions("common:bComments")
    String add12() {
        return "common/class/add2";
    }

    @GetMapping("/detail")
        // @RequiresPermissions("common:bComments")
    String detail() {
        return "common/class/detail";
    }
}
