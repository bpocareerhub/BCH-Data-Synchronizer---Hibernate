package com.bch.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bch.models.EducationalBackground;

public class EducationalBackgroundDao extends Dao {
	
	private EducationalBackground buildEducationalBackgroundObject(ResultSet rs) {
		EducationalBackground eb = null;
		try {
			eb = new EducationalBackground();
			eb.setApplicant_educational_background_id(rs.getLong("applicant_educational_background_id"));
			eb.setAcad_code(rs.getString("acad_code"));
			eb.setEducational_level(rs.getString("educational_level"));
			eb.setStatus(rs.getString("status"));
			eb.setSchool_name(rs.getString("school_name"));
			eb.setCourse(rs.getString("course"));
			eb.setPeriod_from(rs.getInt("period_from"));
			eb.setPeriod_to(rs.getInt("period_to"));
			eb.setCreated_date(rs.getDate("created_date"));
			eb.setModified_date(rs.getDate("modified_date"));
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
		return eb;
	}
	
	public ArrayList<EducationalBackground> retrieveAll() {
		ArrayList<EducationalBackground> eb = new ArrayList<EducationalBackground>();
		String sql = "select * from applicant_educational_background";
		
		ResultSet rs = this.getResultSet(sql);
		try {
			while(rs.next()) {
				eb.add(this.buildEducationalBackgroundObject(rs));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return eb;
	}
}
