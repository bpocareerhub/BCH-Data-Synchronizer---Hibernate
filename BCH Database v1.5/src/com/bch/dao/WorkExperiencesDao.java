package com.bch.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bch.models.WorkExperiences;

public class WorkExperiencesDao extends Dao {
	
	private WorkExperiences buildWorkExperienceObject(ResultSet rs) {
		WorkExperiences we = null;
		try {
			we = new WorkExperiences();
			we.setPerson_id(rs.getLong("person_id"));
			we.setApplicant_professional_background_id(rs.getLong("applicant_professional_background_id"));
			we.setApp_prof_id(rs.getBoolean("app_prof_id"));
			we.setJob_pos(rs.getString("job_pos"));
			we.setIndstry_sctr_code(rs.getString("indstry_sctr_code"));
			we.setIndstry_sctr_othr(rs.getString("indstry_sctr_othr"));
			we.setAcct_type(rs.getString("acct_type"));
			we.setNonvoice(rs.getBoolean("nonvoice"));
			we.setVoice(rs.getBoolean("voice"));
			we.setCmpny_name(rs.getString("cmpny_name"));
			we.setSlry_code(rs.getString("slry_code"));
			we.setJob_desc(rs.getString("job_desc"));
			we.setEmp_prd_from_month(rs.getString("emp_prd_from_month"));
			we.setEmp_prd_to_month(rs.getString("emp_prd_to_month"));
			we.setEmp_prd_from_year(rs.getInt("emp_prd_from_year"));
			we.setEmp_prd_to_year(rs.getInt("emp_prd_to_year"));
			we.setEmp_prd_present(rs.getBoolean("emp_prd_present"));
			we.setCreated_date(rs.getDate("created_date"));
			we.setModified_date(rs.getDate("modified_date"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return we;
	}
	
	public ArrayList<WorkExperiences> retrieveAll() {
		ArrayList<WorkExperiences> we = new ArrayList<WorkExperiences>();
		String sql = "select * from applicant_professional_background ";
		
		ResultSet rs = this.getResultSet(sql);
		try {
			while(rs.next()) {
				we.add(this.buildWorkExperienceObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return we;
	}
}
