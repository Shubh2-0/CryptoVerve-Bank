package com.masai.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SignupForm1 {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int SignupFormID;
	    
	    @Column(name = "form_number")
	    private long formNo;
	    private String name;
	    private String fatherName;
	    private String dob;
	    private String gender;
	    private String email;
	    private String maritalStatus;
	    private String address;
	    private String city;
	    private String pincode;
	    private String state;
	
	    @OneToOne
	    @JoinColumn(name = "user_id")
	    private User user;


}
