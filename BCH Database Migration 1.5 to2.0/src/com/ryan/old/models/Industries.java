package com.ryan.old.models;

import java.util.ArrayList;

public class Industries {
	private String indstry_code;
	private String indstry_desc;
	private boolean inactive;
	private long industry_id;
	private ArrayList<Sectors> sectors = new ArrayList<Sectors>();
	
	public Industries() {
		super();
	}
	public Industries(String indstry_code) {
		super();
		this.indstry_code = indstry_code;
	}
	public String getIndstry_code() {
		return indstry_code;
	}
	public void setIndstry_code(String indstry_code) {
		this.indstry_code = indstry_code;
	}
	public String getIndstry_desc() {
		return indstry_desc;
	}
	public void setIndstry_desc(String indstry_desc) {
		this.indstry_desc = indstry_desc;
	}
	public boolean isInactive() {
		return inactive;
	}
	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}
	public long getIndustry_id() {
		return industry_id;
	}
	public void setIndustry_id(long industry_id) {
		this.industry_id = industry_id;
	}
	public ArrayList<Sectors> getSectors() {
		return sectors;
	}
	public void setSectors(ArrayList<Sectors> sectors) {
		this.sectors = sectors;
	}
	public void addSector(Sectors sector) {
		this.sectors.add(sector);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((indstry_code == null) ? 0 : indstry_code.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Industries other = (Industries) obj;
		if (indstry_code == null) {
			if (other.indstry_code != null)
				return false;
		} else if (!indstry_code.equals(other.indstry_code))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Industries [indstry_code=" + indstry_code + ", indstry_desc="
				+ indstry_desc + ", inactive=" + inactive + ", industry_id="
				+ industry_id + ", sectors=" + sectors + "]";
	}

}
