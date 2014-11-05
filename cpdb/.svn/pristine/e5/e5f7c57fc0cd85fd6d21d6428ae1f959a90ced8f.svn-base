
package hk.ed.cpdb.bean;

import hk.ed.cpdb.bean.dto.DefineTabDto;
import hk.ed.cpdb.entitytemp.DefineDataField;
import hk.ed.cpdb.entitytemp.DefineMasterData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@ManagedBean(name = "defineMasterDataBean")
@RequestScoped
public class DefineMasterDataBean {

	private List<DefineMasterData> masterDatas = new ArrayList<DefineMasterData>();

	private List<DefineTabDto> dtoList;

	private int tabCounter;
	
	private FilterBean filterBean = new FilterBean("defineMasterDataBean",new DefineMasterData());

	@PostConstruct
	public void init(){
		dtoList = new ArrayList<DefineTabDto>();
		tabCounter = 0;
	}

	public void addEditTab(){
		System.out.println(tabCounter + "");
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

	public void setMasterDatas(List<DefineMasterData> masterDatas){
		this.masterDatas = masterDatas;
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

	public List<DefineMasterData> getMasterDatas(){
		masterDatas = new ArrayList<DefineMasterData>();
		masterDatas.add(new DefineMasterData(1, "Master Data A", "Type A", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(2, "Master Data B", "Type B", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(3, "Master Data C", "Type C", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(4, "Master Data D", "Type D", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(5, "Master Data E", "Type E", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(6, "Master Data F", "Type F", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(7, "Master Data G", "Type G", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(8, "Master Data H", "Type H", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(9, "Master Data I", "Type I", "some desc", new Date(), "Apple", new Date(), "Ben"));
		masterDatas.add(new DefineMasterData(10, "Master Data J", "Type J", "some desc", new Date(), "Apple", new Date(), "Ben"));

		return masterDatas;
	}

	public FilterBean getFilterBean() {
		return filterBean;
	}

	public void setFilterBean(FilterBean filterBean) {
		this.filterBean = filterBean;
	}
	
	
}
