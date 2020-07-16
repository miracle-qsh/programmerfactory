package com.junyan.programmerfactory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 公共Controller
 * @author qsh
 */
@Controller
public class ShareController {
    @RequestMapping("/home")
    public String home() {
        return "index";
    }
}
