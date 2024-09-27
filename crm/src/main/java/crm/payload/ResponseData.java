package crm.payload;

public class ResponseData {
	private boolean isSuccess;
	private String description;
	private Object data;
	
	public ResponseData() {
	}

	public ResponseData(boolean isSuccess, String description, Object data) {
		super();
		this.isSuccess = isSuccess;
		this.description = description;
		this.data = data;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
}
