package com.masai.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "user_id")
        private int UserId; 
	    private String cardNumber;
	    private String pin;
	    private double balance;
	    
	    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	    private SignupForm1 signup;
	    
	    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	    private SignupForm1 signupTwo;
	    
	    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	    private SignupForm1 signupThree;
	 
	    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	    private List<Transactions> transactions;


}
