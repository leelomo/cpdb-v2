package hk.ed.cpdb.entitytemp;

import java.util.Date;

public class AuthenticationLog {

	private int userID;
	private int loginAttemptTime;
	private String loginResult;
	private String sessionIn;
	private String sessionOut;
	private Date logoutTime;
	
	public AuthenticationLog() {
		super();
	}
	
	public AuthenticationLog(int userID, int loginAttemptTime, String loginResult, String sessionIn, String sessionOut, Date logoutTime) {
		super();
		this.userID = userID;
		this.loginAttemptTime = loginAttemptTime;
		this.loginResult = loginResult;
		this.sessionIn = sessionIn;
		this.sessionOut = sessionOut;
		this.logoutTime = logoutTime;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getLoginAttemptTime() {
		return loginAttemptTime;
	}
	public void setLoginAttemptTime(int loginAttemptTime) {
		this.loginAttemptTime = loginAttemptTime;
	}
	public String getLoginResult() {
		return loginResult;
	}
	public void setLoginResult(String loginResult) {
		this.loginResult = loginResult;
	}
	public String getSessionIn() {
		return sessionIn;
	}
	public void setSessionIn(String sessionIn) {
		this.sessionIn = sessionIn;
	}
	public String getSessionOut() {
		return sessionOut;
	}
	public void setSessionOut(String sessionOut) {
		this.sessionOut = sessionOut;
	}
	public Date getLogoutTime() {
		return logoutTime;
	}
	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}
	
}