package com.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @Author: yangzhicheng
 * @Date: 2018/7/23 10:45
 */
@Controller
public class IndexController {

    @RequestMapping("/aa")
    public String getAA(){
        return "aa";
    }

    @RequestMapping("/bb")
    public String getBb(){
        return "bb";
    }

    @RequestMapping("/index")
    public String getIndex(){
        return "index";
    }

    @RequestMapping("/starter")
    public String getStarter(){
        return "starter";
    }
}
