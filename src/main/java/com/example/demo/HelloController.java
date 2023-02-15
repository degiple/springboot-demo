package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @RequestMapping("/")
  public String home() {
    return "Hello World!";
  }

  @RequestMapping("/hello")
  public String helloSp() {
    return "Hello SpringBoot!";
  }
}
