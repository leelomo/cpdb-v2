
package hk.ed.cpdb.bean;

import hk.ed.cpdb.entitytemp.Temp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.primefaces.component.outputlabel.OutputLabel;
import org.primefaces.component.panel.Panel;
import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@ManagedBean(name = "browseArticleBean")
@RequestScoped
public class BrowseArticleBean {

	private List<Temp> articleList;

	private String selection;

	private FilterBean filterBean = new FilterBean("browseArticleBean",new Temp());

	@PostConstruct
	public void init(){
		List<Temp> articleList = new ArrayList<Temp>();
//		for (int i = 0; i < 10; i++) {
			articleList.add(new Temp("V000001242", "30001252", "Released", "Active", "Active"));
			articleList.add(new Temp("V000006313", "300012412", "Released", "Discontinue", "Active"));
			articleList.add(new Temp("V000009125", "400011512", "Released", "Freeze", "Prohibited"));
			articleList.add(new Temp("V000015231", "N/A", "In process", "Active", "Active"));
			articleList.add(new Temp("V000027915", "300091252", "Released", "Active", "Active"));
//		}

		setArticleList(articleList);

	}

	public String getSelection(){
		return selection;
	}

	public void setSelection(String selection){
		this.selection = selection;
	}

	public List<Temp> getArticleList(){
		return articleList;
	}

	public void setArticleList(List<Temp> articleList){
		this.articleList = articleList;
	}

	public FilterBean getFilterBean(){
		return filterBean;
	}

	public void setFilterBean(FilterBean filterBean){
		this.filterBean = filterBean;
	}
	
	

}
