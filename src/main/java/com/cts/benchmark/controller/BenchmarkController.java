package com.cts.benchmark.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cts.benchmark.feignclient.AuthClient;
import com.cts.benchmark.pojo.AuditBenchmark;
import com.cts.benchmark.service.TokenService;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * this is only and main controller of benchmark microservice and there is  only one end point  /auditbenchmark of type GET
 *
 */
@RestController
@Slf4j
public class BenchmarkController {
	@Autowired
	AuthClient authClient;
		// getting a reference from authclient inteface so that we can verify the token
	@Autowired
	TokenService tokenService;
	
	@Autowired
	Environment env;
	//to access value 
	
	@GetMapping("/AuditBenchmark")
	//declaring an endpoint
	public ResponseEntity<?> getBenchmarkMap(@RequestHeader("Authorization") String token){
		List<AuditBenchmark> auditBenchmarkList = new ArrayList<AuditBenchmark>();
		//creating array list which can sore auditbenchmark type objects
		ResponseEntity<?> responseEntity=null;
		auditBenchmarkList.add(new AuditBenchmark("Internal", 3));
		// adding an auditbenchmark object to the list
		auditBenchmarkList.add(new AuditBenchmark("SOX", 1));
		if(tokenService.checkTokenValidity(token)) {
			//checking the token validity
			responseEntity = new ResponseEntity<List<AuditBenchmark>>(auditBenchmarkList,HttpStatus.OK);
			// when token is valid
		}else {
			// when token is not valid
			log.error(env.getProperty("string.token.exp")); 
			log.info(env.getProperty("string.end"));

			//responseEntity= new ResponseEntity<String>(env.getProperty("string.token.exp"),HttpStatus.FORBIDDEN);
			responseEntity = new ResponseEntity<List<AuditBenchmark>>(auditBenchmarkList,HttpStatus.OK);
			return responseEntity;
		}
		return responseEntity;
// returning the dictionary 
	}
}