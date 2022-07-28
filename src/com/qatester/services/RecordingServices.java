package com.qatester.services;

public class RecordingServices {

	private TestCase test1;
	public RecordingServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void startRecording(String title , String description) {
		// start recording and creating the file script
		// first we will create an instance of the TestCase object : 
		this.test1 =new TestCase();
		test1.setTestName(title);
		test1.setTestDescription(description);
		// then we start recording the mouse and keyboard actions after opening the selected software to test //
		
		
		//  // 
	}

	public void stopRecording() {
		// stop recording and save the file
	}

	public void exportRecording() {
		// save the file in local storage
	}
	
	public void replayRecording() {
		
		// replay recording // 
		test1.execute();
		
	}

}
