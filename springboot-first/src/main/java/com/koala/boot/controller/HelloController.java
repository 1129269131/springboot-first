package com.koala.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * day03
 * Create by koala on 2021-07-29
 */
@RestController
public class HelloController {

    @GetMapping("/hello66")
    public String hello(){
        return "66666666~~~~~";
    }

}
