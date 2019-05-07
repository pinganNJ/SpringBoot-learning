package cn.nupt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR PizAn
 * @CREAET 2019-05-07 16:37
 */


@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String  hello(){
        return  "aaa";
    }




}
