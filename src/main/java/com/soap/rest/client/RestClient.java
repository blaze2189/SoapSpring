package com.soap.rest.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import io.spring.guides.gs_producing_web_service.User;

@Component
public class RestClient {

	private final String REST_SERVICE = "http://localhost:8000/user/";
	
	public User request() {
		User returnUser=null;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders header = new HttpHeaders();
		HttpEntity request = new HttpEntity<>(header);
		ResponseEntity<User> responseEntity = restTemplate.exchange(REST_SERVICE, HttpMethod.GET,request,User.class);
		 returnUser=responseEntity.getBody();
		 return returnUser;
	}
	
}
