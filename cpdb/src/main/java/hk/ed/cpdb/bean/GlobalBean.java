
package hk.ed.cpdb.bean;

import hk.ed.cpdb.entity.Role;
import hk.ed.cpdb.entity.User;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@ManagedBean(name = "GlobalBean")
@SessionScoped
public class GlobalBean implements Serializable {

	private String basePath;

	private String cssMainPath = "/cpdb/css/Main.css";

	private String cssThemePath = "/cpdb/resources/primefaces-yourtheme/theme.css";

	private String footerPath = "base/Footer.xhtml";

	private String filterPath = "/base/Filter.xhtml";
//	private String filterPath = "http://localhost:8080/cpdb/base/Filter.xhtml";

	private String title = "Centralized Product DataBase";

	private User loginUser;

	@PostConstruct
	public void init(){

	}

	public String doLogin(){
		User u = new User();
		u.setName("user1");
		u.setFullName("Beemo");

		u.setRole(new Role("MDO"));

		setLoginUser(u);

		return "Main";
	}

	public String doLogout(){
		setLoginUser(null);
		return "login";
	}

	public String getCssMainPath(){
		return cssMainPath;
	}

	public void setCssMainPath(String cssMainPath){
		this.cssMainPath = cssMainPath;
	}

	public String getBasePath(){
		return basePath;
	}

	public void setBasePath(String basePath){
		this.basePath = basePath;
	}

	public String getFooterPath(){
		return footerPath;
	}

	public void setFooterPath(String footerPath){
		this.footerPath = footerPath;
	}

	public String getFilterPath(){
		return filterPath;
	}

	public void setFilterPath(String filterPath){
		this.filterPath = filterPath;
	}

	public User getLoginUser(){
		return loginUser;
	}

	public void setLoginUser(User loginUser){
		this.loginUser = loginUser;
	}

	public String getTitle(){
		return title;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getCssThemePath(){
		return cssThemePath;
	}

	public void setCssThemePath(String cssThemePath){
		this.cssThemePath = cssThemePath;
	}

}
