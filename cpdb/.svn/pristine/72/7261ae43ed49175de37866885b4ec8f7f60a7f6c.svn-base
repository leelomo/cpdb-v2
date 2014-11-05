
package hk.ed.cpdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "Role")
public class Role {
	public Role(){
	}

	public Role(String title ){
		setRoleTitle(title);
	}

	@Id
	@GeneratedValue
	@Column(name = "ROLE_ID")
	private Integer roleId;

	@Column(name = "ROLE_TITLE", length = 50)
	private String roleTitle;

	@Column(name = "ROLE_DISABLE")
	private Boolean disable;

	@XmlTransient
	public Integer getRoleId(){
		return roleId;
	}

	public void setRoleId(Integer roleId){
		this.roleId = roleId;
	}

	@XmlElement(name = "Title")
	public String getRoleTitle(){
		return roleTitle;
	}

	public void setRoleTitle(String roleTitle){
		this.roleTitle = roleTitle;
	}

	@XmlTransient
	public Boolean getDisable(){
		return disable;
	}

	public void setDisable(Boolean disable){
		this.disable = disable;
	}

}
