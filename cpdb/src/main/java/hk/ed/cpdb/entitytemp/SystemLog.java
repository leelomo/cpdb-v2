package hk.ed.cpdb.entitytemp;
import java.util.Date;

public class SystemLog {

	private int eventID;
	private Date Time;
	private String actor;
	private String desc;
	/**
	 * @param eventID
	 * @param time
	 * @param actor
	 * @param desc
	 */
	public SystemLog() {
		super();
	}
	
	public SystemLog(int eventID, Date time, String actor, String desc) {
		super();
		this.eventID = eventID;
		Time = time;
		this.actor = actor;
		this.desc = desc;
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public Date getTime() {
		return Time;
	}
	public void setTime(Date time) {
		Time = time;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	

}