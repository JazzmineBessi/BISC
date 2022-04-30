package com.example.bisc.ModelResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SubscriptionsItem{

	@SerializedName("subscriptionDate")
	private long subscriptionDate;

	@SerializedName("code")
	private String code;

	@SerializedName("servicePack")
	private String servicePack;

	@SerializedName("pk")
	private int pk;

	@SerializedName("services")
	private List<Object> services;

	@SerializedName("suspended")
	private boolean suspended;

	public void setSubscriptionDate(long subscriptionDate){
		this.subscriptionDate = subscriptionDate;
	}

	public long getSubscriptionDate(){
		return subscriptionDate;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setServicePack(String servicePack){
		this.servicePack = servicePack;
	}

	public String getServicePack(){
		return servicePack;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setServices(List<Object> services){
		this.services = services;
	}

	public List<Object> getServices(){
		return services;
	}

	public void setSuspended(boolean suspended){
		this.suspended = suspended;
	}

	public boolean isSuspended(){
		return suspended;
	}
}