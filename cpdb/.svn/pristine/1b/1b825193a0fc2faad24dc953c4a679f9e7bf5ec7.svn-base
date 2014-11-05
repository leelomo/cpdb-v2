package hk.ed.cpdb.bean;

import hk.ed.cpdb.entitytemp.Worklist;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "worklistBean")
@ViewScoped
public class WorklistBean {

	private List<Worklist> worklists;

	private List<Worklist> selectList = new ArrayList<Worklist>();

	private FilterBean filterBean = new FilterBean("worklistBean", new Worklist());

	@PostConstruct
	public void init() {
		LanguageBean.getStaticLocaleCodePropeties();

		List<Worklist> worklists = new ArrayList<Worklist>();

		for (int i = 0; i < 10; i++) {
			worklists.add(new Worklist(1, "Process Type", "Market", i, "dept A", "desc", i, i, "process Status", new Date(), "Apple", new Date(), "Ben", "natApprover"));
		}

		setWorklists(worklists);

	}

	public List<Worklist> getWorklists() {
		return worklists;
	}

	public void setWorklists(List<Worklist> worklists) {
		this.worklists = worklists;
	}

	public List<Worklist> getSelectList() {
		return selectList;
	}

	public void setSelectList(List<Worklist> selectList) {
		this.selectList = selectList;
	}

	public FilterBean getFilterBean() {
		return filterBean;
	}

	public void setFilterBean(FilterBean filterBean) {
		this.filterBean = filterBean;
	}

}