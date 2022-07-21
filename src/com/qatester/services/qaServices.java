package com.qatester.services;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;

public class QaServices {

	private List<SoftwareToTest> softwares = new ArrayList<>();
	private List<TestCase> tests = new ArrayList<>();
	private String softwarePath;
	private String testRecorderPath;
	public static final String DIRECTORY = System.getProperty("user.home") + "/Downloads/";
	public static final String SECOND_DIRECTORY = System.getProperty("user.home") + "/Desktop/";

	public QaServices() {
		super();
	}

	public void selectTestRecorder() {
		// select the test recorder path
		JFileChooser fileChooser = new JFileChooser();

		fileChooser.setCurrentDirectory(new File(DIRECTORY)); // sets current directory

		int response = fileChooser.showOpenDialog(null); // select file to open
		// int response = fileChooser.showSaveDialog(null); //select file to save

		if (response == JFileChooser.APPROVE_OPTION) {
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
		if (osName.indexOf("Win") != -1) {
			System.out.println("windows");
			Runtime rs = Runtime.getRuntime();
			try {
				rs.exec(this.testRecorderPath);
			} catch (IOException e) {
				System.out.println(e);
			}

		} else {
			System.out.println("linux");
		}
	}

	public void addSoftwareToTest() {
		// select the software to test
		// select the test recorder path
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File(SECOND_DIRECTORY)); // sets current directory
		int response = fileChooser.showOpenDialog(null); // select file to open
		// int response = fileChooser.showSaveDialog(null); //select file to save

		if (response == JFileChooser.APPROVE_OPTION) {
			File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
			System.out.println(file);
			this.softwarePath = file.toString();
			System.out.println(softwarePath);
			// create it and add it to the list
			SoftwareToTest sft = new SoftwareToTest(this.softwarePath, tests);
			System.out.println(sft.getSoftwareName());
			this.softwares.add(sft);
		}

	}

	public void runTestCases() throws InterruptedException {

		// open the selected software //

		// check the os type (windows or linux)
		String osName = System.getProperty("os.name");
		// System.out.println(osName);
		if (osName.indexOf("Win") != -1) {
			System.out.println("windows");
			Runtime rs = Runtime.getRuntime();
			try {
				// rs.exec(this.softwarePath);
				ProcessBuilder pb = new ProcessBuilder("cmd", "/c", this.softwarePath);
				Process p = pb.start();
				// p.waitFor();
			} catch (IOException e) {
				System.out.println(e);
			}

		} else {
			System.out.println("linux");
		}

		// wait 15 seconds for the program to start
		pause(15000);
		// start testing
		System.out.println("program started");
	}

	public static void pause(int ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			System.err.format("IOException: %s%n", e);
		}
	}

	public List<SoftwareToTest> getSoftwares() {
		return softwares;
	}

	public void setSoftwares(List<SoftwareToTest> softwares) {
		this.softwares = softwares;
	}

	public List<TestCase> getTests() {
		return tests;
	}

	public void setTests(List<TestCase> tests) {
		this.tests = tests;
	}
	
	
	

}
