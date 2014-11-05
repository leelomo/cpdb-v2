package hk.ed.cpdb.bean;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "LanguageBean")
@SessionScoped
public class LanguageBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String localeCode;

	private static Map<String, Object> countries;
	
	private static String LOCALE_VALUE;
	static {
		countries = new LinkedHashMap<String, Object>();
		countries.put("English", Locale.ENGLISH); // label, value
		countries.put("繁體中文", Locale.TRADITIONAL_CHINESE);
		countries.put("残体中文", Locale.SIMPLIFIED_CHINESE);
	}

	public Map<String, Object> getCountriesInMap() {
		return countries;
	}

	public String getLocaleCode() {
		return localeCode;
	}

	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	public void doChangeLocaleCode() {
		String newLocaleValue = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("LocaleValue");

		getLocaleCodePropeties(newLocaleValue);
	}

	// value change event listener
	public void countryLocaleCodeChanged(ValueChangeEvent e) {

		String newLocaleValue = e.getNewValue().toString();

		getLocaleCodePropeties(newLocaleValue);

	}

	private void getLocaleCodePropeties(String newLocaleValue) {
		System.out.println(newLocaleValue);
		setLOCALE_VALUE(newLocaleValue);
		for (Map.Entry<String, Object> entry : countries.entrySet()) {

			if (entry.getValue().toString().equals(newLocaleValue)) {

				FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale) entry.getValue());

			}
		}
	}
	
	public static void getStaticLocaleCodePropeties(){
		for (Map.Entry<String, Object> entry : countries.entrySet()) {

			if (entry.getValue().toString().equals(LOCALE_VALUE)) {

				FacesContext.getCurrentInstance().getViewRoot().setLocale((Locale) entry.getValue());

			}
		}
	}

	public static String getLOCALE_VALUE() {
		return LOCALE_VALUE;
	}

	public static void setLOCALE_VALUE(String lOCALE_VALUE) {
		LOCALE_VALUE = lOCALE_VALUE;
	}

	
	
}