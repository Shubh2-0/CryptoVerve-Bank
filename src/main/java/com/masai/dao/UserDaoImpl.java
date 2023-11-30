package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.Exception.TransactionException;
import com.masai.Exception.UserException;
import com.masai.Utils.DB_Utils;
import com.masai.models.Transactions;
import com.masai.models.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean depositeMoney(int id, double money) throws UserException {
		
		EntityManager emf = DB_Utils.getConnection();
		
		User  user = emf.find(User.class, id);
		
		if(user==null)
			throw new UserException("User is not found this that id "+id);
		
		emf.getTransaction().begin();
		user.setBalance(user.getBalance()+money);
		emf.close();
		return true;
	}

	@Override
	public List<Transactions> getAllTransactions(int id) throws TransactionException, UserException {

		EntityManager emf = DB_Utils.getConnection();
		
		User  user = emf.find(User.class, id);
		
		if(user==null)
			throw new UserException("User is not found this that id "+id);
		
		if(user.getTransactions() == null || user.getTransactions().size()==0)
			throw new TransactionException("No transaction found with that user : "+id);
		
		return user.getTransactions();
	}

	@Override
	public double getBalance(int id) throws UserException {

EntityManager emf = DB_Utils.getConnection();
		
		User  user = emf.find(User.class, id);
		
		if(user==null)
			throw new UserException("User is not found this that id "+id);
		
		
		return user.getBalance();
	}

}
