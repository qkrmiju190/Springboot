package com.example.bootBoard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/sample")
@Controller
public class SampleController {
    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    @ResponseBody
    public String HelloWorld() {
        return "World Hello !!! ";
    }
}