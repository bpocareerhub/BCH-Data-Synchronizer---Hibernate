package com.ryan.old.models;

import java.util.Date;

public class Companies {
	
	private long cmpny_id;
	private long user_id;
	private String cmpny_name, cmpny_desc, logo, tin_num, sec_num, indstry_sctr_code, website;
	private Date created_date, modified_date;
	private boolean autosend_news, allow_social_site;
	private long post_credits;
	private long resume_credits;

	// Security Users
	private SecurityUsers security_user;
	
	// company contact
	private String phone, fax, c_email;

	/**
	 * Company Address Columns
	 */
	private String address, country_code;
	
	public long getCmpny_id() {
		return cmpny_id;
	}
	public void setCmpny_id(long cmpny_id) {
		this.cmpny_id = cmpny_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getCmpny_name() {
		return cmpny_name;
	}
	public void setCmpny_name(String cmpny_name) {
		this.cmpny_name = cmpny_name;
	}
	public String getCmpny_desc() {
		return cmpny_desc;
	}
	public void setCmpny_desc(String cmpny_desc) {
		this.cmpny_desc = cmpny_desc;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getTin_num() {
		return tin_num;
	}
	public void setTin_num(String tin_num) {
		this.tin_num = tin_num;
	}
	public String getSec_num() {
		return sec_num;
	}
	public void setSec_num(String sec_num) {
		this.sec_num = sec_num;
	}
	public String getIndstry_sctr_code() {
		return indstry_sctr_code;
	}
	public void setIndstry_sctr_code(String indstry_sctr_code) {
		this.indstry_sctr_code = indstry_sctr_code;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
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
	public boolean isAutosend_news() {
		return autosend_news;
	}
	public void setAutosend_news(boolean autosend_news) {
		this.autosend_news = autosend_news;
	}
	public boolean isAllow_social_site() {
		return allow_social_site;
	}
	public void setAllow_social_site(boolean allow_social_site) {
		this.allow_social_site = allow_social_site;
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
	public long getPost_credits() {
		return post_credits;
	}
	public void setPost_credits(long post_credits) {
		this.post_credits = post_credits;
	}
	public long getResume_credits() {
		return resume_credits;
	}
	public void setResume_credits(long resume_credits) {
		this.resume_credits = resume_credits;
	}
	public SecurityUsers getSecurity_user() {
		return security_user;
	}
	public void setSecurity_user(SecurityUsers security_user) {
		this.security_user = security_user;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cmpny_id ^ (cmpny_id >>> 32));
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
		Companies other = (Companies) obj;
		if (cmpny_id != other.cmpny_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Companies [cmpny_id=" + cmpny_id + ", user_id=" + user_id
				+ ", cmpny_name=" + cmpny_name + ", cmpny_desc=" + cmpny_desc
				+ ", logo=" + logo + ", tin_num=" + tin_num + ", sec_num="
				+ sec_num + ", indstry_sctr_code=" + indstry_sctr_code
				+ ", website=" + website + ", created_date=" + created_date
				+ ", modified_date=" + modified_date + ", autosend_news="
				+ autosend_news + ", allow_social_site=" + allow_social_site
				+ ", post_credits=" + post_credits + ", resume_credits="
				+ resume_credits + ", security_user=" + security_user
				+ ", address=" + address + ", country_code=" + country_code
				+ "]";
	}
}
