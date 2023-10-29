package com.bfpoms.bfpoms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tbl_renewalapprovedapplication")
public class RenewalbpApprovedApplicationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int renewalbp_id;
	
	private String bspermit_no;
	private String permittee;
	private String business_name;
	private String address;
	private String nature_business;
	private String type_occupancy;
	private String contact_no;
	private String email;
	private String date_received;
	
	//date of inspection and number
	private String date_inspection;
	private int inspection_no;

	//date of fsic and number
	private int fsic_no;
	private String fsic_date;
	
	//FSIF payment
	private int amount;
	private int or_no;
	private String date;
	
	//fire safety inspectors
	private String team_leader;
	private String fire_inspectors;
	private String [] recommendation;
	private String remarks;
	
	//constructor
	public RenewalbpApprovedApplicationEntity() {}

	public RenewalbpApprovedApplicationEntity(int renewalbp_id, String bspermit_no, String permittee,
			String business_name, String address, String nature_business, String type_occupancy, String contact_no,
			String email, String date_received, String date_inspection, int inspection_no, int fsic_no,
			String fsic_date, int amount, int or_no, String date, String team_leader, String fire_inspectors,
			String[] recommendation, String remarks) {
		super();
		this.renewalbp_id = renewalbp_id;
		this.bspermit_no = bspermit_no;
		this.permittee = permittee;
		this.business_name = business_name;
		this.address = address;
		this.nature_business = nature_business;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.email = email;
		this.date_received = date_received;
		this.date_inspection = date_inspection;
		this.inspection_no = inspection_no;
		this.fsic_no = fsic_no;
		this.fsic_date = fsic_date;
		this.amount = amount;
		this.or_no = or_no;
		this.date = date;
		this.team_leader = team_leader;
		this.fire_inspectors = fire_inspectors;
		this.recommendation = recommendation;
		this.remarks = remarks;
	}
	//getters and setters
	public int getRenewalbp_id() {
		return renewalbp_id;
	}

	//public void setRenewalbp_id(int renewalbp_id) {
		//this.renewalbp_id = renewalbp_id;
	//}

	public String getBspermit_no() {
		return bspermit_no;
	}

	public void setBspermit_no(String bspermit_no) {
		this.bspermit_no = bspermit_no;
	}

	public String getPermittee() {
		return permittee;
	}

	public void setPermittee(String permittee) {
		this.permittee = permittee;
	}

	public String getBusiness_name() {
		return business_name;
	}

	public void setBusiness_name(String business_name) {
		this.business_name = business_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNature_business() {
		return nature_business;
	}

	public void setNature_business(String nature_business) {
		this.nature_business = nature_business;
	}

	public String getType_occupancy() {
		return type_occupancy;
	}

	public void setType_occupancy(String type_occupancy) {
		this.type_occupancy = type_occupancy;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDate_received() {
		return date_received;
	}

	public void setDate_received(String date_received) {
		this.date_received = date_received;
	}

	public String getDate_inspection() {
		return date_inspection;
	}

	public void setDate_inspection(String date_inspection) {
		this.date_inspection = date_inspection;
	}

	public int getInspection_no() {
		return inspection_no;
	}

	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}

	public int getFsic_no() {
		return fsic_no;
	}

	public void setFsic_no(int fsic_no) {
		this.fsic_no = fsic_no;
	}

	public String getFsic_date() {
		return fsic_date;
	}

	public void setFsic_date(String fsic_date) {
		this.fsic_date = fsic_date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getOr_no() {
		return or_no;
	}

	public void setOr_no(int or_no) {
		this.or_no = or_no;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTeam_leader() {
		return team_leader;
	}

	public void setTeam_leader(String team_leader) {
		this.team_leader = team_leader;
	}

	public String getFire_inspectors() {
		return fire_inspectors;
	}

	public void setFire_inspectors(String fire_inspectors) {
		this.fire_inspectors = fire_inspectors;
	}

	public String[] getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String[] recommendation) {
		this.recommendation = recommendation;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	

}