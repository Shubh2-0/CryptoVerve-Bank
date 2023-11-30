package com.masai.models;


import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transactions {
	
       
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long transactionId;
	    private Date date;
	    
	    @Enumerated(EnumType.STRING)
	    private TransactionType type;
	   
	    private BigDecimal amount;

	    @ManyToOne
	    @JoinColumn(name = "user_id")
	    private User user;
	


}
