package com.bch.bean.mappings;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

import com.bch.bom.DateTime;

@Entity
@Table (name="users")
@SecondaryTables ({
@SecondaryTable (name="user_profile", pkJoinColumns=@PrimaryKeyJoinColumn(name="user_id")), 
@SecondaryTable (name="user_settings", pkJoinColumns=@PrimaryKeyJoinColumn(name="user_id")),
@SecondaryTable (name="user_profile_detail", pkJoinColumns=@PrimaryKeyJoinColumn(name="user_id"))
})
public class User {
	@Id
	@GeneratedValue
	@Column (name="user_id", unique=true, updatable=false, insertable=false)
	private long user_id;
	
	
	@Column (name="group_id")
	private int group_id;
	
	@Column (name="parent_user_id")
	private int parent_user_id;
	
	@Column (name="account_type_id")
	private int account_type_id;
	
	@Column (name="email")
	private String email = "";
	
	@Column (name="password")
	private String password = "";
	
	@Column (name="date_created")
	private Date date_created = DateTime.getCurrentSQLDate();
	
	@Column (name="date_last_login")
	private Date date_last_login;
	
	@Column (name="activation_code")
	private String activation_code = "";
	
	@Column (name="activated")
	private boolean activated = false;
	
	@Column (name="date_activated", nullable=true)
	private Date date_activated;
	
	@Column (name="registration_id")
	private int registration_id;
	
	@Column (name="active")
	private boolean active = true;
	
	@Column (name="flag")
	private boolean flag = false;
	
	@Column (table="user_profile", name="alternate_email")
	private String alternate_email;
	
	@Column (table="user_profile", name="firstname")
	private String firstname = "";
	
	@Column (table="user_profile", name="middlename")
	private String middlename = "";
	
	@Column (table="user_profile", name="lastname")
	private String lastname = "";
	
	@Column (table="user_profile", name="date_of_birth")
	private Date date_of_birth;
	
	@Column (table="user_profile", name="date_modified")
	private Date date_modified;
	
	@Column (table="user_profile", name="gender_code")
	private char gender_code;
	
	@Column (table="user_profile", name="profile_picture")
	private String profile_picture;
	
	@Column (table="user_profile", name="nationality_code")
	private String nationality_code;
	
	@Column (table="user_profile", name="phone_number")
	private String phone_number;
	
	@Column (table="user_profile", name="mobile_number")
	private String mobile_number;
	
	@Column (table="user_profile", name="address_details")
	private String address_details;
	
	@Column (table="user_profile", name="address_city_code")
	private String address_city_code;
	
	@Column (table="user_profile", name="address_region_code")
	private String address_region_code;
	
	@Column (table="user_profile", name="address_country_code")
	private String address_country_code;
	
	@Column (table="user_profile", name="marital_status_code")
	private String marital_status_code;
	
	@Column (table="user_profile_detail", name="willing_to_shifting_schedules")
	private boolean willing_to_shifting_schedules;
	
	@Column (table="user_profile_detail", name="willing_to_relocate")
	private boolean willing_to_relocate = false;
	
	@Column (table="user_profile_detail", name="possess_passport")
	private boolean possess_passport = false;
	
	@Column (table="user_profile_detail", name="willing_to_work_overseas")
	private boolean willing_to_work_overseas = false;
	
	@Column (table="user_profile_detail", name="willing_to_holidays_weekends")
	private boolean willing_to_holidays_weekends = false;
	
	@Column (table="user_profile_detail", name="background_check")
	private boolean background_check = false;
	
	@Column (table="user_profile_detail", name="resume_filename")
	private String resume_filename;
	
	@Column (table="user_profile_detail", name="resume_date_upload")
	private Date resume_date_upload;
	
	@Column (table="user_profile_detail", name="resume_date_modified")
	private Date resume_date_modified;
	
	@Column (table="user_profile_detail", name="languages")
	private String languages = "";
	
