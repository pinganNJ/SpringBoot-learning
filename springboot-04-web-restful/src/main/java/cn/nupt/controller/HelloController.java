package cn.nupt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @AUTHOR PizAn
 * @CREAET 2019-05-07 16:37
 */


@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "aaa";
    }


    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        //返回map，然后前端用thymeleaf捕获
        map.put("hello","springboot");
        return "success";

    }


}
