package com.ApiClientApplication.ApiClientApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiClientApplication.ApiClientApplication.service.ApiService;
@RestController
@RequestMapping("/api")

public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/call")
    public String callApiAndSaveToFile() {
        return apiService.callApiAndSaveToFile();
    }
}


