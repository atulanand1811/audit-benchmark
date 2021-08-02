package com.cts.benchmark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthResponse {
	private String uid;
	private boolean isValid;
	// holds whether a token is valid or not
	

}
