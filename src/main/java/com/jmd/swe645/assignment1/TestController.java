/**
 * Jared DiCioccio
 *
 * This is an endpoint that simply returns a string. Used to test that application is running.
 *
 *
 */
package com.jmd.swe645.assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String index() {
        return "Greetings from Spring Boot hosted on Tomcat!";
    }

}