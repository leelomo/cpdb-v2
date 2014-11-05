package hk.ed.cpdb.bean;

import hk.ed.cpdb.entitytemp.DataField;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class DataFieldBean {

	public List<DataField> getDataFields() {
		return dataFields;
	}

	public void setDataFields(List<DataField> dataFields) {
		this.dataFields = dataFields;
	}

	private List<DataField> dataFields = new ArrayList<DataField>();

	public List<DataField> getAuthenticationLogs() {
		// init();
		dataFields = new ArrayList<DataField>();
		dataFields.add(new DataField(1, "Key A", "Key A Desc"));
		dataFields.add(new DataField(2, "Key B", "Key B Desc"));
		dataFields.add(new DataField(3, "Key C", "Key C Desc"));
		dataFields.add(new DataField(4, "Key D", "Key D Desc"));
		dataFields.add(new DataField(5, "Key E", "Key E Desc"));
		dataFields.add(new DataField(6, "Key F", "Key F Desc"));
		dataFields.add(new DataField(7, "Key G", "Key G Desc"));
		dataFields.add(new DataField(8, "Key H", "Key H Desc"));
		dataFields.add(new DataField(9, "Key I", "Key I Desc"));
		dataFields.add(new DataField(10, "Key J", "Key J Desc"));

		return dataFields;
	}

}