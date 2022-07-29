package com.qatester.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.qatester.listener.QaEventListener;

public class RecordingServices {

	private TestCase test1;
	private String testRecord; 
	QaEventListener testCaseEvent = new QaEventListener("");
	private QaScreenActions qaScreenAction = new QaScreenActions();
	public RecordingServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void startRecording(String title , String description) {
		
		
		// start recording and creating the file script //
		// first we will create an instance of the TestCase object : //
		this.testRecord = " ---- ";
		this.test1 =new TestCase();
		test1.setTestName(title);
		test1.setTestDescription(description);
		// then we start recording the mouse and keyboard actions after opening the selected software to test //
		initialiseGlobalScreen();
		
		GlobalScreen.addNativeMouseListener(testCaseEvent);
		GlobalScreen.addNativeMouseMotionListener(testCaseEvent);
		GlobalScreen.addNativeKeyListener(testCaseEvent);
		
		
		// ********** *********** ********** ********** ********** ********** ******** ********** // 
	}
	
	
	public void showTestResult() {
		System.out.println("*********** Test script file is created ********** \n check your files");
		Random rand = new Random(); //instance of random class
	    int upperbound = 4000;
	        //generate random values from 0-4000
	    int int_random = rand.nextInt(upperbound); 
		File output = new File("C:/Users/user/eclipse-workspace/QA UI TESTER/src/com/qatester/tests/TC-"+int_random+".txt");
		try {
			FileWriter writer = new FileWriter(output);
			writer.write(testCaseEvent.getTestScript());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
