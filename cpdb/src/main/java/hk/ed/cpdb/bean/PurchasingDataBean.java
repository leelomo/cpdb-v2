package hk.ed.cpdb.bean;

import hk.ed.cpdb.entitytemp.ChangeLog;
import hk.ed.cpdb.entitytemp.PurchasingData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
public class PurchasingDataBean {

	private List<PurchasingData> purchasingDatas = new ArrayList<PurchasingData>();

	public List<PurchasingData> getPurchasingDatas() {
		purchasingDatas.add(new PurchasingData("1000 City Super Limited", "1001044 MAKOTO SHOKAI", "1"));
		purchasingDatas.add(new PurchasingData("1001 SFA Limited", "1001044 MAKOTO SHOKAI", "1"));
		purchasingDatas.add(new PurchasingData("1002 SFB Limited", "1001044 MAKOTO SHOKAI", "1"));

		return purchasingDatas;
	}

	public void setPurchasingDatas(List<PurchasingData> purchasingDatas) {
		this.purchasingDatas = purchasingDatas;
	}

	// public List<ChangeLog> getChangeLogs() {
	// changeLogs.add(new ChangeLog("10000", new Date(), "user1", "Creation",
	// "HK", "N/A"));
	// changeLogs.add(new ChangeLog("10005", new Date(), "user1",
	// "Article Content Amendment", "HK",
	// "Field: TILL Description | Language: English | Old: N/A | New: " +
	// " Testing " + "Field: Commercial Photo | Old: False | New: True"));
	// changeLogs.add(new ChangeLog("10005", new Date(), "user1",
	// "Article Content Amendment", "HK",
	// "Field: QA Status | Old: NULL | New: PHOT"));
	// return changeLogs;
	// }
	//

}