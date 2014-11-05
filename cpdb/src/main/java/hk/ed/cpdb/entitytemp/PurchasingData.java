package hk.ed.cpdb.entitytemp;

import java.util.Date;

public class PurchasingData {

	private String purchsingOrg;
	private String vendor;
	private String Rank;

	public PurchasingData(String purchsingOrg, String vendor, String rank) {
		super();
		this.purchsingOrg = purchsingOrg;
		this.vendor = vendor;
		Rank = rank;
	}

	public String getPurchsingOrg() {
		return purchsingOrg;
	}

	public void setPurchsingOrg(String purchsingOrg) {
		this.purchsingOrg = purchsingOrg;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

}