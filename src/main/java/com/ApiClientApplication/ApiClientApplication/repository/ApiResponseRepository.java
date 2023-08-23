package com.ApiClientApplication.ApiClientApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ApiClientApplication.ApiClientApplication.entity.ApiResponse;
@Repository
public interface ApiResponseRepository extends JpaRepository<ApiResponse, Long> {

}
