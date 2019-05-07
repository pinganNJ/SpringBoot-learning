package cn.nupt.springboot01helloword.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * controller层
 *
 * @AUTHOR PizAn
 * @CREAET 2019-05-07 10:56
 */


@Controller
@ResponseBody
public class Hellocontroller {

    /**
     * @Author PizAn
     * @Description  @ResponseBody 返回给浏览器的注解  @RequestMapping("/hello")映射注解
     * @Param []
     * @return java.lang.String
     **/

    @RequestMapping("/hello")
    public  String hello(){
        return  "this is the first springboot programe!";
    }

}
