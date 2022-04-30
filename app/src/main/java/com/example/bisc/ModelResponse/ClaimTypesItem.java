package com.example.bisc.ModelResponse;

import com.google.gson.annotations.SerializedName;

public class ClaimTypesItem{

	@SerializedName("identifier")
	private String identifier;

	@SerializedName("code")
	private String code;

	@SerializedName("description")
	private String description;

	@SerializedName("pk")
	private int pk;

	public void setIdentifier(String identifier){
		this.identifier = identifier;
	}

	public String getIdentifier(){
		return identifier;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}
}