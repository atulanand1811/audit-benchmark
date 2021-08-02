package com.cts.benchmark.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AuditBenchmark {

	private String auditType;
	//auditype can be internal or SOX
	private Integer accNoAnswers;
	// no of NO 
	
}
//This POJO class is used to handle audit type[internal or sox] and accNOacceptable no of NO allowed in particular benchmark