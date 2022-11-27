package com.bd_codes;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSetup {
	Connection con;
	public ConnectionSetup() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system", "root", "Mysql@aman123");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}		
	}
	
	public Statement getConnectionStatement() {
		Statement statement = null;
		try {
			statement = con.createStatement();			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			return statement;
		}
	}
}
