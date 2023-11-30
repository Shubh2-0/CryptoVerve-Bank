
package com.masai;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.masai.Exception.UIExceptions;

import java.util.*;

public class Deposit extends JFrame{
    
    JTextField t1,t2;
    JButton b1,b2,b3;
    JLabel l1,l2,l3;
    String pin;
    
     
    Deposit(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("com/masai/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 10, 960, 1070);
        getContentPane().add(l3);
        
        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        b1 = new JButton("DEPOSIT");
        b1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		if(t1.getText().equals("")) {
        			
        			UIExceptions.displayEmptyError();
        			return;
        		} 
        		
        		int depositAmount = 0;
        		
        		try {
					
        			depositAmount = Integer.parseInt(t1.getText());
        			
				} catch (Exception e2) {
					
					UIExceptions.displayFormatError();
					t1.setText("");
					
				    return;
					
				}
        		
        		
        		
        		 
        		
        	}
        });
        b2 = new JButton("BACK");
        
        getContentPane().setLayout(null);
        
        l1.setBounds(190,350,400,35);
        l3.add(l1);
        
        t1.setBounds(190,420,320,25);
        l3.add(t1);
        
        b1.setBounds(390,588,150,35);
        l3.add(b1);
        
        b2.setBounds(390,633,150,35);
        l3.add(b2);
      
        setSize(960,1080);
        setUndecorated(true);
        setLocation(500,0);
        setVisible(true);
    }

    
    
    public static void main(String[] args){
        new Deposit("").setVisible(true);
    }



	
}