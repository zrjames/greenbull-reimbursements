package com.greenbull.dao;

import java.util.ArrayList;

import com.greenbull.users.Reimbursements;

public interface ReimbDAO {

	//CREATE
	//public int insertReimbursement(User u);
	
	//READ
	public ArrayList<Reimbursements> readReimbursementsByUserID(int uid);
	
	//UPDATE
	//public int updateUser(String username);
	
	//unused? here for prosperity
	//DELETE
}
