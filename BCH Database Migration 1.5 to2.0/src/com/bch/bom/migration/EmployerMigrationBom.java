package com.bch.bom.migration;

import java.util.ArrayList;
import java.util.Iterator;

import com.bch.bean.mappings.Employer;
import com.bch.bean.mappings.User;
import com.bch.bom.UserUtility;
import com.ryan.old.dao.CompaniesDao;
import com.ryan.old.dao.SecurityUsersDao;
import com.ryan.old.models.Companies;
import com.ryan.old.models.SecurityUsers;

public class EmployerMigrationBom {
	public ArrayList<Employer> buildEmployers() {
		ArrayList<Companies> companies = this.getAllEmployers();
		ArrayList<SecurityUsers> employerStaff = this.getAllEmployerStaff();
		
		ArrayList<Employer> employers = new ArrayList<Employer>();
		
		for(Iterator<Companies> i = companies.iterator(); i.hasNext();) {
			Companies company = i.next();
			
			Employer employer = new Employer();
			employer.setName(company.getCmpny_name());
			employer.setDescription(company.getCmpny_desc());
			employer.setTin_number(company.getTin_num());
			employer.setSec_number(company.getSec_num());
			//employer.setIndustry_id(company.getIndstry_sctr_code());
			//employer.setIndustry_sector_id(company.getIndstry_sctr_code());
			employer.setCountry_code(company.getCountry_code());
			employer.setOffice_phone_number(company.getPhone());
			employer.setFax_number(company.getFax());
			employer.setUrl_website(company.getWebsite());
			employer.setProfile_picture(company.getLogo());
			employer.setDate_created(company.getCreated_date());
			employer.setDate_modified(company.getModified_date());
			
			User user = null;
			
			if(employerStaff.contains(new SecurityUsers(company.getUser_id()))) {
				SecurityUsers su = employerStaff.get(employerStaff.indexOf(new SecurityUsers(company.getUser_id())));
				
				user = new User();
				
				// user
				user.setEmail(su.getEmail());
				user.setPassword(su.getPassword());
				user.setDate_created(su.getCreated_date());
				user.setGroup_id(UserUtility.groupCode(su.getGrp_code()));
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
			}
			
			
			employer.setUser(user);
			employers.add(employer);
		}
		
		return employers;
	}
	
	public ArrayList<Companies> getAllEmployers() {
		CompaniesDao eDao = new CompaniesDao();
		return eDao.retrieveAll();
	}
	
	public ArrayList<SecurityUsers> getAllEmployerStaff() {
		SecurityUsersDao suDao = new SecurityUsersDao();		
		return suDao.retrieveAllEmployerStaff();
	}
}
