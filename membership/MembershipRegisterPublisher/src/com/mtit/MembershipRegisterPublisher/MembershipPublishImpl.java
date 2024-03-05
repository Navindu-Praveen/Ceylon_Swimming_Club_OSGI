package com.mtit.MembershipRegisterPublisher;

import java.util.ArrayList;
import java.util.List;

public class MembershipPublishImpl implements MembershipPublisher {

	public List<Membership> memberships = new ArrayList<Membership>();

	// adding a new record
	@Override
	public String addMember(String member_ID, String fname, String lname, String contact_no, String mem_type,
			String valid_years) {
		Membership membership = new Membership(member_ID, fname, lname, contact_no, mem_type, valid_years);
		memberships.add(membership);
		return membership.getFname() + " " + membership.getLname() + " " + "registered successfully \nMembership Type: "
				+ membership.getmem_type();

	}

	// Get all records
	@Override
	public List<Membership> getAllMembers() {
		return memberships;

	}

	// Delete Record
	@Override
	public void deleteMember(String member_ID) {
		for (Membership membership : memberships) {
			if (membership.getmember_ID().equalsIgnoreCase(member_ID)) {
				int id = memberships.indexOf(membership);
				memberships.remove(id);
				System.out.println();
				System.out.println("Member Details Deleted Successfully");
				return;
			}
		}

	}

}
