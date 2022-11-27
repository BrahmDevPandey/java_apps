package com.bd_codes;

import java.sql.ResultSet;
import java.sql.Statement;

public class Read {
	Statement statement;
	
	public Read() {
		statement = new ConnectionSetup().getConnectionStatement();
	}
	
	public void selectAllRecords(String tableName){
		String query = "SELECT * FROM " + tableName;
		try {
			ResultSet result =  statement.executeQuery(query);
			while(result.next()) {
				System.out.println(result.getString(1) + "\t" + result.getString(2));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
