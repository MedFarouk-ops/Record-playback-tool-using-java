package com.qatester.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;

public class QaServices {

	private List<SoftwareToTest> softwares ; 
	private List<TestCase> tests;
	private String softwarePath;
	private String testRecorderPath;
	public static final String DIRECTORY = System.getProperty("user.home") + "/Downloads/";
	
	public QaServices() {
		super();
	}

	public void selectTestRecorder() {
		//select the test recorder path
		JFileChooser fileChooser = new JFileChooser();
		
		fileChooser.setCurrentDirectory(new File(DIRECTORY)); //sets current directory
		
		int response = fileChooser.showOpenDialog(null); //select file to open
		//int response = fileChooser.showSaveDialog(null); //select file to save
		
		if(response == JFileChooser.APPROVE_OPTION) {
			File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
			System.out.println(file);
			this.testRecorderPath = file.toString();
			System.out.println(testRecorderPath);
		}
		
	}
	
	public void runTestRecorder() {
		// check the os type (windows or linux)
		String osName = System.getProperty("os.name"); 
//		System.out.println(osName);
		if(osName.indexOf("Win") != -1) {
			System.out.println("windows");
			Runtime rs = Runtime.getRuntime();
			try {
				rs.exec(this.testRecorderPath);
			}
			catch (IOException e) {
				System.out.println(e);
			}
			
		}else {
			System.out.println("linux");
		}
	}

	public void addSoftwareToTest() {
		//select the software to test
		//create it and add it to the list
	}

	public void runTestCases() {

		// open the selected software
		// wait 10 seconds
		// start testing
	
	}

}
