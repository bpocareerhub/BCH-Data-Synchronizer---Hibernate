package com.bch.models;

import java.util.Date;

public class JobPosts {
	private long job_id, cmpny_id, author_user_id;
	private String job_title, indstry_sctr_code, job_lvl_code, job_type_code;
	private String job_desc, region_city_code;
	private int vacant_num, slry_code, yr_exp_code;
	private boolean hide_cmpny_dtl, slry_neg, fresh_grad, email_alert;
	private String acad_code, stat_code;
	private int auto_repost_interval, max_repost, current_repost;
	private Date created_date, modified_date, post_date, expire_date;
	private String credit_id;
	private boolean featured;
	
	public long getJob_id() {
		return job_id;
	}
	public void setJob_id(long job_id) {
		this.job_id = job_id;
	}
	public long getCmpny_id() {
		return cmpny_id;
	}
	public void setCmpny_id(long cmpny_id) {
		this.cmpny_id = cmpny_id;
	}
	public long getAuthor_user_id() {
		return author_user_id;
	}
	public void setAuthor_user_id(long author_user_id) {
		this.author_user_id = author_user_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getIndstry_sctr_code() {
		return indstry_sctr_code;
	}
	public void setIndstry_sctr_code(String indstry_sctr_code) {
		this.indstry_sctr_code = indstry_sctr_code;
	}
	public String getJob_lvl_code() {
		return job_lvl_code;
	}
	public void setJob_lvl_code(String job_lvl_code) {
		this.job_lvl_code = job_lvl_code;
	}
	public String getJob_type_code() {
		return job_type_code;
	}
	public void setJob_type_code(String job_type_code) {
		this.job_type_code = job_type_code;
	}
	public String getJob_desc() {
		return job_desc;
	}
	public void setJob_desc(String job_desc) {
		this.job_desc = job_desc;
	}
	public String getRegion_city_code() {
		return region_city_code;
	}
	public void setRegion_city_code(String region_city_code) {
		this.region_city_code = region_city_code;
	}
	public int getVacant_num() {
		return vacant_num;
	}
	public void setVacant_num(int vacant_num) {
		this.vacant_num = vacant_num;
	}
	public int getSlry_code() {
		return slry_code;
	}
	public void setSlry_code(int slry_code) {
		this.slry_code = slry_code;
	}
	public int getYr_exp_code() {
		return yr_exp_code;
	}
	public void setYr_exp_code(int yr_exp_code) {
		this.yr_exp_code = yr_exp_code;
	}
	public boolean isHide_cmpny_dtl() {
		return hide_cmpny_dtl;
	}
	public void setHide_cmpny_dtl(boolean hide_cmpny_dtl) {
		this.hide_cmpny_dtl = hide_cmpny_dtl;
	}
	public boolean isSlry_neg() {
		return slry_neg;
	}
	public void setSlry_neg(boolean slry_neg) {
		this.slry_neg = slry_neg;
	}
	public boolean isFresh_grad() {
		return fresh_grad;
	}
	public void setFresh_grad(boolean fresh_grad) {
		this.fresh_grad = fresh_grad;
	}
	public boolean isEmail_alert() {
		return email_alert;
	}
	public void setEmail_alert(boolean email_alert) {
		this.email_alert = email_alert;
	}
	public String getAcad_code() {
		return acad_code;
	}
	public void setAcad_code(String acad_code) {
		this.acad_code = acad_code;
	}
	public String getStat_code() {
		return stat_code;
	}
	public void setStat_code(String stat_code) {
		this.stat_code = stat_code;
	}
	public int getAuto_repost_interval() {
		return auto_repost_interval;
	}
	public void setAuto_repost_interval(int auto_repost_interval) {
		this.auto_repost_interval = auto_repost_interval;
	}
	public int getMax_repost() {
		return max_repost;
	}
	public void setMax_repost(int max_repost) {
		this.max_repost = max_repost;
	}
	public int getCurrent_repost() {
		return current_repost;
	}
	public void setCurrent_repost(int current_repost) {
		this.current_repost = current_repost;
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
	public Date getPost_date() {
		return post_date;
	}
	public void setPost_date(Date post_date) {
		this.post_date = post_date;
	}
	public Date getExpire_date() {
		return expire_date;
	}
	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}
	public String getCredit_id() {
		return credit_id;
	}
	public void setCredit_id(String credit_id) {
		this.credit_id = credit_id;
	}
	public boolean isFeatured() {
		return featured;
	}
	public void setFeatured(boolean featured) {
		this.featured = featured;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (job_id ^ (job_id >>> 32));
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
		JobPosts other = (JobPosts) obj;
		if (job_id != other.job_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JobPosts [job_id=" + job_id + ", cmpny_id=" + cmpny_id
				+ ", author_user_id=" + author_user_id + ", job_title="
				+ job_title + ", indstry_sctr_code=" + indstry_sctr_code
				+ ", job_lvl_code=" + job_lvl_code + ", job_type_code="
				+ job_type_code + ", job_desc=" + job_desc
				+ ", region_city_code=" + region_city_code + ", vacant_num="
				+ vacant_num + ", slry_code=" + slry_code + ", yr_exp_code="
				+ yr_exp_code + ", hide_cmpny_dtl=" + hide_cmpny_dtl
				+ ", slry_neg=" + slry_neg + ", fresh_grad=" + fresh_grad
				+ ", email_alert=" + email_alert + ", acad_code=" + acad_code
				+ ", stat_code=" + stat_code + ", auto_repost_interval="
				+ auto_repost_interval + ", max_repost=" + max_repost
				+ ", current_repost=" + current_repost + ", created_date="
				+ created_date + ", modified_date=" + modified_date
				+ ", post_date=" + post_date + ", expire_date=" + expire_date
				+ ", credit_id=" + credit_id + ", featured=" + featured + "]";
	}
}
