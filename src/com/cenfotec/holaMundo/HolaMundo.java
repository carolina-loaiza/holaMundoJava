package com.cenfotec.holaMundo;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class HolaMundo {
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaMundo window = new HolaMundo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public HolaMundo() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Font font = new Font("Verdana", Font.BOLD, 24);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(font);
		lblName.setBounds(20, 31, 100, 30);
		frame.getContentPane().add(lblName);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Select");
		comboBox.addItem("Business");
		comboBox.addItem("Engineer");
		comboBox.addItem("Doctor");
		comboBox.addItem("Student");
		comboBox.addItem("Others");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		comboBox.setBounds(18, 80, 120, 20);
		frame.getContentPane().add(comboBox);
	}
}

