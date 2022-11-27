package com.bd_codes;

import java.sql.Statement;

public class Delete {
	Statement statement;
	
	public Delete() {
		statement = new ConnectionSetup().getConnectionStatement();
	}
	
	public void deleteRecord(String tableName, String checkColName, String checkColValue) {
		String query = "DELETE FROM " + tableName + " WHERE " + checkColName + " = " + checkColValue + ";";
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
