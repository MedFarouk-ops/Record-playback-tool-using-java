package com.qatester.services;

import java.util.List;

public class SoftwareToTest {
	
	private String softwareName; 
	private List<TestCase> testCases; 	
	
	public SoftwareToTest() {
		super();
	}

	public SoftwareToTest(String softwareName, List<TestCase> testCases) {
		super();
		this.softwareName = softwareName;
		this.testCases = testCases;
	}

	public String getSoftwareName() {
		return softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

	public List<TestCase> getTestCases() {
		return testCases;
	}

	public void setTestCases(List<TestCase> testCases) {
		this.testCases = testCases;
	}
	
}
