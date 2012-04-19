package com.ryan.old.models;

import java.util.Date;

public class ApplicantProfessionalBackground {
	private long applicant_professional_background_id;
	private long person_id;
	private boolean app_prof_id;
	private String job_pos;
	private String indstry_sctr_code;
	private String indstry_sctr_othr;
	private String acct_type;
	private boolean nonvoice;
	private boolean voice;
	private String cmpny_name;
	private int slry_code;
	private String job_desc;
	private Date emp_prd_from;	
	private Date emp_prd_to;
	private boolean emp_prd_present;
	private Date created_date;
	private Date modified_date;
	
	public ApplicantProfessionalBackground() {
		super();
	}
	public ApplicantProfessionalBackground(long person_id) {
		super();
		this.person_id = person_id;
	}
	public long getApplicant_professional_background_id() {
		return applicant_professional_background_id;
	}
	public void setApplicant_professional_background_id(
			long applicant_professional_background_id) {
		this.applicant_professional_background_id = applicant_professional_background_id;
	}
	public long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(long person_id) {
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
	public String getCmpny_name() {
		return cmpny_name;
	}
	public void setCmpny_name(String cmpny_name) {
		this.cmpny_name = cmpny_name;
	}
	public int getSlry_code() {
		return slry_code;
	}
	public void setSlry_code(int slry_code) {
		this.slry_code = slry_code;
	}
	public String getJob_desc() {
		return job_desc;
	}
	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}
	public Date getEmp_prd_from() {
		return emp_prd_from;
	}
	public void setEmp_prd_from(Date emp_prd_from) {
		this.emp_prd_from = emp_prd_from;
	}
	public Date getEmp_prd_to() {
		return emp_prd_to;
	}
	public void setEmp_prd_to(Date emp_prd_to) {
		this.emp_prd_to = emp_prd_to;
	}
	public boolean isEmp_prd_present() {
		return emp_prd_present;
	}
	public void setEmp_prd_present(boolean emp_prd_present) {
		this.emp_prd_present = emp_prd_present;
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
		ApplicantProfessionalBackground other = (ApplicantProfessionalBackground) obj;
		if (person_id != other.person_id)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ApplicantProfessionalBackground [applicant_professional_background_id="
				+ applicant_professional_background_id
				+ ", person_id="
				+ person_id
				+ ", app_prof_id="
				+ app_prof_id
				+ ", job_pos="
				+ job_pos
				+ ", indstry_sctr_code="
				+ indstry_sctr_code
				+ ", indstry_sctr_othr="
				+ indstry_sctr_othr
				+ ", acct_type="
				+ acct_type
				+ ", nonvoice="
				+ nonvoice
				+ ", voice="
				+ voice
				+ ", cmpny_name="
				+ cmpny_name
				+ ", slry_code="
				+ slry_code
				+ ", job_desc="
				+ job_desc
				+ ", emp_prd_from="
				+ emp_prd_from
				+ ", emp_prd_to="
				+ emp_prd_to
				+ ", emp_prd_present="
				+ emp_prd_present
				+ ", created_date="
				+ created_date
				+ ", modified_date=" + modified_date + "]";
	}
}
