package cn.cote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String sayHello(){
        return "Hello Spring ! ! !";
    }
}
