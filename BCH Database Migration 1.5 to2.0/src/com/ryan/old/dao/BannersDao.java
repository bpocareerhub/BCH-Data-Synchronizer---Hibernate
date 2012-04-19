package com.ryan.old.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ryan.old.models.Banners;

public class BannersDao extends Dao {
	private Banners buildBannerObject(ResultSet rs) {
		Banners banner = null;
		try {
			banner = new Banners();
			banner.setId(rs.getLong("id"));
			banner.setImage_name(rs.getString("image_name"));
			banner.setLocation(rs.getString("location"));
			banner.setUrl(rs.getString("url"));
			banner.setInactive(rs.getBoolean("inactive"));
			banner.setStart_date(rs.getDate("start_date"));
			banner.setExpire_date(rs.getDate("expire_date"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return banner;		
	}
	
	public ArrayList<Banners> retrieveAll() {
		ArrayList<Banners> users = new ArrayList<Banners>();
		String sql = "select * from banner_ads";
		
		ResultSet rs = this.getResultSet(sql);
		
		try {
			while(rs.next()) {
				users.add(this.buildBannerObject(rs));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users;
	}
}
