package com.ryan.old.models;

public class Sectors {
	private String indstry_sctr_code;
	private String indstry_sctr_desc;
	private String indstry_code;
	private boolean inactive;
	private long industry_sector_id;
	
	public Sectors() {
		super();
	}
	public Sectors(String indstry_sctr_code) {
		super();
		this.indstry_sctr_code = indstry_sctr_code;
	}
	public String getIndstry_sctr_code() {
		return indstry_sctr_code;
	}
	public void setIndstry_sctr_code(String indstry_sctr_code) {
		this.indstry_sctr_code = indstry_sctr_code;
	}
	public String getIndstry_sctr_desc() {
		return indstry_sctr_desc;
	}
	public void setIndstry_sctr_desc(String indstry_sctr_desc) {
		this.indstry_sctr_desc = indstry_sctr_desc;
	}
	public String getIndstry_code() {
		return indstry_code;
	}
	public void setIndstry_code(String indstry_code) {
		this.indstry_code = indstry_code;
	}
	public boolean isInactive() {
		return inactive;
	}
	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}
	public long getIndustry_sector_id() {
		return industry_sector_id;
	}
	public void setIndustry_sector_id(long industry_sector_id) {
		this.industry_sector_id = industry_sector_id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((indstry_sctr_code == null) ? 0 : indstry_sctr_code
						.hashCode());
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
		Sectors other = (Sectors) obj;
		if (indstry_sctr_code == null) {
			if (other.indstry_sctr_code != null)
				return false;
		} else if (!indstry_sctr_code.equals(other.indstry_sctr_code))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Sectors [indstry_sctr_code=" + indstry_sctr_code
				+ ", indstry_sctr_desc=" + indstry_sctr_desc
				+ ", indstry_code=" + indstry_code + ", inactive=" + inactive
				+ ", industry_sector_id=" + industry_sector_id + "]";
	}
	
}
