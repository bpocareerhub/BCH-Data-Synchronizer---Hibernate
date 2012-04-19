package com.ryan.old.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;

import com.bch.bom.UserUtility;
import com.ryan.old.models.ApplicantProfessionalBackground;

public class ApplicantProfessionalBackgroundDao extends Dao {
	
	public ApplicantProfessionalBackground buildUserObject(ResultSet rs) {
		ApplicantProfessionalBackground apb = null;
		
		try {
			apb = new ApplicantProfessionalBackground();
			apb.setApplicant_professional_background_id(rs.getLong("applicant_professional_background_id"));
			apb.setPerson_id(rs.getLong("person_id"));
			apb.setApp_prof_id(rs.getBoolean("app_prof_id"));
			apb.setJob_pos(rs.getString("job_pos"));
			apb.setIndstry_sctr_code(rs.getString("indstry_sctr_code"));
			apb.setIndstry_sctr_othr(rs.getString("indstry_sctr_othr"));
			apb.setAcct_type(rs.getString("acct_type"));
			apb.setNonvoice(rs.getBoolean("nonvoice"));
			apb.setVoice(rs.getBoolean("voice"));
			apb.setCmpny_name(rs.getString("cmpny_name"));
			apb.setSlry_code(rs.getInt("slry_code"));
			apb.setJob_desc(rs.getString("job_desc"));
			apb.setEmp_prd_from(new GregorianCalendar(rs.getInt("emp_prd_from_year"), UserUtility.monthChartoInt(rs.getString("emp_prd_from_month")), 1).getTime());
			apb.setEmp_prd_to(new GregorianCalendar(rs.getInt("emp_prd_to_year"), UserUtility.monthChartoInt(rs.getString("emp_prd_to_month")), 1).getTime());
			apb.setEmp_prd_present(rs.getBoolean("emp_prd_present"));
			apb.setCreated_date(rs.getDate("created_date"));
			apb.setModified_date(rs.getDate("modified_date"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return apb;
	}
	
	public ArrayList<ApplicantProfessionalBackground> retrieveAll() {
		ArrayList<ApplicantProfessionalBackground> apb = new ArrayList<ApplicantProfessionalBackground>();
		String sql = "select * from applicant_professional_background";

		ResultSet rs = this.getResultSet(sql);
		
		try {
			while(rs.next()) {
				apb.add(this.buildUserObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return apb;
	}
}
