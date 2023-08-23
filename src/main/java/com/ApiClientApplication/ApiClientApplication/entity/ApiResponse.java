package com.ApiClientApplication.ApiClientApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse {
	@Id
	@GeneratedValue
	private Long id;
	private String content;

	public ApiResponse(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "ApiResponse{" + "id=" + id + ", content='" + content + '\'' + '}';
	}
}
