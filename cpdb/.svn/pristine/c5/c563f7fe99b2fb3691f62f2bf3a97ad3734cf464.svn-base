package hk.ed.cpdb.bean;

import hk.ed.cpdb.entitytemp.ChangeLog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
public class ChangeLogBean {

	private List<ChangeLog> changeLogs = new ArrayList<ChangeLog>();

	public List<ChangeLog> getChangeLogs() {
		changeLogs.add(new ChangeLog("10000", new Date(), "user1", "Creation", "HK", "N/A"));
		changeLogs.add(new ChangeLog("10005", new Date(), "user1", "Article Content Amendment", "HK",
				"Field: TILL Description | Language: English | Old: N/A | New: " + " Testing " + "Field: Commercial Photo | Old: False | New: True"));
		changeLogs.add(new ChangeLog("10005", new Date(), "user1", "Article Content Amendment", "HK", "Field: QA Status | Old: NULL | New: PHOT"));
		return changeLogs;
	}

	public void setChangeLogs(List<ChangeLog> changeLogs) {
		this.changeLogs = changeLogs;
	}

}