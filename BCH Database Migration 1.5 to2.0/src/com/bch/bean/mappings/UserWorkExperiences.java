package com.bch.bean.mappings;

import java.util.Date;

public class UserWorkExperiences {
	private long work_experience_id;
	private long user_id;
	private String job_title;
	private String company_name;
	private String position_level_code;
	private int industry_id;
	private int industry_sector_id;
	private String specialization_code;
	private String salary_code;
	private String job_description;
	private boolean present_employment = false;
	private Date date_employment_from;
	private Date date_employment_to;
	private String reason_for_leaving;
	private Date date_created;
	private Date date_modified;
	private boolean active = true;
	private boolean flag = false;
	public long getWork_experience_id() {
		return work_experience_id;
	}
	public void setWork_experience_id(long work_experience_id) {
		this.work_experience_id = work_experience_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getPosition_level_code() {
		return position_level_code;
	}
	public void setPosition_level_code(String position_level_code) {
		this.position_level_code = position_level_code;
	}
	public int getIndustry_id() {
		return industry_id;
	}
	public void setIndustry_id(int industry_id) {
		this.industry_id = industry_id;
	}
	public int getIndustry_sector_id() {
		return industry_sector_id;
	}
	public void setIndustry_sector_id(int industry_sector_id) {
		this.industry_sector_id = industry_sector_id;
	}
	public String getSpecialization_code() {
		return specialization_code;
	}
	public void setSpecialization_code(String specialization_code) {
		this.specialization_code = specialization_code;
	}
	public String getSalary_code() {
		return salary_code;
	}
	public void setSalary_code(String salary_code) {
		this.salary_code = salary_code;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public boolean isPresent_employment() {
		return present_employment;
	}
	public void setPresent_employment(boolean present_employment) {
		this.present_employment = present_employment;
	}
	public Date getDate_employment_from() {
		return date_employment_from;
	}
	public void setDate_employment_from(Date date_employment_from) {
		this.date_employment_from = date_employment_from;
	}
	public Date getDate_employment_to() {
		return date_employment_to;
	}
	public void setDate_employment_to(Date date_employment_to) {
		this.date_employment_to = date_employment_to;
	}
	public String getReason_for_leaving() {
		return reason_for_leaving;
	}
	public void setReason_for_leaving(String reason_for_leaving) {
		this.reason_for_leaving = reason_for_leaving;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public Date getDate_modified() {
		return date_modified;
	}
	public void setDate_modified(Date date_modified) {
		this.date_modified = date_modified;
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ (int) (work_experience_id ^ (work_experience_id >>> 32));
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
		UserWorkExperiences other = (UserWorkExperiences) obj;
		if (work_experience_id != other.work_experience_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserWorkExperiences [work_experience_id=" + work_experience_id
				+ ", user_id=" + user_id + ", job_title=" + job_title
				+ ", company_name=" + company_name + ", position_level_code="
				+ position_level_code + ", industry_id=" + industry_id
				+ ", industry_sector_id=" + industry_sector_id
				+ ", specialization_code=" + specialization_code
				+ ", salary_code=" + salary_code + ", job_description="
				+ job_description + ", present_employment="
				+ present_employment + ", date_employment_from="
				+ date_employment_from + ", date_employment_to="
				+ date_employment_to + ", reason_for_leaving="
				+ reason_for_leaving + ", date_created=" + date_created
				+ ", date_modified=" + date_modified + ", active=" + active
				+ ", flag=" + flag + "]";
	}	
}
