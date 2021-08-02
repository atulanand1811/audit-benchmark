package com.cts.benchmark.pojo;

// test class for AuditBenchmark
 
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.cts.benchmark.pojo.AuditBenchmark;

public class AuditBenchmarkTest {

	private AuditBenchmark benchmark;
	
	@Before
	public void setup() {
		benchmark = new AuditBenchmark("Internal", 3);
	}
	@Test
	public void testGetSetAccNoAnswers() {
		assertEquals(new Integer(3), benchmark.getAccNoAnswers());
		benchmark.setAccNoAnswers(1);
		assertEquals(new Integer(1), benchmark.getAccNoAnswers());
	}
	@Test
	public void testGetSetAuditType() {
		assertEquals("Internal", benchmark.getAuditType());
		benchmark.setAuditType("SOX");
		assertEquals("SOX", benchmark.getAuditType());
	}
	
}
