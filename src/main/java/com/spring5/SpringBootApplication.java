package com.spring5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@org.springframework.boot.autoconfigure.SpringBootApplication(scanBasePackages = {"com.spring5"})
public class SpringBootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringBootApplication.class, args);
    }

    @RequestMapping("/ping")
    public String index() {
        return "alive";
    }
}
