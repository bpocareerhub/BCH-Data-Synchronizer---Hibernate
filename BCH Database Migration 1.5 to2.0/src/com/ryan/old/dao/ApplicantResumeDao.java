package com.ryan.old.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ryan.old.models.ApplicantResume;

public class ApplicantResumeDao extends Dao {

	public ArrayList<ApplicantResume> retrieveAll() {
		ArrayList<ApplicantResume> applicantResumes = new ArrayList<ApplicantResume>();
		String sql = "select * from applicant_resume group by person_id";
		
		ResultSet rs = this.getResultSet(sql);
		
		try {
			while(rs.next()) {
				ApplicantResume applicantResume = new ApplicantResume();
				applicantResume.setResume_id(rs.getLong("resume_id"));
				applicantResume.setPerson_id(rs.getLong("person_id"));
				applicantResume.setResume_file(rs.getString("RESUME_FILE"));
				applicantResume.setCreated_date(rs.getDate("created_date"));
				applicantResume.setModified_date(rs.getDate("modified_date"));
				applicantResumes.add(applicantResume);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return applicantResumes;
	}
}
