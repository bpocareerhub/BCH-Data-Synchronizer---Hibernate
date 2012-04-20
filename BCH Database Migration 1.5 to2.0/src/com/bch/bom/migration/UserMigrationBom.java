package com.bch.bom.migration;

import java.util.ArrayList;
import java.util.Iterator;

import com.bch.bean.mappings.User;
import com.ryan.old.dao.ApplicantProfessionalBackgroundDao;
import com.ryan.old.dao.ApplicantResumeDao;
import com.ryan.old.dao.SecurityUsersDao;
import com.ryan.old.models.ApplicantProfessionalBackground;
import com.ryan.old.models.ApplicantResume;
import com.ryan.old.models.Companies;
import com.ryan.old.models.SecurityUsers;

public class UserMigrationBom {

	public ArrayList<User> buildEmployerStaff() {
		ArrayList<SecurityUsers> susers = this.getAllEmployerStaff(); 
		ArrayList<User> users = new ArrayList<User>();
		ArrayList<Companies> employer = new EmployerMigrationBom().getAllEmployers();
			
		for(Iterator<SecurityUsers> i = susers.iterator(); i.hasNext();) {
			
			SecurityUsers su = i.next();
			User user = new User();
			
			// user
			user.setEmail(su.getEmail());
			user.setPassword(su.getPassword());
			user.setDate_created(su.getCreated_date());
			user.setGroup_id(3);
			user.setAccount_type_id(1);
			user.setDate_last_login(su.getLast_login());
			user.setActivation_code(su.getActivation_code());
			user.setActivated(su.isActivated());
			user.setDate_activated(su.getActivation_date());

			// user_profile
			user.setFirstname(su.getFirst_name());
			user.setMiddlename(su.getMiddle_name());
			user.setLastname(su.getLast_name());
			user.setDate_of_birth(su.getBirth_date());
			user.setDate_modified(su.getModified_date());
			user.setGender_code(su.getGender_code());
			user.setProfile_picture(su.getProfile_picture());
			user.setNationality_code(su.getNatl_code());
			user.setPhone_number(su.getPhone_num());
			user.setMobile_number(su.getMobile_num());
			user.setAddress_details(su.getAddress());
			user.setAddress_region_code(su.getRegion_city_code());
			user.setAddress_country_code(su.getCountry_code());
			user.setMarital_status_code(su.getMarital_stat_code());
			users.add(user);
		}
			
		return users;
	}
	
	public ArrayList<User> buildCareerSeekers() {

		ArrayList<SecurityUsers> security_users = this.getApplicants();
		ArrayList<ApplicantResume> applicant_resumes = this.getApplicantResumes();
		ArrayList<ApplicantProfessionalBackground> apb = this.getProfessionalBackgrounds();
		ArrayList<User> users = new ArrayList<User>();
		
		for(Iterator<SecurityUsers> i = security_users.iterator(); i.hasNext();) {
			SecurityUsers su = i.next();
			
			// users
			User user = new User();			
			user.setEmail(su.getEmail());
			user.setPassword(su.getPassword());
			user.setDate_created(su.getCreated_date());
			user.setGroup_id(2);
			user.setDate_last_login(su.getLast_login());
			user.setActivation_code(su.getActivation_code());
			user.setActivated(su.isActivated());
			user.setDate_activated(su.getActivation_date());

			// user_profile
			user.setFirstname(su.getFirst_name());
			user.setMiddlename(su.getMiddle_name());
			user.setLastname(su.getLast_name());
			user.setDate_of_birth(su.getBirth_date());
			user.setDate_modified(su.getModified_date());
			user.setGender_code(su.getGender_code());
			user.setProfile_picture(su.getProfile_picture());
			user.setNationality_code(su.getNatl_code());
			user.setPhone_number(su.getPhone_num());
			user.setMobile_number(su.getMobile_num());
			user.setAddress_details(su.getAddress());
			user.setAddress_region_code(su.getRegion_city_code());
			user.setAddress_country_code(su.getCountry_code());
			user.setMarital_status_code(su.getMarital_stat_code());

			// user_profile_detail
			user.setWilling_to_shifting_schedules(su.isShifting_schedules());
			user.setWilling_to_relocate(su.isWilling_to_relocate());
			user.setWilling_to_holidays_weekends(su.isHoliday_weekends());
			user.setBackground_check(su.isBackground_check());

			// lets get the resume of the applicant
			try {
				ApplicantResume applicant_resume = new ApplicantResume(su.getPerson_id());
				if(applicant_resumes.contains(applicant_resume)) {
					ApplicantResume ar = applicant_resumes.get(applicant_resumes.indexOf(applicant_resume));
					user.setResume_filename(ar.getResume_file());
					user.setResume_date_upload(ar.getCreated_date());
					user.setResume_date_modified(ar.getModified_date());
				}
			} catch(Exception e) {
				
			}
			users.add(user);
		}

		return users;
	}

	private ArrayList<SecurityUsers> getApplicants() {
		SecurityUsersDao suDao = new SecurityUsersDao();
		return suDao.retrieveAllApplicants();
	}

	private ArrayList<ApplicantResume> getApplicantResumes() {
		ApplicantResumeDao arDao = new ApplicantResumeDao();
		return arDao.retrieveAll();
	}
	
	public ArrayList<SecurityUsers> getAllEmployerStaff() {
		SecurityUsersDao suDao = new SecurityUsersDao();		
		return suDao.retrieveAllEmployerStaff();
	}
	
	private ArrayList<ApplicantProfessionalBackground> getProfessionalBackgrounds() {
		ApplicantProfessionalBackgroundDao apbDao = new ApplicantProfessionalBackgroundDao();
		return apbDao.retrieveAll();
	}
}
