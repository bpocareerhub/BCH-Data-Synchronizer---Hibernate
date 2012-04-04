package com.bch.runtime;

import java.util.ArrayList;
import java.util.Iterator;

import com.bch.models.SecurityUsers;
import com.bch.models.WorkExperiences;

public class Main {
	public static void main(String[] args) {
		ArrayList<SecurityUsers> su = new ArrayList<SecurityUsers>();
		ArrayList<WorkExperiences> we = new ArrayList<WorkExperiences>();
		
		for (Iterator<WorkExperiences> i = we.iterator(); i.hasNext();) {
			WorkExperiences workExperiences = i.next();
			
			SecurityUsers susers = new SecurityUsers(workExperiences.getPerson_id());
			if(su.contains(susers)) {
				su.get(su.indexOf(susers)).setWorkExperiences(workExperiences);
			}
			//System.out.println(su.contains(susers));
		}
	}
}
