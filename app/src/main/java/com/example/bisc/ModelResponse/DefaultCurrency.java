package com.example.bisc.ModelResponse;

import com.google.gson.annotations.SerializedName;

public class DefaultCurrency{

	@SerializedName("identifier")
	private String identifier;

	@SerializedName("code")
	private String code;

	@SerializedName("name")
	private String name;

	@SerializedName("decimalName")
	private String decimalName;

	@SerializedName("digitalUse")
	private boolean digitalUse;

	@SerializedName("pk")
	private int pk;

	@SerializedName("translatedName")
	private Object translatedName;

	@SerializedName("iso3166")
	private String iso3166;

	@SerializedName("decimal")
	private int decimal;

	@SerializedName("quotity")
	private int quotity;

	@SerializedName("certain")
	private boolean certain;

	@SerializedName("internalCode")
	private Object internalCode;

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

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setDecimalName(String decimalName){
		this.decimalName = decimalName;
	}

	public String getDecimalName(){
		return decimalName;
	}

	public void setDigitalUse(boolean digitalUse){
		this.digitalUse = digitalUse;
	}

	public boolean isDigitalUse(){
		return digitalUse;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setTranslatedName(Object translatedName){
		this.translatedName = translatedName;
	}

	public Object getTranslatedName(){
		return translatedName;
	}

	public void setIso3166(String iso3166){
		this.iso3166 = iso3166;
	}

	public String getIso3166(){
		return iso3166;
	}

	public void setDecimal(int decimal){
		this.decimal = decimal;
	}

	public int getDecimal(){
		return decimal;
	}

	public void setQuotity(int quotity){
		this.quotity = quotity;
	}

	public int getQuotity(){
		return quotity;
	}

	public void setCertain(boolean certain){
		this.certain = certain;
	}

	public boolean isCertain(){
		return certain;
	}

	public void setInternalCode(Object internalCode){
		this.internalCode = internalCode;
	}

	public Object getInternalCode(){
		return internalCode;
	}
}