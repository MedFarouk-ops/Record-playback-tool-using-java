package com.qatester.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.qatester.services.QaServices;
import com.qatester.services.RecordingServices;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class RecordingGui extends JFrame {

	private RecordingServices recServices ; 
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordingGui frame = new RecordingGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 /**
	 * Create the frame.
	 */
	public RecordingGui() {

		initComponents();
		createEvents();
		// *********************************************************************
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Make new test case : ");
		
		JTextPane textPane = new JTextPane();
		
		JLabel lblNewLabel_1 = new JLabel("TEST CASE ID :");
		
		JLabel lblNewLabel_2 = new JLabel("Description :");
		
		JTextPane textPane_1 = new JTextPane();
		
		// Start recording UI actions on the screen : 
		JButton startRecording = new JButton("start recording");
		startRecording.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("creating new test case");
				JFrame f=new JFrame();
				recServices.startRecording(getTitle(), getName()); 
				//				
				
			//	if(recServices.getTestRecorderPath() == null ) {
//	            	JOptionPane.showMessageDialog(f,"Please provide a title and a \n description for the test case");
//	            }else {
//	            	recServices.runTestRecorder();
//	            }
			}
		});
		
		
		JButton btnStopRecording = new JButton("stop recording");
		
		JButton btnPlayRecording = new JButton("play recording");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(168, Short.MAX_VALUE)
					.addComponent(lblNewLabel)
					.addGap(151))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_1)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false) 
						.addComponent(textPane)
						.addComponent(textPane_1, GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
					.addContainerGap(35, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addComponent(startRecording)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(btnStopRecording, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPlayRecording, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(41)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(textPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2)
						.addComponent(textPane_1, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(startRecording)
						.addComponent(btnPlayRecording)
						.addComponent(btnStopRecording))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	

	private void createEvents() {
	}

	private void initComponents() {
		this.recServices = new RecordingServices();
	}
}
