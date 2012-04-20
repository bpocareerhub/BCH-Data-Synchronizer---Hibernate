package com.bch.bean.mappings;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name="employers")
public class Employer {
	
	@Id
	@GeneratedValue
	@Column (name="employer_id", unique=true, nullable=false, updatable=false)
	private long employer_id;
	
	@OneToOne (mappedBy="employer", cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private User user;
	
	@Column (name="name")
	private String name;
	
	@Column (name="description")
	private String description;
	
	@Column (name="tin_number")
	private String tin_number;
	
	@Column (name="sec_number")
	private String sec_number;
	
	@Column (name="account_owner_user_id")
	private int account_owner_user_id;
	
	@Column (name="industry_id")
	private long industry_id;
	
	@Column (name="industry_sector_id")
	private long industry_sector_id;
	
	@Column (name="country_code")
	private String country_code;
	
	@Column (name="office_phone_number")
	private String office_phone_number;
	
	@Column (name="fax_number")
	private String fax_number;
	
	@Column (name="url_website")
	private String url_website;
	
	@Column (name="profile_picture")
	private String profile_picture;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name="date_created")
	private Date date_created;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name="date_modified", nullable=true)
	private Date date_modified;
	
	@Column (name="active")
	private boolean active = true;
	
	@Column (name="flag")
	private boolean flag = false;
	
	public Employer() {
		super();
	}
	public long getEmployer_id() {
		return employer_id;
	}
	public void setEmployer_id(long employer_id) {
		this.employer_id = employer_id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTin_number() {
		return tin_number;
	}
	public void setTin_number(String tin_number) {
		this.tin_number = tin_number;
	}
	public String getSec_number() {
		return sec_number;
	}
	public void setSec_number(String sec_number) {
		this.sec_number = sec_number;
	}
	public int getAccount_owner_user_id() {
		return account_owner_user_id;
	}
	public void setAccount_owner_user_id(int account_owner_user_id) {
		this.account_owner_user_id = account_owner_user_id;
	}
	public long getIndustry_id() {
		return industry_id;
	}
	public void setIndustry_id(long industry_id) {
		this.industry_id = industry_id;
	}
	public long getIndustry_sector_id() {
		return industry_sector_id;
	}
	public void setIndustry_sector_id(long industry_sector_id) {
		this.industry_sector_id = industry_sector_id;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getOffice_phone_number() {
		return office_phone_number;
	}
	public void setOffice_phone_number(String office_phone_number) {
		this.office_phone_number = office_phone_number;
	}
	public String getFax_number() {
		return fax_number;
	}
	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}
	public String getUrl_website() {
		return url_website;
	}
	public void setUrl_website(String url_website) {
		this.url_website = url_website;
	}
	public String getProfile_picture() {
		return profile_picture;
	}
	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
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
		result = prime * result + (int) (employer_id ^ (employer_id >>> 32));
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
		Employer other = (Employer) obj;
		if (employer_id != other.employer_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employer [employer_id=" + employer_id + ", user=" + user
				+ ", name=" + name + ", description=" + description
				+ ", tin_number=" + tin_number + ", sec_number=" + sec_number
				+ ", account_owner_user_id=" + account_owner_user_id
				+ ", industry_id=" + industry_id + ", industry_sector_id="
				+ industry_sector_id + ", country_code=" + country_code
				+ ", office_phone_number=" + office_phone_number
				+ ", fax_number=" + fax_number + ", url_website=" + url_website
				+ ", profile_picture=" + profile_picture + ", date_created="
				+ date_created + ", date_modified=" + date_modified
				+ ", active=" + active + ", flag=" + flag + "]";
	}
}
