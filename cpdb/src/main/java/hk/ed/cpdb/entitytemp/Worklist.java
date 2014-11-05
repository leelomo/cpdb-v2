package hk.ed.cpdb.entitytemp;

import java.util.Date;

public class Worklist {

	private int processID;

	private String processType;

	private String market;

	private int deptNo;

	private String dept;

	private String desc;

	private int article;

	private int sapArticle;

	private String processStatus;

	private Date processStart;

	private String requestedBy;

	private Date dueDate;

	private String proccessUpdatedBy;

	private String natApprover;

	public Worklist() {
	}

	public Worklist(int processID, String processType, String market, int deptNo, String dept, String desc, int article, int sapArticle, String processStatus, Date processStart, String requestedBy,
			Date dueDate, String proccessUpdatedBy, String natApprover) {
		this.processID = processID;
		this.processType = processType;
		this.market = market;
		this.deptNo = deptNo;
		this.dept = dept;
		this.desc = desc;
		this.article = article;
		this.sapArticle = sapArticle;
		this.processStatus = processStatus;
		this.processStart = processStart;
		this.requestedBy = requestedBy;
		this.dueDate = dueDate;
		this.proccessUpdatedBy = proccessUpdatedBy;
		this.natApprover = natApprover;
	}

	public int getProcessID() {
		return processID;
	}

	public void setProcessID(int processID) {
		this.processID = processID;
	}

	public String getProcessType() {
		return processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getArticle() {
		return article;
	}

	public void setArticle(int article) {
		this.article = article;
	}

	public int getSapArticle() {
		return sapArticle;
	}

	public void setSapArticle(int sapArticle) {
		this.sapArticle = sapArticle;
	}

	public String getProcessStatus() {
		return processStatus;
	}

	public void setProcessStatus(String processStatus) {
		this.processStatus = processStatus;
	}

	public Date getProcessStart() {
		return processStart;
	}

	public void setProcessStart(Date processStart) {
		this.processStart = processStart;
	}

	public String getRequestedBy() {
		return requestedBy;
	}

	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public String getProccessUpdatedBy() {
		return proccessUpdatedBy;
	}

	public void setProccessUpdatedBy(String proccessUpdatedBy) {
		this.proccessUpdatedBy = proccessUpdatedBy;
	}

	public String getNatApprover() {
		return natApprover;
	}

	public void setNatApprover(String natApprover) {
		this.natApprover = natApprover;
	}

}
