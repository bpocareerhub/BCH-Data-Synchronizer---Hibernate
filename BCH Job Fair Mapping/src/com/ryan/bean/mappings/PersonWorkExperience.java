package com.ryan.bean.mappings;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="applicant_professional_background")
public class PersonWorkExperience {
	
	@Id
	@GeneratedValue
	@Column (name="professional_id", nullable=false)
	private int professional_id;
	
	@Column (name="person_id")
	private int person_id;
	
	@Column ()
	private boolean app_prof_id;
	private String job_pos;
	private String industry_sector_code;
	private String industry_sector_other;
	private String account_type;
	private boolean nonvoice;
	private boolean voice;
	private String company_name;
	private String salary_code;
	private String job_description;
	private String employment_period_from_month;
	private String employment_period_to_month;
	private String employment_period_from_year;
	private String employment_period_to_year;
	private boolean employment_period_present;
	private Date created_date;
	private Date modified_date;
	public int getProfessional_id() {
		return professional_id;
	}
	public void setProfessional_id(int professional_id) {
		this.professional_id = professional_id;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public boolean isApp_prof_id() {
		return app_prof_id;
	}
	public void setApp_prof_id(boolean app_prof_id) {
		this.app_prof_id = app_prof_id;
	}
	public String getJob_pos() {
		return job_pos;
	}
	public void setJob_pos(String job_pos) {
		this.job_pos = job_pos;
	}
	public String getIndustry_sector_code() {
		return industry_sector_code;
	}
	public void setIndustry_sector_code(String industry_sector_code) {
		this.industry_sector_code = industry_sector_code;
	}
	public String getIndustry_sector_other() {
		return industry_sector_other;
	}
	public void setIndustry_sector_other(String industry_sector_other) {
		this.industry_sector_other = industry_sector_other;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public boolean isNonvoice() {
		return nonvoice;
	}
	public void setNonvoice(boolean nonvoice) {
		this.nonvoice = nonvoice;
	}
	public boolean isVoice() {
		return voice;
	}
	public void setVoice(boolean voice) {
		this.voice = voice;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
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
	public String getEmployment_period_from_month() {
		return employment_period_from_month;
	}
	public void setEmployment_period_from_month(String employment_period_from_month) {
		this.employment_period_from_month = employment_period_from_month;
	}
	public String getEmployment_period_to_month() {
		return employment_period_to_month;
	}
	public void setEmployment_period_to_month(String employment_period_to_month) {
		this.employment_period_to_month = employment_period_to_month;
	}
	public String getEmployment_period_from_year() {
		return employment_period_from_year;
	}
	public void setEmployment_period_from_year(String employment_period_from_year) {
		this.employment_period_from_year = employment_period_from_year;
	}
	public String getEmployment_period_to_year() {
		return employment_period_to_year;
	}
	public void setEmployment_period_to_year(String employment_period_to_year) {
		this.employment_period_to_year = employment_period_to_year;
	}
	public boolean isEmployment_period_present() {
		return employment_period_present;
	}
	public void setEmployment_period_present(boolean employment_period_present) {
		this.employment_period_present = employment_period_present;
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
}
