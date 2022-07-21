package com.qatester.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.qatester.services.QaServices;

import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JMenu;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Button;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Choice;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSlider;

public class ProgramGui extends JFrame {

	private JPanel contentPane;
	private QaServices qaServices;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgramGui frame = new ProgramGui();
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
	public ProgramGui() {
		initComponents();
		createEvents();

		setTitle("QA TEST");
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));

		JButton btnNewButton = new JButton("Open Test Recorder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("opening test recorder");
				qaServices.runTestRecorder();
			}
		});

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));

		// button to export the test results :
		JButton exportResultBtn = new JButton("export test results");
		// Action method implementation for exporting test results
		exportResultBtn.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            System.out.println("Exporting test result ...");
	         }
	      });
		// label that shows the test results
		JLabel lblNewLabel_1 = new JLabel("List of Test results");

		JLabel lblNewLabel_4 = new JLabel("1 - test-user-defined.py : success");

		JLabel lblNewLabel_4_1 = new JLabel("test succeeded  : 3/5");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap(107, Short.MAX_VALUE)
						.addComponent(exportResultBtn).addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup().addGap(74).addComponent(lblNewLabel_1).addContainerGap(76,
						Short.MAX_VALUE))
				.addGroup(gl_panel_1.createSequentialGroup().addGap(25).addComponent(lblNewLabel_4).addContainerGap(50,
						Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup().addContainerGap(53, Short.MAX_VALUE)
						.addComponent(lblNewLabel_4_1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
						.addGap(22)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_1).addGap(18)
						.addComponent(lblNewLabel_4).addPreferredGap(ComponentPlacement.RELATED, 328, Short.MAX_VALUE)
						.addComponent(lblNewLabel_4_1).addGap(18).addComponent(exportResultBtn).addContainerGap()));
		panel_1.setLayout(gl_panel_1);

		JLabel lblNewLabel_2 = new JLabel("QA UI TEST");
		// Combobox that contains the list of the software to test
		JComboBox comboBox = new JComboBox();
		// adding items to combobox (dropdown list)
		
		
		
		// add button to add a software to the list
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            System.out.println("adding software to test");
	            qaServices.addSoftwareToTest();
	            refreshCombobox(comboBox);
	         }
	    });
		
		// label to select the software to test :
		JLabel lblNewLabel_3 = new JLabel("Select the software for testing :");
		
		//  button to select the software to test :
		
		JButton btnSelectTestRecorder = new JButton("Select Test Recorder");
		// Action method implementation for selecting the test recorder
		btnSelectTestRecorder.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            System.out.println("selecting test recorder...");
	            qaServices.selectTestRecorder();
	         }
	    });

		JProgressBar progressBar = new JProgressBar();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(362)
					.addComponent(lblNewLabel_2)
					.addContainerGap(356, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnSelectTestRecorder, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
							.addGap(42)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(22))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_2)
					.addGap(25)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSelectTestRecorder)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnNewButton)
							.addGap(30)
							.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(98, Short.MAX_VALUE))
		);

		JButton runSelectedTest = new JButton("run selected tests");
		// Action method implementation for running the selected tests
		runSelectedTest.addActionListener(new ActionListener() {
			         public void actionPerformed(ActionEvent e) {
			            System.out.println("running test cases...");
			            try {
							qaServices.runTestCases();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			         }
		});
				
		JLabel lblNewLabel = new JLabel("List of Test cases ");

		JCheckBox chckbxNewCheckBox = new JCheckBox("test-user-defined.py");
		// this button is for adding new test cases
		JButton addNewTestCase = new JButton("+");
		addNewTestCase.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            System.out.println("adding new test cases ...");
	            JFrame f=new JFrame();
	            if(qaServices.getSoftwares().size() <= 0) {
	            	JOptionPane.showMessageDialog(f,"Please select the software to test first");
	            }else {
	            	JOptionPane.showMessageDialog(f,"adding new test cases");
	            }
		     }
	});
			
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap(119, Short.MAX_VALUE)
							.addComponent(runSelectedTest))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
									.addComponent(addNewTestCase))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(addNewTestCase, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
					.addComponent(runSelectedTest)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

//		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

	private void createEvents() {
	}

	private void initComponents() {
		this.qaServices = new QaServices();
	}
	
	private void refreshCombobox(JComboBox comboBox) {
		int index = qaServices.getSoftwares().size()-1;
		
		comboBox.addItem(new ComboItem( qaServices.getSoftwares().get(index).getSoftwareName(),
				qaServices.getSoftwares().get(index).getSoftwareName()));
	}
}
