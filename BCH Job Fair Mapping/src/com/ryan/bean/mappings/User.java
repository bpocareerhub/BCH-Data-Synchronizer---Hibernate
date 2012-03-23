package com.ryan.bean.mappings;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ryan.bom.Security;

@Entity
@Table (name="security_users")
public class User {
	
	@Id
	@GeneratedValue
	@Column (name="user_id", unique=true, nullable=false)	
	private long user_id;
	
	@Column (name="grp_code")
	private String group_code = "EMP";
	
	@Column (name="username")
	private String username;
	
	@Column (name="password")
	private String password = Security.md5("user2012");
	
	@Column (name="email")
	private String email;
	
	@Column (name="activation_code")
	private String activation_code = "bpocareerhub";
	
	@Column (name="created_date")
	private Date created_date;
	
	@Column (name="modified_date")
	private Date modified_date;
	
	@Column (name="last_update_date")
	private Date last_update_date;
	
	@Column (name="last_login")
	private Date last_login;
	
	@Column (name="ref_code")
	private String ref_code = "ABC";
	
	@Column (name="activated")
	private boolean activated = false;
	
	public User() {
		super();
	}
	
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getGroup_code() {
		return group_code;
	}
	public void setGroup_code(String group_code) {
		this.group_code = group_code;
	}
	public String getRef_code() {
		return ref_code;
	}
	public void setRef_code(String ref_code) {
		this.ref_code = ref_code;
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
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", group_code=" + group_code
				+ ", username=" + username + ", password=" + password
				+ ", email=" + email + ", activation_code=" + activation_code
				+ ", created_date=" + created_date + ", modified_date="
				+ modified_date + ", last_update_date=" + last_update_date
				+ ", last_login=" + last_login + "]";
	}
}
