package com.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nandakumar.menon on 23-02-2017.
 */
@RestController
public class HelloWorldController {

    @Value("${greeting}") String greeting;

    @RequestMapping("/greeting")
    public String showGreeting() {
        return "The message is: " + greeting;
    }
}
