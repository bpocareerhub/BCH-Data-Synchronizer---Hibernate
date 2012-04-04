package com.bch.models;

import java.util.ArrayList;
import java.util.Date;

public class SecurityUsers {

	private long user_id;
	private String grp_code, username, password, email, activation_code, ref_code;
	private Date created_date, modified_date, last_update_date, last_login, activation_date;
	private boolean inactive, activated, invalid_email, new_password_flg;
	private String src_code, src_specific;
	
	/**
	 * Person Columns
	 */
	private long person_id;
	private String first_name, middle_name, last_name;	
	private boolean shifting_schedules, holiday_weekends, willing_to_relocate, background_check;
	private String highest_educational_attainment, profile_picture, file_type;
	private boolean privacy, send_newsletter, job_alerts;

	/**
	 * Person Address Columns
	 */
	private String address, country_code, region_city_code;
	
	/**
	 * Person Phone
	 */
	private String phone_num, mobile_num;
	
	/**
	 * Person Details
	 */
	private char gender_code;
	private Date birth_date;
	private String natl_code, marital_stat_code, pic;
	private boolean send_message, send_email_daily, send_email_weekly, send_news;
	
	/**
	 * Applicant_resume
	 */
	private String resume_file;
	
	/**
	 * Applicant_skills
	 */
	private String lang_spoken, lang_writen, skills, trainings;
	
	/**
	 * Applicant_career
	 */
	private String ac_indstry_sctr_code, ac_job_type_code, ac_region_city_code, achievements;
	private boolean relocate, travel, avail, avail_date;
	private int exp_yr;	
	
	/**
	 * Work Experiences
	 */
	private ArrayList<WorkExperiences> workExperiences = new ArrayList<WorkExperiences>();
	
	/**
	 * Educational Background
	 */
	private ArrayList<EducationalBackground> educationalBackground = new ArrayList<EducationalBackground>();
	
	
	public SecurityUsers() {
		super();		
	}
	
