package ru.innopolis.demo.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Index.
 *
 * @author lifeandfree
 */
@RestController
@Profile("local")
public class Index {

    @RequestMapping("/index")
    public String index() {
        return "hello world";
    }

    @GetMapping
    @RequestMapping("/response")
    public ResponseDto response() {
        return new ResponseDto("hello world");
    }
}
