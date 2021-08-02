package com.cts.benchmark.pojo;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomErrorResponse {

	
	private LocalDateTime timestamp;
	
	// to store the time  when the exception occured
	
	private HttpStatus status;
	
	private String reason;
	// holds why the exception has occured
	
	private String message;
	// holds the message which is retrieved from the constructor  of exception class
}
