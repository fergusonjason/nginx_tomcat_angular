package org.hiredgoons.myapp.data.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String helloWorld(HttpServletResponse response) {

        // c is for cookie and that's good enough for me
        Cookie c = new Cookie("TEST","TEST");
        response.addCookie(c);

        return "Hello world";
    }
}
