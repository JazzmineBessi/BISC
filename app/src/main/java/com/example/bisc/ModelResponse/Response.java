package com.example.bisc.ModelResponse;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Response{

	@SerializedName("date")
	private long date;

	@SerializedName("foreignCurrencies")
	private List<Object> foreignCurrencies;

	@SerializedName("claimTypes")
	private List<ClaimTypesItem> claimTypes;

	@SerializedName("roles")
	private List<String> roles;

	@SerializedName("appointmentTypes")
	private List<AppointmentTypesItem> appointmentTypes;

	@SerializedName("nbNewMessages")
	private int nbNewMessages;

	@SerializedName("changePassword")
	private boolean changePassword;

	@SerializedName("regionalOptions")
	private RegionalOptions regionalOptions;

	@SerializedName("fileMaxSize")
	private int fileMaxSize;

	@SerializedName("defaultCurrency")
	private DefaultCurrency defaultCurrency;

	@SerializedName("lastConnectionTime")
	private long lastConnectionTime;

	@SerializedName("client")
	private Client client;

	@SerializedName("accounts")
	private List<AccountsItem> accounts;

	@SerializedName("user")
	private User user;

	public void setDate(long date){
		this.date = date;
	}

	public long getDate(){
		return date;
	}

	public void setForeignCurrencies(List<Object> foreignCurrencies){
		this.foreignCurrencies = foreignCurrencies;
	}

	public List<Object> getForeignCurrencies(){
		return foreignCurrencies;
	}

	public void setClaimTypes(List<ClaimTypesItem> claimTypes){
		this.claimTypes = claimTypes;
	}

	public List<ClaimTypesItem> getClaimTypes(){
		return claimTypes;
	}

	public void setRoles(List<String> roles){
		this.roles = roles;
	}

	public List<String> getRoles(){
		return roles;
	}

	public void setAppointmentTypes(List<AppointmentTypesItem> appointmentTypes){
		this.appointmentTypes = appointmentTypes;
	}

	public List<AppointmentTypesItem> getAppointmentTypes(){
		return appointmentTypes;
	}

	public void setNbNewMessages(int nbNewMessages){
		this.nbNewMessages = nbNewMessages;
	}

	public int getNbNewMessages(){
		return nbNewMessages;
	}

	public void setChangePassword(boolean changePassword){
		this.changePassword = changePassword;
	}

	public boolean isChangePassword(){
		return changePassword;
	}

	public void setRegionalOptions(RegionalOptions regionalOptions){
		this.regionalOptions = regionalOptions;
	}

	public RegionalOptions getRegionalOptions(){
		return regionalOptions;
	}

	public void setFileMaxSize(int fileMaxSize){
		this.fileMaxSize = fileMaxSize;
	}

	public int getFileMaxSize(){
		return fileMaxSize;
	}

	public void setDefaultCurrency(DefaultCurrency defaultCurrency){
		this.defaultCurrency = defaultCurrency;
	}

	public DefaultCurrency getDefaultCurrency(){
		return defaultCurrency;
	}

	public void setLastConnectionTime(long lastConnectionTime){
		this.lastConnectionTime = lastConnectionTime;
	}

	public long getLastConnectionTime(){
		return lastConnectionTime;
	}

	public void setClient(Client client){
		this.client = client;
	}

	public Client getClient(){
		return client;
	}

	public void setAccounts(List<AccountsItem> accounts){
		this.accounts = accounts;
	}

	public List<AccountsItem> getAccounts(){
		return accounts;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}
}