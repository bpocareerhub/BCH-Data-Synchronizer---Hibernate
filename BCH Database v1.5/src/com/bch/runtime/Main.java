package com.bch.runtime;

import java.util.ArrayList;

import com.bch.dao.EducationalBackgroundDao;
import com.bch.models.EducationalBackground;

public class Main {
	public static void main(String[] args) {
		EducationalBackgroundDao eb = new EducationalBackgroundDao();
		ArrayList<EducationalBackground> ebackground = eb.retrieveAll();
		System.out.println(ebackground.size());
	}
}
