package com.bd_codes;

public class Main {
	public static void main(String[] args) {
//		Insert insert = new Insert();
//		insert.insertRecord("employee", new String[] {"1", "\"Aman Pandey\""});
//		insert.insertRecord("employee", new String[] {"2", "\"Bikki Pandey\""});
//		insert.insertRecord("employee", new String[] {"3", "\"Guddi Tiwari\""});
//		insert.insertRecord("employee", new String[] {"4", "\"Anubhav Pandey\""});
//		insert.insertRecord("employee", new String[] {"5", "\"Adarsh Baghel\""});
		
		Read readObj = new Read();
		readObj.selectAllRecords("employee");
		
		Update updateObj = new Update();
		updateObj.updateRecord("employee", "empname", "\"Ajay Kumar\"", "empname", "\"Aman Pandey\"");
		
		Delete deleteObj = new Delete();
		deleteObj.deleteRecord("employee", "empname", "\"Ajay Kumar\"");
		readObj.selectAllRecords("employee");
	}
}
