package hk.ed.cpdb.bean;

import hk.ed.cpdb.entitytemp.Temp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@ManagedBean(name = "reportBean")
@RequestScoped
public class ReportBean {
	private List<Temp> articleList;

	private Boolean showTable;

	private FilterBean filterBean = new FilterBean("reportBean",new Temp());

	@PostConstruct
	public void init() {
		showTable = false;

		List<Temp> articleList = new ArrayList<Temp>();
		for (int i = 0; i < 10; i++) {
			articleList.add(new Temp(i + "", i + "col1", i + "col2", i + "col3", i + "col4"));
		}

		setArticleList(articleList);

	}

	public void doShowTable() {
		showTable = true;
	}

	public List<Temp> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Temp> articleList) {
		this.articleList = articleList;
	}

	public Boolean getShowTable() {
		return showTable;
	}

	public void setShowTable(Boolean showTable) {
		this.showTable = showTable;
	}

	public FilterBean getFilterBean() {
		return filterBean;
	}

	public void setFilterBean(FilterBean filterBean) {
		this.filterBean = filterBean;
	}

}
