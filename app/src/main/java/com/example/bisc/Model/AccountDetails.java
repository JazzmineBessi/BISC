package com.example.bisc.Model;

import com.google.gson.annotations.SerializedName;

public class AccountDetails{

	@SerializedName("product")
	private Object product;

	@SerializedName("code")
	private String code;

	@SerializedName("clientFullName")
	private String clientFullName;

	@SerializedName("manager")
	private Object manager;

	@SerializedName("courant")
	private boolean courant;

	@SerializedName("description")
	private String description;

	@SerializedName("rib")
	private String rib;

	@SerializedName("accountNumber")
	private String accountNumber;

	@SerializedName("forbiddenWithdraw")
	private boolean forbiddenWithdraw;

	@SerializedName("nextBalance")
	private Object nextBalance;

	@SerializedName("unit")
	private String unit;

	@SerializedName("balance")
	private double balance;

	@SerializedName("iban")
	private Object iban;

	@SerializedName("closed")
	private boolean closed;

	@SerializedName("client")
	private String client;

	@SerializedName("currency")
	private Currency currency;

	@SerializedName("pk")
	private int pk;

	public void setProduct(Object product){
		this.product = product;
	}

	public Object getProduct(){
		return product;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setClientFullName(String clientFullName){
		this.clientFullName = clientFullName;
	}

	public String getClientFullName(){
		return clientFullName;
	}

	public void setManager(Object manager){
		this.manager = manager;
	}

	public Object getManager(){
		return manager;
	}

	public void setCourant(boolean courant){
		this.courant = courant;
	}

	public boolean isCourant(){
		return courant;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setRib(String rib){
		this.rib = rib;
	}

	public String getRib(){
		return rib;
	}

	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public void setForbiddenWithdraw(boolean forbiddenWithdraw){
		this.forbiddenWithdraw = forbiddenWithdraw;
	}

	public boolean isForbiddenWithdraw(){
		return forbiddenWithdraw;
	}

	public void setNextBalance(Object nextBalance){
		this.nextBalance = nextBalance;
	}

	public Object getNextBalance(){
		return nextBalance;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public String getUnit(){
		return unit;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public double getBalance(){
		return balance;
	}

	public void setIban(Object iban){
		this.iban = iban;
	}

	public Object getIban(){
		return iban;
	}

	public void setClosed(boolean closed){
		this.closed = closed;
	}

	public boolean isClosed(){
		return closed;
	}

	public void setClient(String client){
		this.client = client;
	}

	public String getClient(){
		return client;
	}

	public void setCurrency(Currency currency){
		this.currency = currency;
	}

	public Currency getCurrency(){
		return currency;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}
}