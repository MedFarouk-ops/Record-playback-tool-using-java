package com.qatester.gui;

import javax.swing.*;

public class gui extends JFrame {

	public gui(String title) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1500, 720);
//		JButton button = new JButton("Press");
//		this.getContentPane().add(button); // Adds Button to content pane of frame
	}

	public static void main(String args[]) {
		JFrame frame = new gui("QA-TEST");
		JLabel label = new JLabel("Welcome to QA-TEST!", JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		frame.add(label);
		frame.setVisible(true);
//		System.out.println(System.getProperty("os.name")); // Get the os name .
	}
	
}
