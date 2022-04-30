package com.example.bisc.ModelResponse;

import com.google.gson.annotations.SerializedName;

public class AccountsItem{

	@SerializedName("accountRib")
	private Object accountRib;

	@SerializedName("code")
	private String code;

	@SerializedName("accountDescription")
	private Object accountDescription;

	@SerializedName("accountDetails")
	private AccountDetails accountDetails;

	@SerializedName("client")
	private Object client;

	@SerializedName("associationDate")
	private long associationDate;

	@SerializedName("pk")
	private int pk;

	@SerializedName("accountNumber")
	private String accountNumber;

	@SerializedName("account")
	private Object account;

	public void setAccountRib(Object accountRib){
		this.accountRib = accountRib;
	}

	public Object getAccountRib(){
		return accountRib;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setAccountDescription(Object accountDescription){
		this.accountDescription = accountDescription;
	}

	public Object getAccountDescription(){
		return accountDescription;
	}

	public void setAccountDetails(AccountDetails accountDetails){
		this.accountDetails = accountDetails;
	}

	public AccountDetails getAccountDetails(){
		return accountDetails;
	}

	public void setClient(Object client){
		this.client = client;
	}

	public Object getClient(){
		return client;
	}

	public void setAssociationDate(long associationDate){
		this.associationDate = associationDate;
	}

	public long getAssociationDate(){
		return associationDate;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public String getAccountNumber(){
		return accountNumber;
	}

	public void setAccount(Object account){
		this.account = account;
	}

	public Object getAccount(){
		return account;
	}
}