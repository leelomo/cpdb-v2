
package hk.ed.cpdb.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@SuppressWarnings("serial")
@ManagedBean(name = "ContectBean")
@SessionScoped
public class ContectBean implements Serializable {

	private String displayPage;

	private String pageName;

	@PostConstruct
	public void init(){
		this.pageName = "Welcome";
	}

	public void doNav(){
		this.displayPage = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("page");;
		this.pageName = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pageName");
	}

	public void doNav(String page){
		this.displayPage = page;
		this.pageName = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("pageName");
	}

	public String getDisplayPage(){
		return displayPage;
	}

	public void setDisplayPage(String displayPage){
		this.displayPage = displayPage;
	}

	public String getPageName(){
		return pageName;
	}

	public void setPageName(String pageName){
		this.pageName = pageName;
	}

}
