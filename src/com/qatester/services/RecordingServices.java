package com.qatester.services;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.qatester.listener.QaEventListener;

public class RecordingServices {

	private TestCase test1;
	public RecordingServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void startRecording(String title , String description) {
		
		String testRecord ; 
		
		// start recording and creating the file script
		// first we will create an instance of the TestCase object : 
		this.test1 =new TestCase();
		test1.setTestName(title);
		test1.setTestDescription(description);
		// then we start recording the mouse and keyboard actions after opening the selected software to test //
		initialiseGlobalScreen();
		QaEventListener testCaseEvent = new QaEventListener();
		GlobalScreen.addNativeMouseListener(testCaseEvent);
		GlobalScreen.addNativeMouseMotionListener(testCaseEvent);
		GlobalScreen.addNativeKeyListener(testCaseEvent);
		//  // 
		
	}
	
	public void initialiseGlobalScreen() {
		try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());
			System.exit(1);
		}
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
