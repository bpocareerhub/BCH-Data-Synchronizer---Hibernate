package com.bch.models;

import java.util.Date;

public class EducationalBackground {
	private long applicant_educational_background_id;
	private String acad_code,educational_level,status,school_name,course;
	private int period_from,period_to;
	private Date created_date,modified_date;
	public long getApplicant_educational_background_id() {
		return applicant_educational_background_id;
	}
	public void setApplicant_educational_background_id(
			long applicant_educational_background_id) {
		this.applicant_educational_background_id = applicant_educational_background_id;
	}
	public String getAcad_code() {
		return acad_code;
	}
	public void setAcad_code(String acad_code) {
		this.acad_code = acad_code;
	}
	public String getEducational_level() {
		return educational_level;
	}
	public void setEducational_level(String educational_level) {
		this.educational_level = educational_level;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getPeriod_from() {
		return period_from;
	}
	public void setPeriod_from(int period_from) {
		this.period_from = period_from;
	}
	public int getPeriod_to() {
		return period_to;
	}
	public void setPeriod_to(int period_to) {
		this.period_to = period_to;
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
		result = prime
				* result
				+ (int) (applicant_educational_background_id ^ (applicant_educational_background_id >>> 32));
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
		EducationalBackground other = (EducationalBackground) obj;
		if (applicant_educational_background_id != other.applicant_educational_background_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "EducationalBackground [applicant_educational_background_id="
				+ applicant_educational_background_id + ", acad_code="
				+ acad_code + ", educational_level=" + educational_level
				+ ", status=" + status + ", school_name=" + school_name
				+ ", course=" + course + ", period_from=" + period_from
				+ ", period_to=" + period_to + ", created_date=" + created_date
				+ ", modified_date=" + modified_date + "]";
	}
	
}
