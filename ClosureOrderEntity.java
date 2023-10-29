package com.bfpoms.bfpoms.Entity;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "table_closureorder")
public class ClosureOrderEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int co_id;
	
	//basic information
	private int control_no;
	private String bldgpermit_no;
	private String applicants_name;
	private String project_name;
	private String address;
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
	private String abatement_date;
	private int abatement_no;
	private String closure_date;
	private int closure_no;
	
	//fire safety inspectors
	private String team_leader;
	private String fire_inspectors;
	private ArrayList<String[]> defects;
	
	private String administrative_fine;
	private String status;
	
	
	//constructor
	public ClosureOrderEntity() {}


	public ClosureOrderEntity(int co_id, int control_no, String bldgpermit_no, String applicants_name,
			String project_name, String address, String type_occupancy, String contact_no, String email,
			String date_received, String date_inspected, int inspection_no, String ntc_date, int ntc_no,
			String ntcv_date, int ntcv_no, String abatement_date, int abatement_no, String closure_date, int closure_no,
			String team_leader, String fire_inspectors, ArrayList<String[]> defects, String administrative_fine,
			String status) {
		super();
		this.co_id = co_id;
		this.control_no = control_no;
		this.bldgpermit_no = bldgpermit_no;
		this.applicants_name = applicants_name;
		this.project_name = project_name;
		this.address = address;
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
		this.abatement_date = abatement_date;
		this.abatement_no = abatement_no;
		this.closure_date = closure_date;
		this.closure_no = closure_no;
		this.team_leader = team_leader;
		this.fire_inspectors = fire_inspectors;
		this.defects = defects;
		this.administrative_fine = administrative_fine;
		this.status = status;
	}


	//getters and setters
	public int getCo_id() {
		return co_id;
	}


	//public void setCo_id(int co_id) {
		//this.co_id = co_id;
	//}


	public int getControl_no() {
		return control_no;
	}


	public void setControl_no(int control_no) {
		this.control_no = control_no;
	}


	public String getBldgpermit_no() {
		return bldgpermit_no;
	}


	public void setBldgpermit_no(String bldgpermit_no) {
		this.bldgpermit_no = bldgpermit_no;
	}


	public String getApplicants_name() {
		return applicants_name;
	}


	public void setApplicants_name(String applicants_name) {
		this.applicants_name = applicants_name;
	}


	public String getProject_name() {
		return project_name;
	}


	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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


	public String getAbatement_date() {
		return abatement_date;
	}


	public void setAbatement_date(String abatement_date) {
		this.abatement_date = abatement_date;
	}


	public int getAbatement_no() {
		return abatement_no;
	}


	public void setAbatement_no(int abatement_no) {
		this.abatement_no = abatement_no;
	}


	public String getClosure_date() {
		return closure_date;
	}


	public void setClosure_date(String closure_date) {
		this.closure_date = closure_date;
	}


	public int getClosure_no() {
		return closure_no;
	}


	public void setClosure_no(int closure_no) {
		this.closure_no = closure_no;
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


	public String getAdministrative_fine() {
		return administrative_fine;
	}


	public void setAdministrative_fine(String administrative_fine) {
		this.administrative_fine = administrative_fine;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
