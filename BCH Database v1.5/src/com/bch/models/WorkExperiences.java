package com.bch.models;

import java.util.Date;

public class WorkExperiences {
	private long person_id, applicant_professional_background_id;
	private String job_pos, indstry_sctr_code,indstry_sctr_othr,acct_type,cmpny_name,slry_code,job_desc,emp_prd_from_month,emp_prd_to_month;
	private int emp_prd_from_year,emp_prd_to_year;
	private Date created_date,modified_date;
	private boolean app_prof_id,nonvoice,voice,emp_prd_present;
	
	public long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(long person_id) {
		this.person_id = person_id;
	}
	public long getApplicant_professional_background_id() {
		return applicant_professional_background_id;
	}
	public void setApplicant_professional_background_id(
			long applicant_professional_background_id) {
		this.applicant_professional_background_id = applicant_professional_background_id;
	}
	public String getJob_pos() {
		return job_pos;
	}
	public void setJob_pos(String job_pos) {
		this.job_pos = job_pos;
	}
	public String getIndstry_sctr_code() {
		return indstry_sctr_code;
	}
	public void setIndstry_sctr_code(String indstry_sctr_code) {
		this.indstry_sctr_code = indstry_sctr_code;
	}
	public String getIndstry_sctr_othr() {
		return indstry_sctr_othr;
	}
	public void setIndstry_sctr_othr(String indstry_sctr_othr) {
		this.indstry_sctr_othr = indstry_sctr_othr;
	}
	public String getAcct_type() {
		return acct_type;
	}
	public void setAcct_type(String acct_type) {
		this.acct_type = acct_type;
	}
	public String getCmpny_name() {
		return cmpny_name;
	}
	public void setCmpny_name(String cmpny_name) {
		this.cmpny_name = cmpny_name;
	}
	public String getSlry_code() {
		return slry_code;
	}
	public void setSlry_code(String slry_code) {
		this.slry_code = slry_code;
	}
	public String getJob_desc() {
		return job_desc;
	}
	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}
	public String getEmp_prd_from_month() {
		return emp_prd_from_month;
	}
	public void setEmp_prd_from_month(String emp_prd_from_month) {
		this.emp_prd_from_month = emp_prd_from_month;
	}
	public String getEmp_prd_to_month() {
		return emp_prd_to_month;
	}
	public void setEmp_prd_to_month(String emp_prd_to_month) {
		this.emp_prd_to_month = emp_prd_to_month;
	}
	public int getEmp_prd_from_year() {
		return emp_prd_from_year;
	}
	public void setEmp_prd_from_year(int emp_prd_from_year) {
		this.emp_prd_from_year = emp_prd_from_year;
	}
	public int getEmp_prd_to_year() {
		return emp_prd_to_year;
	}
	public void setEmp_prd_to_year(int emp_prd_to_year) {
		this.emp_prd_to_year = emp_prd_to_year;
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
	public boolean isApp_prof_id() {
		return app_prof_id;
	}
	public void setApp_prof_id(boolean app_prof_id) {
		this.app_prof_id = app_prof_id;
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
	public boolean isEmp_prd_present() {
		return emp_prd_present;
	}
	public void setEmp_prd_present(boolean emp_prd_present) {
		this.emp_prd_present = emp_prd_present;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ (int) (applicant_professional_background_id ^ (applicant_professional_background_id >>> 32));
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
		WorkExperiences other = (WorkExperiences) obj;
		if (applicant_professional_background_id != other.applicant_professional_background_id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "WorkExperiences [applicant_professional_background_id="
				+ applicant_professional_background_id + ", job_pos=" + job_pos
				+ ", indstry_sctr_code=" + indstry_sctr_code
				+ ", indstry_sctr_othr=" + indstry_sctr_othr + ", acct_type="
				+ acct_type + ", cmpny_name=" + cmpny_name + ", slry_code="
				+ slry_code + ", job_desc=" + job_desc
				+ ", emp_prd_from_month=" + emp_prd_from_month
				+ ", emp_prd_to_month=" + emp_prd_to_month
				+ ", emp_prd_from_year=" + emp_prd_from_year
				+ ", emp_prd_to_year=" + emp_prd_to_year + ", created_date="
				+ created_date + ", modified_date=" + modified_date
				+ ", app_prof_id=" + app_prof_id + ", nonvoice=" + nonvoice
				+ ", voice=" + voice + ", emp_prd_present=" + emp_prd_present
				+ "]";
	}
	
}
