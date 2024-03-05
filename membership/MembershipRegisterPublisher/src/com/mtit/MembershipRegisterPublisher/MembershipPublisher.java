package com.mtit.MembershipRegisterPublisher;
import java.util.List;

public interface MembershipPublisher {
	
	public String addMember(String member_ID, String fname, String lname, String contact_no, String mem_type, String valid_years);
	public List <Membership> getAllMembers();
	public void deleteMember(String member_ID);
}
