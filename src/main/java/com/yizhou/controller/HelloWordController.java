package com.yizhou.controller;

import com.yizhou.model.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

    @RequestMapping("/")
    public String welcome() {
        return "Hi, your first spring application here.";
    }


    @RequestMapping(value = "/msg/{value}", method = RequestMethod.GET)
    public Message showMessage(@PathVariable String value) {
        Message msg = new Message("you are awesome!", value);
        return msg;
    }
}
