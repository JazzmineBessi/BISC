package com.example.bisc.ModelResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Client{

	@SerializedName("identifier")
	private String identifier;

	@SerializedName("lastName")
	private String lastName;

	@SerializedName("country")
	private Object country;

	@SerializedName("subscriptions")
	private List<SubscriptionsItem> subscriptions;

	@SerializedName("address")
	private String address;

	@SerializedName("civility")
	private Object civility;

	@SerializedName("code")
	private String code;

	@SerializedName("manager")
	private Manager manager;

	@SerializedName("nature")
	private String nature;

	@SerializedName("city")
	private Object city;

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("phone")
	private String phone;

	@SerializedName("name")
	private String name;

	@SerializedName("segmentation")
	private Object segmentation;

	@SerializedName("attributes")
	private List<AttributesItem> attributes;

	@SerializedName("pk")
	private int pk;

	@SerializedName("corporateType")
	private Object corporateType;

	@SerializedName("vip")
	private boolean vip;

	@SerializedName("category")
	private Object category;

	@SerializedName("socialReason")
	private Object socialReason;

	@SerializedName("email")
	private String email;

	public void setIdentifier(String identifier){
		this.identifier = identifier;
	}

	public String getIdentifier(){
		return identifier;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setCountry(Object country){
		this.country = country;
	}

	public Object getCountry(){
		return country;
	}

	public void setSubscriptions(List<SubscriptionsItem> subscriptions){
		this.subscriptions = subscriptions;
	}

	public List<SubscriptionsItem> getSubscriptions(){
		return subscriptions;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setCivility(Object civility){
		this.civility = civility;
	}

	public Object getCivility(){
		return civility;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setManager(Manager manager){
		this.manager = manager;
	}

	public Manager getManager(){
		return manager;
	}

	public void setNature(String nature){
		this.nature = nature;
	}

	public String getNature(){
		return nature;
	}

	public void setCity(Object city){
		this.city = city;
	}

	public Object getCity(){
		return city;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setSegmentation(Object segmentation){
		this.segmentation = segmentation;
	}

	public Object getSegmentation(){
		return segmentation;
	}

	public void setAttributes(List<AttributesItem> attributes){
		this.attributes = attributes;
	}

	public List<AttributesItem> getAttributes(){
		return attributes;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setCorporateType(Object corporateType){
		this.corporateType = corporateType;
	}

	public Object getCorporateType(){
		return corporateType;
	}

	public void setVip(boolean vip){
		this.vip = vip;
	}

	public boolean isVip(){
		return vip;
	}

	public void setCategory(Object category){
		this.category = category;
	}

	public Object getCategory(){
		return category;
	}

	public void setSocialReason(Object socialReason){
		this.socialReason = socialReason;
	}

	public Object getSocialReason(){
		return socialReason;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}
}