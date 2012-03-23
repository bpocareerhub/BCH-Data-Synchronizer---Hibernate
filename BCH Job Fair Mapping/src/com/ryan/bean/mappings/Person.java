package com.ryan.bean.mappings;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table (name="person")
@SecondaryTable (name="person_phone", pkJoinColumns=@PrimaryKeyJoinColumn(name="person_id"))
public class Person {
	
	@Column(name="user_id", unique=true, nullable=false)
	@GeneratedValue(generator="gen")
	@GenericGenerator(name="gen", strategy="foreign", parameters=@Parameter(name="property", value="user"))
	private long user_id;
	
	@Id
	@Column (name="person_id", unique=true, nullable=false)	
	private long person_id;

	@Column (name="first_name")
	private String first_name;
	
	@Column (name="last_name")
	private String last_name;

	@Column (name="created_date")
	private Date created_date;
	
	@Column (name="shifting_schedules")
	private boolean shifting_schedules;

	@Column (name="holidays_weekends")
	private boolean holidays_weekends;
	
	@Column (name="willing_to_relocate")
	private boolean willing_to_relocate;
	
	@Column (name="background_check")
	private boolean background_check;

	@Column (name="highest_educational_attainment")
	private String highest_educational_attainment = "";
	
	@Column (name="file_type") 
	private String file_type = "";

	@Column (name="privacy") 
	private boolean privacy;

	@Column (name="send_newsletter") 
	private boolean send_newsletter = false;

	@Column (name="job_alerts") 
	private boolean job_alerts = false;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;
	
	@Column (table="person_phone", name="phone_num")
	private String phone_number;
	
	@Column (table="person_phone", name="mobile_num")
	private String mobile_number;
	
	@Column (table="person_phone", name="created_date")
	private Date person_phone_created_date;
	
	@Column (table="person_phone", name="modified_date")
	private Date modified_date;
	
	public Date getPerson_phone_created_date() {
		return person_phone_created_date;
	}

	public void setPerson_phone_created_date(Date person_phone_created_date) {
		this.person_phone_created_date = person_phone_created_date;
	}
	
	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public Date getModified_date() {
		return modified_date;
	}

	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public long getPerson_id() {
		return person_id;
	}

	public void setPerson_id(long person_id) {
		this.person_id = person_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public boolean isShifting_schedules() {
		return shifting_schedules;
	}

	public void setShifting_schedules(boolean shifting_schedules) {
		this.shifting_schedules = shifting_schedules;
	}

	public boolean isHolidays_weekends() {
		return holidays_weekends;
	}

	public void setHolidays_weekends(boolean holidays_weekends) {
		this.holidays_weekends = holidays_weekends;
	}

	public boolean isWilling_to_relocate() {
		return willing_to_relocate;
	}

	public void setWilling_to_relocate(boolean willing_to_relocate) {
		this.willing_to_relocate = willing_to_relocate;
	}
	
	public boolean isBackground_check() {
		return background_check;
	}

	public void setBackground_check(boolean background_check) {
		this.background_check = background_check;
	}

	public String getHighest_educational_attainment() {
		return highest_educational_attainment;
	}

	public void setHighest_educational_attainment(
			String highest_educational_attainment) {
		this.highest_educational_attainment = highest_educational_attainment;
	}

	public String getFile_type() {
		return file_type;
	}

	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}
	
	public boolean getPrivacy() {
		return privacy;
	}

	public void setPrivacy(boolean privacy) {
		this.privacy = privacy;
	}

	public boolean getSend_newsletter() {
		return send_newsletter;
	}

	public void setSend_newsletter(boolean send_newsletter) {
		this.send_newsletter = send_newsletter;
	}

	public boolean isJob_alerts() {
		return job_alerts;
	}

	public void setJob_alerts(boolean job_alerts) {
		this.job_alerts = job_alerts;
	}

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", user_id=" + user_id
				+ ", first_name=" + first_name + ", last_name=" + last_name
				+ "]";
	}
}
