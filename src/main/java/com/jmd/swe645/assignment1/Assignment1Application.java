/**
 * Jared DiCioccio
 * <p>
 * This is the main application entrypoint.
 * It starts a SpringApplication that will server static content from the resource/static folder.
 */
package com.jmd.swe645.assignment1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Assignment1Application extends SpringBootServletInitializer {
    private static final Logger log = LoggerFactory.getLogger(Assignment1Application.class);

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Assignment1Application.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(Assignment1Application.class, args);

    }

}
