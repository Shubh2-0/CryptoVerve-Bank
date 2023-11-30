package com.masai.dao;

import java.util.List;

import com.masai.Exception.TransactionException;
import com.masai.Exception.UserException;
import com.masai.models.Transactions;

public interface UserDao {
	
	 public boolean depositeMoney(int id, double money) throws UserException;
	 
	 public List<Transactions> getAllTransactions(int id) throws TransactionException, UserException;
	 
	 public double getBalance(int id) throws UserException;

}
