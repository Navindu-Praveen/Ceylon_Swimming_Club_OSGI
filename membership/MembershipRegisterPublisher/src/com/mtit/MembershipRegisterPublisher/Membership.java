package com.mtit.MembershipRegisterPublisher;

public class Membership {

	private String member_ID;
	private String fname;
	private String lname;
	private String contact_no;
	private String mem_type;
	private String valid_years;
	
	public Membership(String member_ID, String fname, String lname, String contact_no, String mem_type, String valid_years) {
		super();
		this.member_ID = member_ID;
		this.fname = fname;
		this.lname = lname;
		this.contact_no = contact_no;
		this.mem_type = mem_type;
		this.valid_years = valid_years;
	}
	
	//Getters 
	
	public String getmember_ID() {
		return member_ID;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getContact_no() {
		return contact_no;
	}
	public String getmem_type() {
		return mem_type;
	}
	public String getvalid_years() {
		return valid_years;
	}
	
	//Setters
	
	public void setmember_ID(String member_ID) {
		this.member_ID = member_ID;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	public void setmem_type(String mem_type) {
		this.mem_type = mem_type;
	}
	public void setvalid_years(String valid_years) {
		this.valid_years = valid_years;
	}
	
	


	


}
