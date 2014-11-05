
package hk.ed.cpdb.bean;

import hk.ed.cpdb.entity.Role;
import hk.ed.cpdb.entity.User;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
@ManagedBean(name = "loginBean")
@ViewScoped
public class LoginBean implements Serializable {

	private String errormsg;

	private String loginName;

	private String loginPassword;

	@Resource
	private GlobalBean globalBean;

	@PostConstruct
	public void init(){
		setLoginName("");
		setLoginPassword("");

	}

	public String doLogin(){
		User u = new User();
		u.setName("bmo");
		u.setFullName("Beemo");

		u.setRole(new Role("Admin"));

		return "Main";
	}

	public String getLoginName(){
		return loginName;
	}

	public void setLoginName(String loginName){
		this.loginName = loginName;
	}

	public String getLoginPassword(){
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword){
		this.loginPassword = loginPassword;
	}

	public String getErrormsg(){
		return errormsg;
	}

	public void setErrormsg(String errormsg){
		this.errormsg = errormsg;
	}

}
