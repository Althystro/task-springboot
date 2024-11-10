package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class DemoController {
    @GetMapping("/hello")
    String hello() {
        return "hello world boot hehehehehehhehehehhehe";
    }

    @GetMapping("/")
    String howdy() {
        return "howdy world boot ";
    }

    @GetMapping("/api")
    @ResponseBody
    public String getFoos(@RequestParam String id) {
        return "ID: " + id;
    }

}
