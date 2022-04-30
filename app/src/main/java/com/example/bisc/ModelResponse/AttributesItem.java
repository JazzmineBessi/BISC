package com.example.bisc.ModelResponse;

import com.google.gson.annotations.SerializedName;

public class AttributesItem{

	@SerializedName("dateValue")
	private Object dateValue;

	@SerializedName("stringValue")
	private String stringValue;

	@SerializedName("bigDecimalValue")
	private Object bigDecimalValue;

	@SerializedName("code")
	private String code;

	@SerializedName("description")
	private Object description;

	@SerializedName("booleanValue")
	private boolean booleanValue;

	@SerializedName("integerValue")
	private Object integerValue;

	@SerializedName("attributeKey")
	private String attributeKey;

	@SerializedName("pk")
	private int pk;

	@SerializedName("type")
	private String type;

	public void setDateValue(Object dateValue){
		this.dateValue = dateValue;
	}

	public Object getDateValue(){
		return dateValue;
	}

	public void setStringValue(String stringValue){
		this.stringValue = stringValue;
	}

	public String getStringValue(){
		return stringValue;
	}

	public void setBigDecimalValue(Object bigDecimalValue){
		this.bigDecimalValue = bigDecimalValue;
	}

	public Object getBigDecimalValue(){
		return bigDecimalValue;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setBooleanValue(boolean booleanValue){
		this.booleanValue = booleanValue;
	}

	public boolean isBooleanValue(){
		return booleanValue;
	}

	public void setIntegerValue(Object integerValue){
		this.integerValue = integerValue;
	}

	public Object getIntegerValue(){
		return integerValue;
	}

	public void setAttributeKey(String attributeKey){
		this.attributeKey = attributeKey;
	}

	public String getAttributeKey(){
		return attributeKey;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}
}