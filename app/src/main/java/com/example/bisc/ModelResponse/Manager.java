package com.example.bisc.ModelResponse;

import com.google.gson.annotations.SerializedName;

public class Manager{

	@SerializedName("mainEntity")
	private String mainEntity;

	@SerializedName("code")
	private String code;

	@SerializedName("matricule")
	private String matricule;

	@SerializedName("securityUser")
	private String securityUser;

	@SerializedName("description")
	private Object description;

	@SerializedName("userFunction")
	private String userFunction;

	@SerializedName("organizationUnit")
	private String organizationUnit;

	@SerializedName("userName")
	private String userName;

	@SerializedName("affectationDate")
	private Object affectationDate;

	@SerializedName("hierarchySuperior")
	private Object hierarchySuperior;

	@SerializedName("organisationFunction")
	private Object organisationFunction;

	@SerializedName("tel")
	private Object tel;

	@SerializedName("pk")
	private int pk;

	@SerializedName("fax")
	private Object fax;

	@SerializedName("email")
	private String email;

	public void setMainEntity(String mainEntity){
		this.mainEntity = mainEntity;
	}

	public String getMainEntity(){
		return mainEntity;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setMatricule(String matricule){
		this.matricule = matricule;
	}

	public String getMatricule(){
		return matricule;
	}

	public void setSecurityUser(String securityUser){
		this.securityUser = securityUser;
	}

	public String getSecurityUser(){
		return securityUser;
	}

	public void setDescription(Object description){
		this.description = description;
	}

	public Object getDescription(){
		return description;
	}

	public void setUserFunction(String userFunction){
		this.userFunction = userFunction;
	}

	public String getUserFunction(){
		return userFunction;
	}

	public void setOrganizationUnit(String organizationUnit){
		this.organizationUnit = organizationUnit;
	}

	public String getOrganizationUnit(){
		return organizationUnit;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setAffectationDate(Object affectationDate){
		this.affectationDate = affectationDate;
	}

	public Object getAffectationDate(){
		return affectationDate;
	}

	public void setHierarchySuperior(Object hierarchySuperior){
		this.hierarchySuperior = hierarchySuperior;
	}

	public Object getHierarchySuperior(){
		return hierarchySuperior;
	}

	public void setOrganisationFunction(Object organisationFunction){
		this.organisationFunction = organisationFunction;
	}

	public Object getOrganisationFunction(){
		return organisationFunction;
	}

	public void setTel(Object tel){
		this.tel = tel;
	}

	public Object getTel(){
		return tel;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setFax(Object fax){
		this.fax = fax;
	}

	public Object getFax(){
		return fax;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}
}