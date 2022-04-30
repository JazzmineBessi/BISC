package com.example.bisc.ModelResponse;

import com.google.gson.annotations.SerializedName;

public class RegionalOptions{

	@SerializedName("profileName")
	private String profileName;

	@SerializedName("decimalSymbol")
	private String decimalSymbol;

	@SerializedName("code")
	private String code;

	@SerializedName("numberFormat")
	private String numberFormat;

	@SerializedName("dateFormat")
	private Object dateFormat;

	@SerializedName("timeFormat")
	private Object timeFormat;

	@SerializedName("language")
	private String language;

	@SerializedName("pk")
	private int pk;

	@SerializedName("groupingSymbol")
	private String groupingSymbol;

	public void setProfileName(String profileName){
		this.profileName = profileName;
	}

	public String getProfileName(){
		return profileName;
	}

	public void setDecimalSymbol(String decimalSymbol){
		this.decimalSymbol = decimalSymbol;
	}

	public String getDecimalSymbol(){
		return decimalSymbol;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setNumberFormat(String numberFormat){
		this.numberFormat = numberFormat;
	}

	public String getNumberFormat(){
		return numberFormat;
	}

	public void setDateFormat(Object dateFormat){
		this.dateFormat = dateFormat;
	}

	public Object getDateFormat(){
		return dateFormat;
	}

	public void setTimeFormat(Object timeFormat){
		this.timeFormat = timeFormat;
	}

	public Object getTimeFormat(){
		return timeFormat;
	}

	public void setLanguage(String language){
		this.language = language;
	}

	public String getLanguage(){
		return language;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setGroupingSymbol(String groupingSymbol){
		this.groupingSymbol = groupingSymbol;
	}

	public String getGroupingSymbol(){
		return groupingSymbol;
	}
}