package com.example.bisc.ModelResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class MenuItem{

	@SerializedName("code")
	private String code;

	@SerializedName("pk")
	private int pk;

	@SerializedName("accounts")
	private List<AccountsItem> accounts;

	@SerializedName("itemKey")
	private String itemKey;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setAccounts(List<AccountsItem> accounts){
		this.accounts = accounts;
	}

	public List<AccountsItem> getAccounts(){
		return accounts;
	}

	public void setItemKey(String itemKey){
		this.itemKey = itemKey;
	}

	public String getItemKey(){
		return itemKey;
	}
}