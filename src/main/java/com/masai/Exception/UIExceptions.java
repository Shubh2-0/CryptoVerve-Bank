package com.masai.Exception;

import javax.swing.JOptionPane;

public class UIExceptions{
	
	
	
	public static void displayEmptyError(){
		
		 JOptionPane.showMessageDialog(null, "Field cannot be empty", "Empty Field", JOptionPane.WARNING_MESSAGE);
	 
		  
		 return;
		
	}
	
	
	public static void displayFormatError(){
		
		 JOptionPane.showMessageDialog(null, "Amount must be in numeric format","Invalid", JOptionPane.ERROR_MESSAGE);
	
		
	}
	
	
	
	
	
	
	

}
