package com.greenbull.users;

/*
 * Base class for storing data for the current user 
 * Can be an employee, Direct supervisor, dept manager, or a BenCo Man
 */
public class User {
	
	/*
	 * Fields
	 */
	
	
	/*from our Database:
	USER_ID INTEGER PRIMARY KEY NOT NULL,
    USER_NAME VARCHAR(20) UNIQUE NOT NULL,
    PASS_WORD VARCHAR(20) NOT NULL,
    TYPE_OF_ID INTEGER DEFAULT 0,
    REPORTS_TO INTEGER DEFAULT 0,
    FIRST_NAME VARCHAR(24) NOT NULL,
    LAST_NAME VARCHAR(24) NOT NULL,
    
    --could this be separated into a table for employees?
    PENDING_REIMBURSEMENTS INTEGER DEFAULT 0,
    AWARDED_REIMBURSEMENTS INTEGER DEFAULT 0
	 */
	String username;
	String password;
	int id;
	
	/*
	 * Constructor
	 */
	public User() {
		super();
	}


	/*
	 * Getters/Setters
	 */
	
	public User(String username, String password, int id) {
		super();
		this.username = username;
		this.password = password;
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	
}
