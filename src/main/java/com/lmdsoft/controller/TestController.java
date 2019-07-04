package com.lmdsoft.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lmdsoft.entity.Demo;
import com.lmdsoft.service.impl.DemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 17:07
 * @Version V1.0
 * @Description: 测试
 **/

@Controller
public class TestController {

    @Autowired
    private DemoServiceImpl demoService;


    @RequestMapping(path = "/")
    public ModelAndView index(@RequestParam(defaultValue = "1")int page) {
        ModelAndView mv = new ModelAndView("index");
        PageHelper.startPage(page,2);
        List<Demo> demos = demoService.selectAll();
        mv.addObject("list",demos);
        mv.addObject("pageInfo",new PageInfo<>(demos));
        return mv;
    }


}
