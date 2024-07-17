package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String test() {
        System.out.println("enter hom Controller - testing");
        return "testing";
    }

    @GetMapping("/error")
    @ResponseBody
    public void error() throws IOException{
        throw new IOException("Forced IOException");
    }
}