	@OneToMany (fetch=FetchType.LAZY, mappedBy="workExperience")
	private Set<UserWorkExperiences> workExperiences = new HashSet<UserWorkExperiences>();
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Employer employer;
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	public int getGroup_id() {
		return group_id;
	}
	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}
	public int getParent_user_id() {
		return parent_user_id;
	}
	public void setParent_user_id(int parent_user_id) {
		this.parent_user_id = parent_user_id;
	}
	public int getAccount_type_id() {
		return account_type_id;
	}
	public void setAccount_type_id(int account_type_id) {
		this.account_type_id = account_type_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Date getDate_last_login() {
		return date_last_login;
	}
	public void setDate_last_login(Date date_last_login) {
		this.date_last_login = date_last_login;
	}
	public String getActivation_code() {
		return activation_code;
	}
	public void setActivation_code(String activation_code) {
		this.activation_code = activation_code;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public Date getDate_activated() {
		return date_activated;
	}
	public void setDate_activated(Date date_activated) {
		this.date_activated = date_activated;
	}
	public int getRegistration_id() {
		return registration_id;
	}
	public void setRegistration_id(int registration_id) {
		this.registration_id = registration_id;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getAlternate_email() {
		return alternate_email;
	}
	public void setAlternate_email(String alternate_email) {
		this.alternate_email = alternate_email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Date getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
	}
	public char getGender_code() {
		return gender_code;
	}
	public void setGender_code(char gender_code) {
		this.gender_code = gender_code;
	}
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	public String getNationality_code() {
		return nationality_code;
	}
	public void setNationality_code(String nationality_code) {
		this.nationality_code = nationality_code;
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
	public String getAddress_details() {
		return address_details;
	}
	public void setAddress_details(String address_details) {
		this.address_details = address_details;
	}
	public String getAddress_city_code() {
		return address_city_code;
	}
	public void setAddress_city_code(String address_city_code) {
		this.address_city_code = address_city_code;
	}
	public String getAddress_region_code() {
		return address_region_code;
	}
	public void setAddress_region_code(String address_region_code) {
		this.address_region_code = address_region_code;
	}
	public String getAddress_country_code() {
		return address_country_code;
	}
	public void setAddress_country_code(String address_country_code) {
		this.address_country_code = address_country_code;
	}
	public String getMarital_status_code() {
		return marital_status_code;
	}
	public void setMarital_status_code(String marital_status_code) {
		this.marital_status_code = marital_status_code;
	}
	
	public boolean isWilling_to_shifting_schedules() {
		return willing_to_shifting_schedules;
	}
	public void setWilling_to_shifting_schedules(
			boolean willing_to_shifting_schedules) {
		this.willing_to_shifting_schedules = willing_to_shifting_schedules;
	}
	public boolean isWilling_to_relocate() {
		return willing_to_relocate;
	}
	public void setWilling_to_relocate(boolean willing_to_relocate) {
		this.willing_to_relocate = willing_to_relocate;
	}
	public boolean isPossess_passport() {
		return possess_passport;
	}
	public void setPossess_passport(boolean possess_passport) {
		this.possess_passport = possess_passport;
	}
	public boolean isWilling_to_work_overseas() {
		return willing_to_work_overseas;
	}
	public void setWilling_to_work_overseas(boolean willing_to_work_overseas) {
		this.willing_to_work_overseas = willing_to_work_overseas;
	}
	public boolean isWilling_to_holidays_weekends() {
		return willing_to_holidays_weekends;
	}
	public void setWilling_to_holidays_weekends(boolean willing_to_holidays_weekends) {
		this.willing_to_holidays_weekends = willing_to_holidays_weekends;
	}
	public boolean isBackground_check() {
		return background_check;
	}
	public void setBackground_check(boolean background_check) {
		this.background_check = background_check;
	}
	public String getResume_filename() {
		return resume_filename;
	}
	public void setResume_filename(String resume_filename) {
		this.resume_filename = resume_filename;
	}
	public Date getResume_date_upload() {
		return resume_date_upload;
	}
	public void setResume_date_upload(Date resume_date_upload) {
		this.resume_date_upload = resume_date_upload;
	}
	public Date getResume_date_modified() {
		return resume_date_modified;
	}
	public void setResume_date_modified(Date resume_date_modified) {
		this.resume_date_modified = resume_date_modified;
	}
	public String getLanguages() {
		return languages;
	}
	public void setLanguages(String languages) {
		this.languages = languages;
	}
	public Set<UserWorkExperiences> getWorkExperiences() {
		return workExperiences;
	}
	public void setWorkExperiences(Set<UserWorkExperiences> workExperiences) {
		this.workExperiences = workExperiences;
	}
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (user_id ^ (user_id >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (user_id != other.user_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", "
				+ ", group_id=" + group_id + ", parent_user_id="
				+ parent_user_id + ", account_type_id=" + account_type_id
				+ ", email=" + email + ", password=" + password
				+ ", date_created=" + date_created + ", date_last_login="
				+ date_last_login + ", activation_code=" + activation_code
				+ ", activated=" + activated + ", date_activated="
				+ date_activated + ", registration_id=" + registration_id
				+ ", active=" + active + ", flag=" + flag
				+ ", alternate_email=" + alternate_email + ", firstname="
				+ firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", date_of_birth=" + date_of_birth
				+ ", date_modified=" + date_modified + ", gender_code="
				+ gender_code + ", profile_picture=" + profile_picture
				+ ", nationality_code=" + nationality_code + ", phone_number="
				+ phone_number + ", mobile_number=" + mobile_number
				+ ", address_details=" + address_details
				+ ", address_city_code=" + address_city_code
				+ ", address_region_code=" + address_region_code
				+ ", address_country_code=" + address_country_code
				+ ", marital_status_code=" + marital_status_code
				+ ", willing_to_shifting_schedules="
				+ willing_to_shifting_schedules + ", willing_to_relocate="
				+ willing_to_relocate + ", possess_passport="
				+ possess_passport + ", willing_to_work_overseas="
				+ willing_to_work_overseas + ", willing_to_holidays_weekends="
				+ willing_to_holidays_weekends + ", background_check="
				+ background_check + ", resume_filename=" + resume_filename
				+ ", resume_date_upload=" + resume_date_upload
				+ ", resume_date_modified=" + resume_date_modified
				+ ", languages=" + languages + "]";
	}
	
}
