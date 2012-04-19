package com.ryan.old.models;

import java.util.Date;

public class ApplicantResume {
	private long resume_id;
	private long person_id;
	private String resume_file;
	private Date created_date;
	private Date modified_date;
	
	public ApplicantResume() {
		super();
	}
	public ApplicantResume(long id) {
		this.person_id = id;
	}
	public long getResume_id() {
		return resume_id;
	}
	public void setResume_id(long resume_id) {
		this.resume_id = resume_id;
	}
	public long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(long person_id) {
		this.person_id = person_id;
	}
	public String getResume_file() {
		return resume_file;
	}
	public void setResume_file(String resume_file) {
		this.resume_file = resume_file;
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
		ApplicantResume other = (ApplicantResume) obj;
		if (person_id != other.person_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ApplicantResume [resume_id=" + resume_id + ", person_id="
				+ person_id + ", resume_file=" + resume_file
				+ ", created_date=" + created_date + ", modified_date="
				+ modified_date + "]";
	}
}
