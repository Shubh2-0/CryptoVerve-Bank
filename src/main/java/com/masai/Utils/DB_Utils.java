package com.masai.Utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DB_Utils {

	static final EntityManagerFactory emf;
	
	
	static {
		
		emf = Persistence.createEntityManagerFactory("bankingsystem");
		
	}
	
	
	public static EntityManager getConnection() {
		
		return emf.createEntityManager();
	}
	
	public static void main(String[] args) {
		
		System.out.println(DB_Utils.getConnection());;
		
	}
	
	
}
