package hk.ed.cpdb.util;


public class APIResponse<M> {

	private M data;
	private APIResultCode code;
	private String message;

	public APIResponse(APIResultCode code){
		this.code = code;
	}
	
	public APIResponse(APIResultCode code, String message){
		this.code = code;
		this.message = message;
	}
	
	public APIResponse(M data, APIResultCode code, String message){
		this.data = data;
		this.message = message;
		this.code = code;
	}
	
	public APIResultCode getCode() {
		return code;
	}

	public void setCode(APIResultCode code) {
		this.code = code;
	}

	public APIResponse(String message){
		this.message = message;
	}
	

	public M getData() {
		return data;
	}

	public void setData(M data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
