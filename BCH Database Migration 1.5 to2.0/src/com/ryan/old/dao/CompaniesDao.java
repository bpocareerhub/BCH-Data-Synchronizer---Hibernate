package com.ryan.old.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ryan.old.models.Companies;

public class CompaniesDao extends Dao {
	
	public Companies buildResultObject(ResultSet rs) {
		Companies company = null;
		
		try {
			company = new Companies(); 
			company.setCmpny_id(rs.getLong("cmpny_id"));
			company.setUser_id(rs.getLong("user_id"));
			company.setCmpny_name(rs.getString("cmpny_name"));
			company.setCmpny_desc(rs.getString("cmpny_desc"));
			company.setLogo(rs.getString("logo"));
			company.setTin_num(rs.getString("tin_num"));
			company.setSec_num(rs.getString("sec_num"));
			company.setIndstry_sctr_code(rs.getString("indstry_sctr_code"));
			company.setWebsite(rs.getString("website"));
			company.setCreated_date(rs.getDate("created_date"));
			company.setModified_date(rs.getDate("modified_date"));
			company.setAutosend_news(rs.getBoolean("autosend_news"));
			company.setAllow_social_site(rs.getBoolean("allow_social_site"));
			company.setAddress(rs.getString("address"));
			company.setCountry_code(rs.getString("country_code"));
			company.setPost_credits(rs.getLong("post_credits"));
			company.setResume_credits(rs.getLong("resume_credits"));
			
			// company contact
			company.setPhone(rs.getString("phone"));
			company.setFax(rs.getString("fax"));
			company.setC_email(rs.getString("c_email"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return company;
	}
	
	public ArrayList<Companies> retrieveAll() {
		ArrayList<Companies> Employers = new ArrayList<Companies>();
		
		String sql = "select cp.*, if(ccp.credits is null, 0 , ccp.credits) as post_credits, if(ccr.credits is null, 0 , ccr.credits) as resume_credits," +
				"ca.address, ca.country_code, ccon.* " +
				"FROM company_profile as cp " +
				"left join company_address as ca on cp.cmpny_id = ca.cmpny_id " +
				"left join company_credits as cc on cp.cmpny_id = cc.cmpny_id " +
				"left join company_contact as ccon on cp.cmpny_id = ccon.cmpny_id " +
				"left join company_credits_post as ccp on cp.cmpny_id = ccp.cmpny_id " +
				"left join company_credits_resume as ccr on cp.cmpny_id = ccr.cmpny_id " +
				"group by cp.cmpny_id;";
		ResultSet rs = this.getResultSet(sql);

		try {
			while(rs.next()) {				
				Employers.add(this.buildResultObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return Employers;
	}
}
