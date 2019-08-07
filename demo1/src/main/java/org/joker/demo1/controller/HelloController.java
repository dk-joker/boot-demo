package org.joker.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-08-05 23:11
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World";
    }
}

