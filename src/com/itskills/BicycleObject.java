package com.itskills;

import java.sql.Savepoint;

public class BicycleObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MYSQLDBConnection object = new MYSQLDBConnection();
		
		
		DbConnection dbConnection = (DbConnection) object;
		SecureConnect secureConnect = (SecureConnect) object;
		
		
		
		saveEmployee(dbConnection);
		secure(secureConnect);
		
		
	}
	
	public static void saveEmployee(DbConnection connection){
		connection.connect();
		connection.authnticate();
		connection.createDB();
	}
	
	
	public static void secure(SecureConnect secure){
		secure.encrypt();
	}


}