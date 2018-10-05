package com.greenbull.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.greenbull.users.User;

public class UserDAOImpl implements UserDAO {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//set up connection to the database
	private static String url = "jdbc:oracle:thin:@reimbursemant-database.c79flqc2drgd.us-east-2.rds.amazonaws.com:1521:ORCL";
	private static String uname = "greenbull";
	private static String password = "zackattack";
	
	
	@Override
	public User readUserByUsername(String username) {
		//prep our new class instance to null
		User user = null;
		
		//connect to database
		try(Connection conn = DriverManager.getConnection(url, uname, password)){
			//SQL statement - should get one data entry
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM REIMB_WORKERS WHERE USER_NAME = ?");
			//plugs in our variable
			ps.setString(1, username);
			//get from database
			ResultSet rs = ps.executeQuery();
			
			//fill our instance with the db data
			while(rs.next()) {
				user = new User(rs.getString("USER_NAME"), rs.getString("PASS_WORD"), rs.getInt("USER_ID"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//returns an instance of User class
		return user;
	}

	
	//do we NEED this?
	@Override
	public List<User> readAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