	public SecurityUsers(long person_id) {
		super();
		this.person_id = person_id;
	}
	
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getGrp_code() {
		return grp_code;
	}
	public void setGrp_code(String grp_code) {
		this.grp_code = grp_code;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getActivation_code() {
		return activation_code;
	}
	public void setActivation_code(String activation_code) {
		this.activation_code = activation_code;
	}
	public String getRef_code() {
		return ref_code;
	}
	public void setRef_code(String ref_code) {
		this.ref_code = ref_code;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getModified_date() {
		return modified_date;
	}
	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}
	public Date getLast_update_date() {
		return last_update_date;
	}
	public void setLast_update_date(Date last_update_date) {
		this.last_update_date = last_update_date;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public Date getActivation_date() {
		return activation_date;
	}
	public void setActivation_date(Date activation_date) {
		this.activation_date = activation_date;
	}
	public boolean isInactive() {
		return inactive;
	}
	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public boolean isInvalid_email() {
		return invalid_email;
	}
	public void setInvalid_email(boolean invalid_email) {
		this.invalid_email = invalid_email;
	}
	public boolean isNew_password_flg() {
		return new_password_flg;
	}
	public void setNew_password_flg(boolean new_password_flg) {
		this.new_password_flg = new_password_flg;
	}
	public String getSrc_code() {
		return src_code;
	}
	public void setSrc_code(String src_code) {
		this.src_code = src_code;
	}
	public String getSrc_specific() {
		return src_specific;
	}
	public void setSrc_specific(String src_specific) {
		this.src_specific = src_specific;
	}
	public long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(long person_id) {
		this.person_id = person_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public boolean isShifting_schedules() {
		return shifting_schedules;
	}
	public void setShifting_schedules(boolean shifting_schedules) {
		this.shifting_schedules = shifting_schedules;
	}
	public boolean isHoliday_weekends() {
		return holiday_weekends;
	}
	public void setHoliday_weekends(boolean holiday_weekends) {
		this.holiday_weekends = holiday_weekends;
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
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	public String getFile_type() {
		return file_type;
	}
	public void setFile_type(String file_type) {
		this.file_type = file_type;
	}
	public boolean isPrivacy() {
		return privacy;
	}
	public void setPrivacy(boolean privacy) {
		this.privacy = privacy;
	}
	public boolean isSend_newsletter() {
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getRegion_city_code() {
		return region_city_code;
	}
	public void setRegion_city_code(String region_city_code) {
		this.region_city_code = region_city_code;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public String getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(String mobile_num) {
		this.mobile_num = mobile_num;
	}
	public char getGender_code() {
		return gender_code;
	}
	public void setGender_code(char gender_code) {
		this.gender_code = gender_code;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public String getNatl_code() {
		return natl_code;
	}
	public void setNatl_code(String natl_code) {
		this.natl_code = natl_code;
	}
	public String getMarital_stat_code() {
		return marital_stat_code;
	}
	public void setMarital_stat_code(String marital_stat_code) {
		this.marital_stat_code = marital_stat_code;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public boolean isSend_message() {
		return send_message;
	}
	public void setSend_message(boolean send_message) {
		this.send_message = send_message;
	}
	public boolean isSend_email_daily() {
		return send_email_daily;
	}
	public void setSend_email_daily(boolean send_email_daily) {
		this.send_email_daily = send_email_daily;
	}
	public boolean isSend_email_weekly() {
		return send_email_weekly;
	}
	public void setSend_email_weekly(boolean send_email_weekly) {
		this.send_email_weekly = send_email_weekly;
	}
	public boolean isSend_news() {
		return send_news;
	}
	public void setSend_news(boolean send_news) {
		this.send_news = send_news;
	}
	public String getResume_file() {
		return resume_file;
	}
	public void setResume_file(String resume_file) {
		this.resume_file = resume_file;
	}
	public String getLang_spoken() {
		return lang_spoken;
	}
	public void setLang_spoken(String lang_spoken) {
		this.lang_spoken = lang_spoken;
	}
	public String getLang_writen() {
		return lang_writen;
	}
	public void setLang_writen(String lang_writen) {
		this.lang_writen = lang_writen;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getTrainings() {
		return trainings;
	}
	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}
	public String getAc_indstry_sctr_code() {
		return ac_indstry_sctr_code;
	}
	public void setAc_indstry_sctr_code(String ac_indstry_sctr_code) {
		this.ac_indstry_sctr_code = ac_indstry_sctr_code;
	}
	public String getAc_job_type_code() {
		return ac_job_type_code;
	}
	public void setAc_job_type_code(String ac_job_type_code) {
		this.ac_job_type_code = ac_job_type_code;
	}
	public String getAc_region_city_code() {
		return ac_region_city_code;
	}
	public void setAc_region_city_code(String ac_region_city_code) {
		this.ac_region_city_code = ac_region_city_code;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
	public boolean isRelocate() {
		return relocate;
	}
	public void setRelocate(boolean relocate) {
		this.relocate = relocate;
	}
	public boolean isTravel() {
		return travel;
	}
	public void setTravel(boolean travel) {
		this.travel = travel;
	}
	public boolean isAvail() {
		return avail;
	}
	public void setAvail(boolean avail) {
		this.avail = avail;
	}
	public boolean isAvail_date() {
		return avail_date;
	}
	public void setAvail_date(boolean avail_date) {
		this.avail_date = avail_date;
	}
	public int getExp_yr() {
		return exp_yr;
	}
	public void setExp_yr(int exp_yr) {
		this.exp_yr = exp_yr;
	}
	public ArrayList<WorkExperiences> getWorkExperiences() {
		return workExperiences;
	}
	public void setWorkExperiences(ArrayList<WorkExperiences> workExperiences) {
		this.workExperiences = workExperiences;
	}
	public ArrayList<EducationalBackground> getEducationalBackground() {
		return educationalBackground;
	}
	public void setEducationalBackground(ArrayList<EducationalBackground> educationalBackground) {
		this.educationalBackground = educationalBackground;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (person_id ^ (person_id >>> 32));
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
		SecurityUsers other = (SecurityUsers) obj;
		if (person_id != other.person_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "SecurityUsers [user_id=" + user_id + ", grp_code=" + grp_code
				+ ", username=" + username + ", password=" + password
				+ ", email=" + email + ", activation_code=" + activation_code
				+ ", ref_code=" + ref_code + ", created_date=" + created_date
				+ ", modified_date=" + modified_date + ", last_update_date="
				+ last_update_date + ", last_login=" + last_login
				+ ", activation_date=" + activation_date + ", inactive="
				+ inactive + ", activated=" + activated + ", invalid_email="
				+ invalid_email + ", new_password_flg=" + new_password_flg
				+ ", src_code=" + src_code + ", src_specific=" + src_specific
				+ ", person_id=" + person_id + ", first_name=" + first_name
				+ ", middle_name=" + middle_name + ", last_name=" + last_name
				+ ", shifting_schedules=" + shifting_schedules
				+ ", holiday_weekends=" + holiday_weekends
				+ ", willing_to_relocate=" + willing_to_relocate
				+ ", background_check=" + background_check
				+ ", highest_educational_attainment="
				+ highest_educational_attainment + ", profile_picture="
				+ profile_picture + ", file_type=" + file_type + ", privacy="
				+ privacy + ", send_newsletter=" + send_newsletter
				+ ", job_alerts=" + job_alerts + ", address=" + address
				+ ", country_code=" + country_code + ", region_city_code="
				+ region_city_code + ", phone_num=" + phone_num
				+ ", mobile_num=" + mobile_num + ", gender_code=" + gender_code
				+ ", birth_date=" + birth_date + ", natl_code=" + natl_code
				+ ", marital_stat_code=" + marital_stat_code + ", pic=" + pic
				+ ", send_message=" + send_message + ", send_email_daily="
				+ send_email_daily + ", send_email_weekly=" + send_email_weekly
				+ ", send_news=" + send_news + ", resume_file=" + resume_file
				+ ", lang_spoken=" + lang_spoken + ", lang_writen="
				+ lang_writen + ", skills=" + skills + ", trainings="
				+ trainings + ", ac_indstry_sctr_code=" + ac_indstry_sctr_code
				+ ", ac_job_type_code=" + ac_job_type_code
				+ ", ac_region_city_code=" + ac_region_city_code
				+ ", achievements=" + achievements + ", relocate=" + relocate
				+ ", travel=" + travel + ", avail=" + avail + ", avail_date="
				+ avail_date + ", exp_yr=" + exp_yr + "]";
	}
}
