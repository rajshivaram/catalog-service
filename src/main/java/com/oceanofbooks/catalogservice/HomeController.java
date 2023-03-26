package com.oceanofbooks.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oceanofbooks.catalogservice.config.OceanProperties;

@RestController
public class HomeController {

    private final OceanProperties oceanProperties;

    public HomeController(OceanProperties oceanProperties) {

        this.oceanProperties = oceanProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        return oceanProperties.getGreeting();
    }

}
