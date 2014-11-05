
package hk.ed.cpdb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "KGS_User")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "USER_ID")
	private Integer id;

	@Column(name = "USER_NAME", length = 50, nullable = false)
	private String name;

	@Column(name = "USER_FULLNAME", length = 100)
	private String fullName;

	@Column(name = "USER_PASSWORD", length = 50, nullable = false)
	private String password;

	@Column(name = "USER_DISABLE")
	private Boolean disable;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROLE_ID")
	private Role role;

	@XmlTransient
	public Integer getId(){
		return id;
	}

	public void setId(Integer id){
		this.id = id;
	}

	@XmlElement(name = "Name")
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	@XmlElement(name = "FullName")
	public String getFullName(){
		return fullName;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	@XmlTransient
	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	@XmlTransient
	public Boolean getDisable(){
		return disable;
	}

	public void setDisable(Boolean disable){
		this.disable = disable;
	}

	public Role getRole(){
		return role;
	}

	public void setRole(Role role){
		this.role = role;
	}

}
