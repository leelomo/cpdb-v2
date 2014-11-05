package hk.ed.cpdb.util;

import java.util.Map;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

public class HibernateJsonMapper extends ObjectMapper{
	
	private static final long serialVersionUID = -8527177144090448887L;

	public HibernateJsonMapper(){
		Hibernate4Module hbm = new Hibernate4Module();
		this.setTimeZone(TimeZone.getDefault());
		registerModule(hbm);
		setSerializationInclusion(Include.NON_NULL);
		configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}
	
	public void setMixIns(Map<String, String> mixIns) throws ClassNotFoundException{
		for(String classString : mixIns.keySet()){
			addMixInAnnotations(Class.forName(classString), Class.forName(mixIns.get(classString)));
		}
	}
	
}
