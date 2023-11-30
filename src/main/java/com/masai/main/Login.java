package com.masai.main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.masai.Exception.LoginException;
import com.masai.Exception.UIExceptions;
import com.masai.models.User;

import java.sql.*;

public class Login extends JFrame implements ActionListener {
	JLabel l1, l2, l3;
	JButton b1, b2, b3;
	public static User user;
	private JTextField textField;
	private JTextField textField_1;

 
	Login() {
		getContentPane().setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		setTitle("AUTOMATED TELLER MACHINE");
      
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(176, 10, 100, 105);
		getContentPane().add(lblNewLabel);
		 
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/masai/icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 70, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		lblNewLabel.setIcon(i3);
		

		l1 = new JLabel("WELCOME TO ATM");
		l1.setForeground(SystemColor.desktop);
		l1.setFont(new Font("Bahnschrift", Font.BOLD, 45));
		l1.setBounds(270, 27, 458, 70);
		getContentPane().add(l1);

		l2 = new JLabel("Card No:");
		l2.setForeground(SystemColor.desktop);
		l2.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		l2.setBounds(125, 150, 174, 30);
		getContentPane().add(l2);

		l3 = new JLabel("PIN:");
		l3.setForeground(SystemColor.desktop);
		l3.setFont(new Font("Bahnschrift", Font.BOLD, 30));
		l3.setBounds(125, 220, 174, 30);
		getContentPane().add(l3);

		b1 = new JButton("SIGN IN");
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);

		b2 = new JButton("CLEAR");
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);

		b3 = new JButton("SIGN UP");
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);

		getContentPane().setLayout(null);

		b1.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		b1.setBounds(300, 290, 117, 40);
		getContentPane().add(b1);

		b2.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		b2.setBounds(555, 290, 100, 40);
		getContentPane().add(b2);

		b3.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		b3.setBounds(363, 350, 230, 40);
		getContentPane().add(b3);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		getContentPane().setBackground(new Color(250, 128, 114));
		
		textField = new JTextField(15);
		textField.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		textField.setBounds(300, 140, 355, 40);
		getContentPane().add(textField);
		
		textField_1 = new JTextField(15);
		textField_1.setFont(new Font("Bahnschrift", Font.BOLD, 25));
		textField_1.setBounds(300, 210, 355, 40);
		getContentPane().add(textField_1);
		
	

		setSize(800, 480);
		setLocation(550, 200);
		setVisible(true);

	}


	public static void main(String[] args) {
		new Login().setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	
		String cardNumber = null;
		String pin = null;
		
		cardNumber = cardNumber.trim();
		pin = pin.trim();
		
		if(cardNumber.length()!= 16 || pin.length()!=4) {
			
			
		}
			
			
		
		cardNumber = textField.getText();
		pin = textField_1.getText();
		
		String nums = "1234567890";
		
		 for(Character el : cardNumber)
			 if(nums.indexOf(el))
				 
		
			
		
		
		
		
		
		
		
	}
}
