package com.bch.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bch.models.SecurityUsers;

public class SecurityUsersDao extends Dao {
	
	private SecurityUsers buildUserObject(ResultSet rs) {
		SecurityUsers user = null;
		try {
			user = new SecurityUsers();
			user.setUser_id(rs.getLong("user_id"));
			user.setGrp_code(rs.getString("grp_code"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setEmail(rs.getString("email"));
			user.setActivation_code(rs.getString("activation_code"));
			user.setCreated_date(rs.getDate("created_date"));
			user.setModified_date(rs.getDate("modified_date"));
			user.setLast_update_date(rs.getDate("last_update_date"));
			user.setLast_login(rs.getDate("last_login"));
			user.setRef_code(rs.getString("ref_code"));
			user.setInactive(rs.getBoolean("inactive"));
			user.setActivated(rs.getBoolean("activated"));
			user.setInvalid_email(rs.getBoolean("invalid_email"));
			user.setActivation_date(rs.getDate("activation_date"));
			user.setNew_password_flg(rs.getBoolean("new_password_flg"));
			user.setSrc_code(rs.getString("src_code"));
			user.setSrc_specific(rs.getString("src_specific"));
			
			// person
			user.setPerson_id(rs.getLong("person_id"));
			user.setFirst_name(rs.getString("first_name"));
			user.setMiddle_name(rs.getString("middle_name"));
			user.setLast_name(rs.getString("last_name"));
			user.setShifting_schedules(rs.getBoolean("shifting_schedules"));
			user.setHoliday_weekends(rs.getBoolean("holidays_weekends"));
			user.setWilling_to_relocate(rs.getBoolean("willing_to_relocate"));
			user.setBackground_check(rs.getBoolean("background_check"));
			user.setHighest_educational_attainment(rs.getString("highest_educational_attainment"));
			user.setProfile_picture(rs.getString("profile_picture"));
			user.setFile_type(rs.getString("file_type"));
			
			// person address
			user.setAddress(rs.getString("address"));
			user.setCountry_code(rs.getString("country_code"));
			user.setRegion_city_code(rs.getString("region_city_code"));
			
			// person phone
			user.setPhone_num(rs.getString("phone_num"));
			user.setMobile_num(rs.getString("mobile_num"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public ArrayList<SecurityUsers> retrieveAll() {
		ArrayList<SecurityUsers> users = new ArrayList<SecurityUsers>();
		String sql = "select su.*, p.*, pa.*, pp.* from security_users as su " +
				"inner join person as p on su.user_id = p.user_id " +
				"inner join person_address as pa on p.person_id = pa.person_id " +
				"inner join person_phone as pp on p.person_id = pp.person_id";
		
		ResultSet rs = this.getResultSet(sql);
		
		try {
			while(rs.next()) {
				users.add(this.buildUserObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}
}
