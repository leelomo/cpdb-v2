package hk.ed.cpdb.entitytemp;

public class DefineProductTemplate {

	private int ptId;
	private String ptName;
	
	public DefineProductTemplate() {
	}

	public DefineProductTemplate(int ptId, String ptName) {
		setPtId(ptId);
		setPtName(ptName);
	}

	public int getPtId(){
		return ptId;
	}

	public void setPtId(int ptId){
		this.ptId = ptId;
	}

	public String getPtName(){
		return ptName;
	}

	public void setPtName(String ptName){
		this.ptName = ptName;
	}


}