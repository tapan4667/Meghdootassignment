package com.ApiClientApplication.ApiClientApplication.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiClientApplication.ApiClientApplication.entity.ApiResponse;
import com.ApiClientApplication.ApiClientApplication.repository.ApiResponseRepository;
@Service
public class ApiService {
    @Autowired
    private ApiResponseRepository apiResponseRepository;

    public String callApiAndSaveToFile() {
        try {
            String apiResponse =callAPI("https://eric.ed.gov/?api#/");
            ApiResponse savedResponse =saveApiResponse(apiResponse);
            return "API response saved successfully. ID: " + savedResponse.getId();
        } catch (IOException e) {
            e.printStackTrace();
            return "Error occurred while calling the API.";
        }
    }
    private String callAPI(String apiUrl) throws IOException {
        return null; 
}
    private ApiResponse saveApiResponse(String apiResponse) {
        return null; 
}
}
