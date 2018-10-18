package fauzi.hilmy.mvp32api.Main.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseCountry{

	@SerializedName("Response")
	private List<ResponseItem> response;

	@SerializedName("IsSuccess")
	private boolean isSuccess;

	@SerializedName("TotalCount")
	private int totalCount;

	@SerializedName("UserMessage")
	private Object userMessage;

	@SerializedName("TechnicalMessage")
	private Object technicalMessage;

	public void setResponse(List<ResponseItem> response){
		this.response = response;
	}

	public List<ResponseItem> getResponse(){
		return response;
	}

	public void setIsSuccess(boolean isSuccess){
		this.isSuccess = isSuccess;
	}

	public boolean isIsSuccess(){
		return isSuccess;
	}

	public void setTotalCount(int totalCount){
		this.totalCount = totalCount;
	}

	public int getTotalCount(){
		return totalCount;
	}

	public void setUserMessage(Object userMessage){
		this.userMessage = userMessage;
	}

	public Object getUserMessage(){
		return userMessage;
	}

	public void setTechnicalMessage(Object technicalMessage){
		this.technicalMessage = technicalMessage;
	}

	public Object getTechnicalMessage(){
		return technicalMessage;
	}

	@Override
 	public String toString(){
		return 
			"ResponseCountry{" + 
			"response = '" + response + '\'' + 
			",isSuccess = '" + isSuccess + '\'' + 
			",totalCount = '" + totalCount + '\'' + 
			",userMessage = '" + userMessage + '\'' + 
			",technicalMessage = '" + technicalMessage + '\'' + 
			"}";
		}
}