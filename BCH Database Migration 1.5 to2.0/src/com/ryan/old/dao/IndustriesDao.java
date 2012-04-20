package com.ryan.old.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ryan.old.models.Industries;
import com.ryan.old.models.Sectors;

public class IndustriesDao extends Dao {

	public long getIndustryByIndustryCode(String industry_code) {
		
		ArrayList<Industries> industries = this.retrieveAllIndustries();
		if(industries.contains(new Industries(industry_code))) {
			return industries.get(industries.indexOf(new Industries(industry_code))).getIndustry_id();
		}
		
		return 0;
	}
	
	public long getSectorIdBySectorCode(String sector_code) {

		ArrayList<Sectors> sectors = this.retrieveAllSectors();
		if(sectors.contains(new Industries(sector_code))) {
			return sectors.get(sectors.indexOf(new Sectors(sector_code))).getIndustry_sector_id();
		}
		return 0;
	}
	
	public long getIndustryIdBySectorCode(String sector_code) {
		ArrayList<Sectors> sectors = this.retrieveAllSectors();
		if(sectors.contains(new Industries(sector_code))) {
			return this.getIndustryByIndustryCode(sectors.get(sectors.indexOf(new Sectors(sector_code))).getIndstry_code());
		}
		return 0;
	}
	
	public ArrayList<Industries> retrieveAll() {
		ArrayList<Industries> industries = this.retrieveAllIndustries();
		ArrayList<Sectors> sectors = this.retrieveAllSectors();
		
		for(Sectors sector : sectors) {
			if(industries.contains(new Industries(sector.getIndstry_code()))) {
				industries.get(industries.indexOf(new Industries(sector.getIndstry_code()))).addSector(sector);				
			}
		}
		
		return industries;
	}

	private ArrayList<Industries> retrieveAllIndustries() {

		String sql = "select * from industry";
		ArrayList<Industries> industries = new ArrayList<Industries>();
		ResultSet rs = this.getResultSet(sql);

		try {
			while(rs.next()) {
				Industries industry = new Industries();
				industry.setIndstry_code(rs.getString("indstry_code"));
				industry.setIndstry_desc(rs.getString("indstry_desc"));
				industry.setInactive(rs.getBoolean("inactive"));
				industry.setIndustry_id(rs.getLong("industry_id"));
				industries.add(industry);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return industries;
		
	}

	private ArrayList<Sectors> retrieveAllSectors() {
		
		String sql = "select * from industry_sector";
		ArrayList<Sectors> sectors = new ArrayList<Sectors>();
		ResultSet rs = this.getResultSet(sql);

		try {
			while(rs.next()) {				
				Sectors sector = new Sectors();
				sector.setIndstry_sctr_code(rs.getString("indstry_sctr_code"));
				sector.setIndstry_sctr_desc(rs.getString("indstry_sctr_desc"));
				sector.setIndstry_code(rs.getString("indstry_code"));
				sector.setIndustry_sector_id(rs.getLong("industry_sector_id"));
				sectors.add(sector);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sectors;
	}
	
}
