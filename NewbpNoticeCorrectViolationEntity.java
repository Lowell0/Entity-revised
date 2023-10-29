package com.bfpoms.bfpoms.Entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "tbl_newbpcorrectviolation")
public class NewbpNoticeCorrectViolationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int newncv_id;
	
	//basic information
	private String bspermit_no;
	private String permittee;
	private String business_name;
	private String address;
	private String nature_business;
	private String type_occupancy;
	private String contact_no;
	private String email;
	private String date_received;
	
	//date inspected
	private String date_inspected;
	private int inspection_no;
	private String ntc_date;
	private int ntc_no;
	private String ntcv_date;
	private int ntcv_no;
	
	//fire safety inspectors
	private String team_leader;
	private String fire_inspectors;
	private ArrayList<String[]> defects;
	
	//date ntcv received
	private String name;
	private String date;
	private String administrative_fine;
	private int amount;
	private String status;
	
	//constructor
	public NewbpNoticeCorrectViolationEntity() {}

	public NewbpNoticeCorrectViolationEntity(int newncv_id, String bspermit_no, String permittee, String business_name,
			String address, String nature_business, String type_occupancy, String contact_no, String email,
			String date_received, String date_inspected, int inspection_no, String ntc_date, int ntc_no,
			String ntcv_date, int ntcv_no, String team_leader, String fire_inspectors, ArrayList<String[]> defects,
			String name, String date, String administrative_fine, int amount, String status) {
		super();
		this.newncv_id = newncv_id;
		this.bspermit_no = bspermit_no;
		this.permittee = permittee;
		this.business_name = business_name;
		this.address = address;
		this.nature_business = nature_business;
		this.type_occupancy = type_occupancy;
		this.contact_no = contact_no;
		this.email = email;
		this.date_received = date_received;
		this.date_inspected = date_inspected;
		this.inspection_no = inspection_no;
		this.ntc_date = ntc_date;
		this.ntc_no = ntc_no;
		this.ntcv_date = ntcv_date;
		this.ntcv_no = ntcv_no;
		this.team_leader = team_leader;
		this.fire_inspectors = fire_inspectors;
		this.defects = defects;
		this.name = name;
		this.date = date;
		this.administrative_fine = administrative_fine;
		this.amount = amount;
		this.status = status;
	}
	//getters and setters
	public int getNewncv_id() {
		return newncv_id;
	}

	//public void setNewncv_id(int newncv_id) {
		//this.newncv_id = newncv_id;
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

	public String getDate_inspected() {
		return date_inspected;
	}

	public void setDate_inspected(String date_inspected) {
		this.date_inspected = date_inspected;
	}

	public int getInspection_no() {
		return inspection_no;
	}

	public void setInspection_no(int inspection_no) {
		this.inspection_no = inspection_no;
	}

	public String getNtc_date() {
		return ntc_date;
	}

	public void setNtc_date(String ntc_date) {
		this.ntc_date = ntc_date;
	}

	public int getNtc_no() {
		return ntc_no;
	}

	public void setNtc_no(int ntc_no) {
		this.ntc_no = ntc_no;
	}

	public String getNtcv_date() {
		return ntcv_date;
	}

	public void setNtcv_date(String ntcv_date) {
		this.ntcv_date = ntcv_date;
	}

	public int getNtcv_no() {
		return ntcv_no;
	}

	public void setNtcv_no(int ntcv_no) {
		this.ntcv_no = ntcv_no;
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

	public ArrayList<String[]> getDefects() {
		return defects;
	}

	public void setDefects(ArrayList<String[]> defects) {
		this.defects = defects;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAdministrative_fine() {
		return administrative_fine;
	}

	public void setAdministrative_fine(String administrative_fine) {
		this.administrative_fine = administrative_fine;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
