package com.greenbull.users;

public class Reimbursements {

	/*
	 * Fields
	 */
	
	/*
	CREATE TABLE REIMBURSEMENTS (
	    REIMBURSEMENT_ID INTEGER PRIMARY KEY,
	    STATUS INTEGER DEFAULT 0,
	    USER_ID INTEGER NOT NULL,
	    COURSE_ID INTEGER NOT NULL,
	    COURSE_LOCATION VARCHAR2(40) NOT NULL,
	    WORK_DESCRIPTION VARCHAR2(320) NOT NULL,
	    APPROVAL_TYPE INTEGER,
	    AMOUNT INTEGER DEFAULT 0,
	    EVENT_TYPE_ID INTEGER DEFAULT 0,
	    APPROVED_SUPERVISOR INTEGER DEFAULT 0,
	    APPROVED_DEPTHEAD INTEGER DEFAULT 0,
	    APPROVED_BENCO INTEGER DEFAULT 0,
	    APPROVED_BENCOSUPERVISOR INTEGER DEFAULT 0,
	    DATE_MADE DATE 
	 */
	
	int id;
	int status;
	int user_id;
	
	int course_id;
	String course_location;
	String work_description;
	int approval_type;
	int event_type_id;
	
	int app_supervisor;
	int app_depthead;
	int app_benco;
	int app_bencosupervisor;
	String date_made;
	
	/*
	 * Constructors
	 */
	
	public Reimbursements() {
		super();
	}
	
	public Reimbursements(int id, int status, int user_id) {
		super();
		this.id = id;
		this.status = status;
		this.user_id = user_id;
	}

	public Reimbursements(int id, int status, int user_id, int course_id, String course_location,
			String work_description, int approval_type, int event_type_id, int app_supervisor, int app_depthead,
			int app_benco, int app_bencosupervisor, String date_made) {
		super();
		this.id = id;
		this.status = status;
		this.user_id = user_id;
		this.course_id = course_id;
		this.course_location = course_location;
		this.work_description = work_description;
		this.approval_type = approval_type;
		this.event_type_id = event_type_id;
		this.app_supervisor = app_supervisor;
		this.app_depthead = app_depthead;
		this.app_benco = app_benco;
		this.app_bencosupervisor = app_bencosupervisor;
		this.date_made = date_made;
	}

	
	/*
	 * Fields
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_location() {
		return course_location;
	}

	public void setCourse_location(String course_location) {
		this.course_location = course_location;
	}

	public String getWork_description() {
		return work_description;
	}

	public void setWork_description(String work_description) {
		this.work_description = work_description;
	}

	public int getApproval_type() {
		return approval_type;
	}

	public void setApproval_type(int approval_type) {
		this.approval_type = approval_type;
	}

	public int getEvent_type_id() {
		return event_type_id;
	}

	public void setEvent_type_id(int event_type_id) {
		this.event_type_id = event_type_id;
	}

	public int getApp_supervisor() {
		return app_supervisor;
	}

	public void setApp_supervisor(int app_supervisor) {
		this.app_supervisor = app_supervisor;
	}

	public int getApp_depthead() {
		return app_depthead;
	}

	public void setApp_depthead(int app_depthead) {
		this.app_depthead = app_depthead;
	}

	public int getApp_benco() {
		return app_benco;
	}

	public void setApp_benco(int app_benco) {
		this.app_benco = app_benco;
	}

	public int getApp_bencosupervisor() {
		return app_bencosupervisor;
	}

	public void setApp_bencosupervisor(int app_bencosupervisor) {
		this.app_bencosupervisor = app_bencosupervisor;
	}

	public String getDate_made() {
		return date_made;
	}

	public void setDate_made(String date_made) {
		this.date_made = date_made;
	}

	@Override
	public String toString() {
		return "Reimbursements [id=" + id + ", status=" + status + ", user_id=" + user_id + ", course_id=" + course_id
				+ ", course_location=" + course_location + ", work_description=" + work_description + ", approval_type="
				+ approval_type + ", event_type_id=" + event_type_id + ", app_supervisor=" + app_supervisor
				+ ", app_depthead=" + app_depthead + ", app_benco=" + app_benco + ", app_bencosupervisor="
				+ app_bencosupervisor + ", date_made=" + date_made + "]";
	}
	
	
}
