package com.bd_codes;

import java.sql.Statement;

public class Insert {
	Statement statement;
	
	public Insert() {
		statement = new ConnectionSetup().getConnectionStatement();
	}
	
	public void insertRecord(String tableName, String values[]) {
		if(values.length <= 0) 
			return;
		int i;
		String query = "INSERT INTO " + tableName + " VALUES(";
		for(i = 0; i < values.length-1; i++) {
			query += values[i] + ",";
		}
		query += values[i] + ");";
		try {
			int count = statement.executeUpdate(query);
			if(count == 0) {
				System.out.println("Record not inserted.");
			} else {
				System.out.println("Record inserted successfully!");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
