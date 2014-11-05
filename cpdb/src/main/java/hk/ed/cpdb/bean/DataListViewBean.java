package hk.ed.cpdb.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class DataListViewBean {

	private List list1s = new ArrayList<>();
	private List list2s = new ArrayList<>();
	private List list3s = new ArrayList<>();
	private List list4s = new ArrayList<>();
	private List list5s = new ArrayList<>();
	private List list6s = new ArrayList<>();
	private List list7s = new ArrayList<>();
	private List list8s = new ArrayList<>();
	private List list9s = new ArrayList<>();

	public List getList1s() {

		list1s.add("Listing (DC)");
		list1s.add("\"Auto PO\" Indicator");
		list1s.add("RP Type");
		list1s.add("DC Safety Stock");
		list1s.add("Storage Location In Logistic DC #");
		list1s.add("Batch Management ");
		list1s.add("Batch Management Type");

		return list1s;
	}

	public void setList1s(List list1s) {
		this.list1s = list1s;
	}

	public List getList2s() {
		list2s.add("Putaway Strategy - Hazardous Material Number");
		list2s.add("Putaway Strategy - Stock Removal");
		list2s.add("Putaway Strategy - Stock Placement");
		list2s.add("Putaway Strategy - Storage Section Ind.");
		list2s.add("Storage Location In Logistic DC #");
		list2s.add("Batch Management ");
		list2s.add("Batch Management Type");
		return list2s;
	}

	public void setList2s(List list2s) {
		this.list2s = list2s;
	}

	public List getList3s() {
		list3s.add("Price Control");
		list3s.add("Standard Price");
		list3s.add("Moving Price");

		return list3s;
	}

	public void setList3s(List list3s) {
		this.list3s = list3s;
	}

	public List getList4s() {
		list4s.add("Listing Store");
		list4s.add("\"Auto PO\" Indicator");
		list4s.add("Auto Transfer");
		list4s.add("Auto Transfer Unit");
		list4s.add("RP Type");
		list4s.add("Auto Transfer Minimum");
		list4s.add("Auto Transfer Maximum");
		list4s.add("Store Safety Stock");
		list4s.add("Minimum Safety Stock");
		list4s.add("No. of Face");
		list4s.add("MD per Face");
		list4s.add("Display Qty");
		list4s.add("Price Control");
		list4s.add("Standard Price");
		list4s.add("Moving Price");

		return list4s;
	}

	public void setList4s(List list4s) {
		this.list4s = list4s;
	}

	public List getList5s() {
		list5s.add("Product Assortment 1 - Unique");
		list5s.add("Product Assortment 2-- Premium");
		list5s.add("Product Assortment 3 - Exclusive");
		list5s.add("Product Assortment 4 - Own Brand");
		list5s.add("Environmentally Friendly");
		list5s.add("Selling Mode");
		list5s.add("Service Counter");

		return list5s;
	}

	public void setList5s(List list5s) {
		this.list5s = list5s;
	}

	public List getList6s() {
		list6s.add("Tasting Note");
		list6s.add("Colors");
		list6s.add("Scent");
		list6s.add("Buyer Note");

		return list6s;
	}

	public void setList6s(List list6s) {
		this.list6s = list6s;
	}

	public List getList7s() {

		list7s.add("Monthly Estimation Volume per PC or HG");
		list7s.add("Replacement");
		list7s.add("Replaced Item Number");
		list7s.add("New Item From Local Or Foreign Vendor");

		list7s.add("Market Price - Same Item Or Similar Item Price ??");
		list7s.add("Market Price - Competitors Price ??");
		list7s.add("Market Price - Major Two Stores ??");
		list7s.add("Estimated Listing Date");
		list7s.add("Apply SVE (Y/N)");
		list7s.add("Apply SVE Date");
		list7s.add("Other vendor list");

		return list7s;
	}

	public void setList7s(List list7s) {
		this.list7s = list7s;
	}

	public List getList8s() {
		list8s.add("Product Introduction (FAB)");
		list8s.add("Shelf Talker");
		list8s.add("Memo1 *");
		list8s.add("Memo2 *");
		list8s.add("Memo3 *");
		list8s.add("Memo4 *");
		return list8s;
	}

	public void setList8s(List list8s) {
		this.list8s = list8s;
	}

	public List getList9s() {
		list9s.add("Cooking instruction");
		list9s.add("Recipe ID");
		list9s.add("Recipe I");
		list9s.add("Recipe II");
		list9s.add("POP I");
		list9s.add("POP II");
		list9s.add("Others I");
		list9s.add("Others II");

		return list9s;
	}

	public void setList9s(List list9s) {
		this.list9s = list9s;
	}

}
