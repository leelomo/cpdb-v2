package hk.ed.cpdb.bean;

import hk.ed.cpdb.dto.FilterContentDto;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//@SuppressWarnings("serial")
//@ManagedBean(name = "filterBean")
//@ViewScoped
public class FilterBean {

	public FilterBean() {
		super();
	}

	public FilterBean(String pageName, Object o) {
		super();
		setPageName(pageName);
		getFilterFields(o);
	}

	private List<String> filterFields;

	private List<FilterContentDto> filterList = new ArrayList<FilterContentDto>();

	private String pageName;

	private String matchType = "all";

	private Integer rowColumns = 1;

	@PostConstruct
	public void init() {
	}

	private void getFilterFields(Object o) {

		Field[] fs = o.getClass().getDeclaredFields();
		filterFields = new ArrayList<String>();
		for (Field f : fs) {
			filterFields.add(f.getName());
		}
	}

	public Integer getRowColumns() {
		rowColumns = 1;
		int listSize = filterList.size();
		if (listSize < 5) {
			rowColumns = 1;
		} else if (listSize > 5 && listSize <= 10) {
			rowColumns = 2;
		} else if (listSize > 10) {
			rowColumns = 3;
		} else {
			rowColumns = 1;
		}
		return rowColumns;
	}

	public void addFilterRow() {
		filterList.add(new FilterContentDto());
		System.out.println(filterList.size());
	}

	public void deleteFilterRow(FilterContentDto filterDto) {
		filterList.remove(filterDto);
	}

	public void clearEditTab() {
		filterList.clear();
	}

	public List<String> getFilterFields() {
		return filterFields;
	}

	public void setFilterFields(List<String> filterFields) {
		this.filterFields = filterFields;
	}

	public List<FilterContentDto> getFilterList() {
		return filterList;
	}

	public void setFilterList(List<FilterContentDto> filterList) {
		this.filterList = filterList;
	}

	public String getMatchType() {
		return matchType;
	}

	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public void setRowColumns(Integer rowColumns) {
		this.rowColumns = rowColumns;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

}
