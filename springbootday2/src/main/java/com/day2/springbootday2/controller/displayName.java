package com.day2.springbootday2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class displayName {
	@Value("${student}")
    private String studentName;

    @GetMapping("/name")
    public String getName() {
        return "Name is: " + studentName;
    }
}
