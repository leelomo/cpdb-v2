package hk.ed.cpdb.bean;

import hk.ed.cpdb.entitytemp.MyObject;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIInput;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class SelectOneMenuView implements Serializable {

	private String city;
	private Map<String, String> cities = new HashMap<String, String>();
	private DtoBean dtoBean;
	private int tabCounter;
	private List<DtoBean> listDtoBean;
	private String console;
	private UIInput menu;

	@PostConstruct
	public void init() {

		MyObject my = new MyObject();

		Field[] fs = my.getClass().getDeclaredFields();
		cities = new HashMap<String, String>();
		for (Field f : fs) {
			// System.out.println(f.getName());
			cities.put(f.getName(), f.getName());
		}
		// cities
		listDtoBean = new ArrayList<DtoBean>();
		DtoBean dtoBean = new DtoBean(tabCounter, "A", "B", "C");
		listDtoBean.add(dtoBean);
		tabCounter++;
		System.out.println("   run init()  ");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Map<String, String> getCities() {
		return cities;
	}

	public void addEditTab() {

		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		String string = ec.getRequestParameterMap().get("formId:menuId");
		String string2 = ec.getRequestParameterMap().get("formId:menuId2");
		String string3 = ec.getRequestParameterMap().get("formId:textC");

		DtoBean dtoBean = new DtoBean(tabCounter, string, string2, string3);
		listDtoBean.add(dtoBean);
		tabCounter++;
		System.out.println(tabCounter + "  addEditTab   " + "  " + string + "  " + string2 + " " + string3);
	}

	public void deleteEditTab(DtoBean dtoBean) {
		listDtoBean.remove(dtoBean);
		System.out.println("Delete dtoBean");
	}

	public void clearEditTab() {
		listDtoBean = new ArrayList<DtoBean>();
	}

	public DtoBean getDtoBean() {
		return dtoBean;
	}

	public void setDtoBean(DtoBean dtoBean) {
		this.dtoBean = dtoBean;
	}

	public int getTabCounter() {
		return tabCounter;
	}

	public void setTabCounter(int tabCounter) {
		this.tabCounter = tabCounter;
	}

	public List<DtoBean> getListDtoBean() {
		return listDtoBean;
	}

	public void setListDtoBean(List<DtoBean> listDtoBean) {
		this.listDtoBean = listDtoBean;
	}

	public void setCities(Map<String, String> cities) {
		this.cities = cities;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

}