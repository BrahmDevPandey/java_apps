package com.bd_codes;

import java.sql.Statement;

public class Update {
	Statement statement;
	
	public Update() {
		statement = new ConnectionSetup().getConnectionStatement();
	}
	
	public void updateRecord(String tableName, String colName, String newValue, String checkColName, String checkColValue) {
		String query = "UPDATE " + tableName + " SET " + colName + " = " + newValue + " WHERE " + checkColName + " = " + checkColValue + ";";
//		System.out.println(query);
		try {
			int count = statement.executeUpdate(query);
			if(count == 0) {
				System.out.println("Record not updated.");
			} else {
				System.out.println("Record updated successfully!");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
