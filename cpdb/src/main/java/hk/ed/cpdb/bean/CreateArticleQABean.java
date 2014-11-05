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
@ManagedBean(name = "createArticleQABean")
@RequestScoped
public class CreateArticleQABean {

	private List<Temp> articleList;

	private List<Temp> selections;

	private FilterBean filterBean = new FilterBean("createArticleQABean",new Temp());

	@PostConstruct
	public void init() {
		List<Temp> articleList = new ArrayList<Temp>();
		for (int i = 0; i < 10; i++) {
			articleList.add(new Temp(i + "", i + "col1", i + "col2", i + "col3", i + "col4"));
		}
		setArticleList(articleList);

	}

	public List<Temp> getSelections() {
		return selections;
	}

	public void setSelections(List<Temp> selections) {
		this.selections = selections;
	}

	public List<Temp> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<Temp> articleList) {
		this.articleList = articleList;
	}

	public FilterBean getFilterBean() {
		return filterBean;
	}

	public void setFilterBean(FilterBean filterBean) {
		this.filterBean = filterBean;
	}

}
