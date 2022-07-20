package com.qatester.services;

public class TestCase {
	private String testName;
	private String testDescription;
	private String testFile;
	public TestCase() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestCase(String testName, String testDescription, String testFile) {
		super();
		this.testName = testName;
		this.testDescription = testDescription;
		this.testFile = testFile;
	}
	public String getTestName() {
		return testName;
	}
	public void setTestName(String testName) {
		this.testName = testName;
	}
	public String getTestDescription() {
		return testDescription;
	}
	public void setTestDescription(String testDescription) {
		this.testDescription = testDescription;
	}
	public String getTestFile() {
		return testFile;
	}
	public void setTestFile(String testFile) {
		this.testFile = testFile;
	}
	
}
