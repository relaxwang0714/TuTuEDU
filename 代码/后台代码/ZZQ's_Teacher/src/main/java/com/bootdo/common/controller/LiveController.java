package com.bootdo.common.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zzzzzzzzq
 * @Date: 2019/3/5 13:58
 */
@Controller
@RequestMapping("/common/live")
public class LiveController extends BaseController {

    @GetMapping()
/*    @RequiresPermissions("common:sysFile:sysFile")*/
    String sysFile(Model model) {
        Map<String, Object> params = new HashMap<>(16);
        return "common/live/file";
    }
}
