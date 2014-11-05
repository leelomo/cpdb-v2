package hk.ed.cpdb.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class DtoBean {
	private int tabCounter;
	private String string;
	private String string2;
	private String string3;

	public DtoBean(int tabCounter, String string, String string2, String string3) {
		super();
		this.tabCounter = tabCounter;
		this.string = string;
		this.string2 = string2;
		this.string3 = string3;
	}

	public DtoBean() {
		// TODO Auto-generated constructor stub
		super();
	}

	public int getTabCounter() {
		return tabCounter;
	}

	public void setTabCounter(int tabCounter) {
		this.tabCounter = tabCounter;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public String getString3() {
		return string3;
	}

	public void setString3(String string3) {
		this.string3 = string3;
	}

	@PostConstruct
	public void init() {

	}

}