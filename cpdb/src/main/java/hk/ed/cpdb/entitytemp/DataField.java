package hk.ed.cpdb.entitytemp;

public class DataField {

	private int fieldKey;
	private String fieldName;
	private String fieldDesc;
	
	public DataField() {
	}

	public DataField(int fieldKey, String fieldName, String fieldDesc) {
		super();
		this.fieldKey = fieldKey;
		this.fieldName = fieldName;
		this.fieldDesc = fieldDesc;
	}

	public int getFieldKey() {
		return fieldKey;
	}

	public void setFieldKey(int fieldKey) {
		this.fieldKey = fieldKey;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldDesc() {
		return fieldDesc;
	}

	public void setFieldDesc(String fieldDesc) {
		this.fieldDesc = fieldDesc;
	}

}