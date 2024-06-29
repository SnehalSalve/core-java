package com.product.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {

	public static EntityManagerFactory data() {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("UserDB");
		return emFactory; 
		
	}
}
