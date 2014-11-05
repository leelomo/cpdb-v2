
package hk.ed.cpdb.bean;

import hk.ed.cpdb.bean.dto.DefineTabDto;
import hk.ed.cpdb.entitytemp.DefineDataField;
import hk.ed.cpdb.entitytemp.DefineProductTemplate;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@ManagedBean(name = "defineProductTemplateBean")
@RequestScoped
public class DefineProductTemplateBean {

	private List<DefineProductTemplate> productTemplates = new ArrayList<DefineProductTemplate>();

	private List<DefineTabDto> dtoList;

	private int tabCounter;
	
	private FilterBean filterBean = new FilterBean("defineProductTemplateBean",new DefineProductTemplate());

	@PostConstruct
	public void init(){
		dtoList = new ArrayList<DefineTabDto>();
		tabCounter = 0;
	}

	public List<DefineProductTemplate> getProductTemplates(){
		// init();
		productTemplates = new ArrayList<DefineProductTemplate>();
		productTemplates.add(new DefineProductTemplate(1, "Template A"));
		productTemplates.add(new DefineProductTemplate(2, "Template B"));
		productTemplates.add(new DefineProductTemplate(3, "Template C"));
		productTemplates.add(new DefineProductTemplate(4, "Template D"));
		productTemplates.add(new DefineProductTemplate(5, "Template E"));
		productTemplates.add(new DefineProductTemplate(6, "Template F"));
		productTemplates.add(new DefineProductTemplate(7, "Template G"));
		productTemplates.add(new DefineProductTemplate(8, "Template H"));
		productTemplates.add(new DefineProductTemplate(9, "Template I"));
		productTemplates.add(new DefineProductTemplate(10, "Template J"));

		return productTemplates;
	}

	public void addEditTab(){
		System.out.println(tabCounter+"");
		String name = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("name");

		DefineTabDto dto = new DefineTabDto(tabCounter, null, name);
		dtoList.add(dto);
		tabCounter++;
	}

	public void onEditTabClose(){
		Integer index = Integer.parseInt(FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("index"));
		System.out.println(index + "");
		for (DefineTabDto dto : dtoList) {
			if (dto.getIndex() == index) {
				dtoList.remove(dto);
				break;
			}
		}
	}

	public List<DefineTabDto> getDtoList(){
		return dtoList;
	}

	public void setDtoList(List<DefineTabDto> dtoList){
		this.dtoList = dtoList;
	}

	public int getTabCounter(){
		return tabCounter;
	}

	public void setTabCounter(int tabCounter){
		this.tabCounter = tabCounter;
	}

	public void setProductTemplates(List<DefineProductTemplate> productTemplates){
		this.productTemplates = productTemplates;
	}

	public FilterBean getFilterBean() {
		return filterBean;
	}

	public void setFilterBean(FilterBean filterBean) {
		this.filterBean = filterBean;
	}
	
	

}
