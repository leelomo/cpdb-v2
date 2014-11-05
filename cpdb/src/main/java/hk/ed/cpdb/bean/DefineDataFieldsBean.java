package hk.ed.cpdb.bean;

import hk.ed.cpdb.bean.dto.DefineTabDto;
import hk.ed.cpdb.entitytemp.DefineDataField;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@ManagedBean(name = "defineDataFieldsBean")
@RequestScoped
public class DefineDataFieldsBean {
	private List<DefineDataField> defineDataFieldList;

	private List<DefineTabDto> dtoList;

	private int tabCounter;
	
	private FilterBean filterBean = new FilterBean("defineDataFieldsBean",new DefineDataField());

	@PostConstruct
	public void init() {
		dtoList = new ArrayList<DefineTabDto>();
		tabCounter = 0;
		List<DefineDataField> list = new ArrayList<DefineDataField>();

		list.add(new DefineDataField(1, "Key A", "Key A Desc"));
		list.add(new DefineDataField(2, "Key B", "Key B Desc"));
		list.add(new DefineDataField(3, "Key C", "Key C Desc"));
		list.add(new DefineDataField(4, "Key D", "Key D Desc"));
		list.add(new DefineDataField(5, "Key E", "Key E Desc"));
		list.add(new DefineDataField(6, "Key F", "Key F Desc"));
		list.add(new DefineDataField(7, "Key G", "Key G Desc"));
		list.add(new DefineDataField(8, "Key H", "Key H Desc"));
		list.add(new DefineDataField(9, "Key I", "Key I Desc"));
		list.add(new DefineDataField(10, "Key J", "Key J Desc"));

		setDefineDataFieldList(list);

	}

	public void addEditTab() {
		Integer id = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id"));
		String name = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("name");
		String desc = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("desc");

		DefineTabDto dto = new DefineTabDto(tabCounter, new DefineDataField(id, name, desc), name);
		dtoList.add(dto);
		tabCounter++;
	}

	public void onEditTabClose() {
		Integer index = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("index"));
		for (DefineTabDto dto : dtoList) {
			if (dto.getIndex() == index) {
				dtoList.remove(dto);
				break;
			}
		}
	}

	public List<DefineDataField> getDefineDataFieldList() {
		return defineDataFieldList;
	}

	public void setDefineDataFieldList(List<DefineDataField> defineDataFieldList) {
		this.defineDataFieldList = defineDataFieldList;
	}

	public List<DefineTabDto> getDtoList() {
		return dtoList;
	}

	public void setDtoList(List<DefineTabDto> dtoList) {
		this.dtoList = dtoList;
	}

	public int getTabCounter() {
		return tabCounter;
	}

	public void setTabCounter(int tabCounter) {
		this.tabCounter = tabCounter;
	}

	public FilterBean getFilterBean() {
		return filterBean;
	}

	public void setFilterBean(FilterBean filterBean) {
		this.filterBean = filterBean;
	}
	
	

}
