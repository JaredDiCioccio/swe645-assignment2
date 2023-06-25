/**
 * Jared DiCioccio
 *
 * Another test endpoint to make sure rendering thymeleaf templates works.
 *
 * go to the /hello endpoint
 * Optionally pass in a name parameter
 *
 * ie: /hello?name=Jared
 *
 *
 */

package com.jmd.swe645.assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello_template";
    }

}