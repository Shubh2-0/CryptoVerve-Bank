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
public class SignupForm2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int SignupFormID;

	@Column(name = "form_number")
	private long formNo;
	private String religion;
	private String category;
	private String income;
	private String education;
	private String occupation;
	private String pan;
	private String aadhar;
	private String seniorCitizen;
	private String existingAccount;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

}
