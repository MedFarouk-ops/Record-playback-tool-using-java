package com.qatester.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InternetClasses {
	
	   private JFrame frame;
	   private JLabel headerLabel;
	   private JLabel statusLabel;
	   private JPanel controlPanel;
	   public InternetClasses(){
	      prepareGUI();
	   }
	   public static void main(String[] args){
		   InternetClasses swingControlDemo = new InternetClasses();
	      swingControlDemo.showButtonDemo();
	   }
	   private void prepareGUI(){
	      frame = new JFrame("Java Swing");
	      frame.setSize(500,500);
	      frame.setLayout(new GridLayout(3, 1));
	      frame.addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent windowEvent){
	            System.exit(0);
	         }
	      });
	      headerLabel = new JLabel("", JLabel.CENTER);
	      statusLabel = new JLabel("",JLabel.CENTER);
	      statusLabel.setSize(350,100);
	      controlPanel = new JPanel();
	      controlPanel.setLayout(new FlowLayout());
	      frame.add(headerLabel);
	      frame.add(controlPanel);
	      frame.add(statusLabel);
	      frame.setVisible(true);
	   }
	   private void showButtonDemo(){
	      headerLabel.setText("Button Demo");
	      JButton okButton = new JButton("OK");
	      okButton.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            statusLabel.setText("Ok Button is clicked here");
	         }
	      });
	      controlPanel.add(okButton);
	      frame.setVisible(true);
	   }
	}
