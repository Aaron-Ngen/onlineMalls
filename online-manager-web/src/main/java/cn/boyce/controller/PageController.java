package cn.boyce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Yuan Baiyu
 * @Date: Created in 13:52 2019/4/20
 **/
@Controller
public class PageController {

    /**
     *
     * @param page 页面名字作参
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}