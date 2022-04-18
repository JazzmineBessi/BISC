package com.example.bisc.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class User{

	@SerializedName("privileges")
	private List<Object> privileges;

	@SerializedName("validationComment")
	private Object validationComment;

	@SerializedName("subscriptions")
	private List<Object> subscriptions;

	@SerializedName("accountRib")
	private Object accountRib;

	@SerializedName("civility")
	private Object civility;

	@SerializedName("workflowAffectedUser")
	private Object workflowAffectedUser;

	@SerializedName("documentsData")
	private Object documentsData;

	@SerializedName("validator")
	private Object validator;

	@SerializedName("authorization")
	private Object authorization;

	@SerializedName("unitCode")
	private Object unitCode;

	@SerializedName("emailConfirmation")
	private boolean emailConfirmation;

	@SerializedName("confirmationId")
	private Object confirmationId;

	@SerializedName("persistOperation")
	private boolean persistOperation;

	@SerializedName("locked")
	private boolean locked;

	@SerializedName("trackingId")
	private Object trackingId;

	@SerializedName("deviceType")
	private Object deviceType;

	@SerializedName("comment5")
	private Object comment5;

	@SerializedName("comment4")
	private Object comment4;

	@SerializedName("comment3")
	private Object comment3;

	@SerializedName("comment2")
	private Object comment2;

	@SerializedName("validationComment4")
	private Object validationComment4;

	@SerializedName("comment1")
	private Object comment1;

	@SerializedName("validationComment5")
	private Object validationComment5;

	@SerializedName("nbFailedConnections")
	private int nbFailedConnections;

	@SerializedName("validationComment2")
	private Object validationComment2;

	@SerializedName("validationComment3")
	private Object validationComment3;

	@SerializedName("attachedDocuments")
	private List<Object> attachedDocuments;

	@SerializedName("otp")
	private Object otp;

	@SerializedName("isAdmin")
	private boolean isAdmin;

	@SerializedName("firstName")
	private String firstName;

	@SerializedName("currentUser")
	private Object currentUser;

	@SerializedName("workflowComment")
	private Object workflowComment;

	@SerializedName("userComment")
	private Object userComment;

	@SerializedName("relatedOperationTypeId")
	private Object relatedOperationTypeId;

	@SerializedName("phone")
	private String phone;

	@SerializedName("validationComment8")
	private Object validationComment8;

	@SerializedName("validationComment9")
	private Object validationComment9;

	@SerializedName("operationReference")
	private String operationReference;

	@SerializedName("validationComment6")
	private Object validationComment6;

	@SerializedName("validationComment7")
	private Object validationComment7;

	@SerializedName("status")
	private String status;

	@SerializedName("validator9")
	private Object validator9;

	@SerializedName("confirmationCode")
	private Object confirmationCode;

	@SerializedName("lastName")
	private String lastName;

	@SerializedName("privilegesData")
	private Object privilegesData;

	@SerializedName("validator8")
	private Object validator8;

	@SerializedName("validator7")
	private Object validator7;

	@SerializedName("code")
	private String code;

	@SerializedName("validator6")
	private Object validator6;

	@SerializedName("accountDescription")
	private Object accountDescription;

	@SerializedName("creationTime")
	private long creationTime;

	@SerializedName("validator5")
	private Object validator5;

	@SerializedName("validator4")
	private Object validator4;

	@SerializedName("validator3")
	private Object validator3;

	@SerializedName("validator2")
	private Object validator2;

	@SerializedName("digitalOperationStatus")
	private String digitalOperationStatus;

	@SerializedName("requireConfirmation")
	private boolean requireConfirmation;

	@SerializedName("subscription")
	private boolean subscription;

	@SerializedName("login")
	private String login;

	@SerializedName("workflowDecision")
	private Object workflowDecision;

	@SerializedName("digitalUser")
	private Object digitalUser;

	@SerializedName("endpoint")
	private Object endpoint;

	@SerializedName("confirmationClientCode")
	private Object confirmationClientCode;

	@SerializedName("lastConnectionTime")
	private long lastConnectionTime;

	@SerializedName("client")
	private String client;

	@SerializedName("currency")
	private Object currency;

	@SerializedName("workflowResume")
	private boolean workflowResume;

	@SerializedName("operationNature")
	private String operationNature;

	@SerializedName("confirmationTimeout")
	private Object confirmationTimeout;

	@SerializedName("email")
	private String email;

	@SerializedName("creator")
	private Object creator;

	@SerializedName("address")
	private String address;

	@SerializedName("clientId")
	private Object clientId;

	@SerializedName("comments")
	private List<Object> comments;

	@SerializedName("manager")
	private Object manager;

	@SerializedName("smsConfirmation")
	private boolean smsConfirmation;

	@SerializedName("tradeDate")
	private String tradeDate;

	@SerializedName("accountNumber")
	private Object accountNumber;

	@SerializedName("menu")
	private List<MenuItem> menu;

	@SerializedName("taskAffectationConfig")
	private Object taskAffectationConfig;

	@SerializedName("actor")
	private Object actor;

	@SerializedName("prospect")
	private boolean prospect;

	@SerializedName("userActions")
	private List<Object> userActions;

	@SerializedName("pk")
	private int pk;

	@SerializedName("digitalOpeType")
	private Object digitalOpeType;

	@SerializedName("account")
	private Object account;

	@SerializedName("currencyDecimal")
	private Object currencyDecimal;

	public void setPrivileges(List<Object> privileges){
		this.privileges = privileges;
	}

	public List<Object> getPrivileges(){
		return privileges;
	}

	public void setValidationComment(Object validationComment){
		this.validationComment = validationComment;
	}

	public Object getValidationComment(){
		return validationComment;
	}

	public void setSubscriptions(List<Object> subscriptions){
		this.subscriptions = subscriptions;
	}

	public List<Object> getSubscriptions(){
		return subscriptions;
	}

	public void setAccountRib(Object accountRib){
		this.accountRib = accountRib;
	}

	public Object getAccountRib(){
		return accountRib;
	}

	public void setCivility(Object civility){
		this.civility = civility;
	}

	public Object getCivility(){
		return civility;
	}

	public void setWorkflowAffectedUser(Object workflowAffectedUser){
		this.workflowAffectedUser = workflowAffectedUser;
	}

	public Object getWorkflowAffectedUser(){
		return workflowAffectedUser;
	}

	public void setDocumentsData(Object documentsData){
		this.documentsData = documentsData;
	}

	public Object getDocumentsData(){
		return documentsData;
	}

	public void setValidator(Object validator){
		this.validator = validator;
	}

	public Object getValidator(){
		return validator;
	}

	public void setAuthorization(Object authorization){
		this.authorization = authorization;
	}

	public Object getAuthorization(){
		return authorization;
	}

	public void setUnitCode(Object unitCode){
		this.unitCode = unitCode;
	}

	public Object getUnitCode(){
		return unitCode;
	}

	public void setEmailConfirmation(boolean emailConfirmation){
		this.emailConfirmation = emailConfirmation;
	}

	public boolean isEmailConfirmation(){
		return emailConfirmation;
	}

	public void setConfirmationId(Object confirmationId){
		this.confirmationId = confirmationId;
	}

	public Object getConfirmationId(){
		return confirmationId;
	}

	public void setPersistOperation(boolean persistOperation){
		this.persistOperation = persistOperation;
	}

	public boolean isPersistOperation(){
		return persistOperation;
	}

	public void setLocked(boolean locked){
		this.locked = locked;
	}

	public boolean isLocked(){
		return locked;
	}

	public void setTrackingId(Object trackingId){
		this.trackingId = trackingId;
	}

	public Object getTrackingId(){
		return trackingId;
	}

	public void setDeviceType(Object deviceType){
		this.deviceType = deviceType;
	}

	public Object getDeviceType(){
		return deviceType;
	}

	public void setComment5(Object comment5){
		this.comment5 = comment5;
	}

	public Object getComment5(){
		return comment5;
	}

	public void setComment4(Object comment4){
		this.comment4 = comment4;
	}

	public Object getComment4(){
		return comment4;
	}

	public void setComment3(Object comment3){
		this.comment3 = comment3;
	}

	public Object getComment3(){
		return comment3;
	}

	public void setComment2(Object comment2){
		this.comment2 = comment2;
	}

	public Object getComment2(){
		return comment2;
	}

	public void setValidationComment4(Object validationComment4){
		this.validationComment4 = validationComment4;
	}

	public Object getValidationComment4(){
		return validationComment4;
	}

	public void setComment1(Object comment1){
		this.comment1 = comment1;
	}

	public Object getComment1(){
		return comment1;
	}

	public void setValidationComment5(Object validationComment5){
		this.validationComment5 = validationComment5;
	}

	public Object getValidationComment5(){
		return validationComment5;
	}

	public void setNbFailedConnections(int nbFailedConnections){
		this.nbFailedConnections = nbFailedConnections;
	}

	public int getNbFailedConnections(){
		return nbFailedConnections;
	}

	public void setValidationComment2(Object validationComment2){
		this.validationComment2 = validationComment2;
	}

	public Object getValidationComment2(){
		return validationComment2;
	}

	public void setValidationComment3(Object validationComment3){
		this.validationComment3 = validationComment3;
	}

	public Object getValidationComment3(){
		return validationComment3;
	}

	public void setAttachedDocuments(List<Object> attachedDocuments){
		this.attachedDocuments = attachedDocuments;
	}

	public List<Object> getAttachedDocuments(){
		return attachedDocuments;
	}

	public void setOtp(Object otp){
		this.otp = otp;
	}

	public Object getOtp(){
		return otp;
	}

	public void setIsAdmin(boolean isAdmin){
		this.isAdmin = isAdmin;
	}

	public boolean isIsAdmin(){
		return isAdmin;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setCurrentUser(Object currentUser){
		this.currentUser = currentUser;
	}

	public Object getCurrentUser(){
		return currentUser;
	}

	public void setWorkflowComment(Object workflowComment){
		this.workflowComment = workflowComment;
	}

	public Object getWorkflowComment(){
		return workflowComment;
	}

	public void setUserComment(Object userComment){
		this.userComment = userComment;
	}

	public Object getUserComment(){
		return userComment;
	}

	public void setRelatedOperationTypeId(Object relatedOperationTypeId){
		this.relatedOperationTypeId = relatedOperationTypeId;
	}

	public Object getRelatedOperationTypeId(){
		return relatedOperationTypeId;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setValidationComment8(Object validationComment8){
		this.validationComment8 = validationComment8;
	}

	public Object getValidationComment8(){
		return validationComment8;
	}

	public void setValidationComment9(Object validationComment9){
		this.validationComment9 = validationComment9;
	}

	public Object getValidationComment9(){
		return validationComment9;
	}

	public void setOperationReference(String operationReference){
		this.operationReference = operationReference;
	}

	public String getOperationReference(){
		return operationReference;
	}

	public void setValidationComment6(Object validationComment6){
		this.validationComment6 = validationComment6;
	}

	public Object getValidationComment6(){
		return validationComment6;
	}

	public void setValidationComment7(Object validationComment7){
		this.validationComment7 = validationComment7;
	}

	public Object getValidationComment7(){
		return validationComment7;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setValidator9(Object validator9){
		this.validator9 = validator9;
	}

	public Object getValidator9(){
		return validator9;
	}

	public void setConfirmationCode(Object confirmationCode){
		this.confirmationCode = confirmationCode;
	}

	public Object getConfirmationCode(){
		return confirmationCode;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setPrivilegesData(Object privilegesData){
		this.privilegesData = privilegesData;
	}

	public Object getPrivilegesData(){
		return privilegesData;
	}

	public void setValidator8(Object validator8){
		this.validator8 = validator8;
	}

	public Object getValidator8(){
		return validator8;
	}

	public void setValidator7(Object validator7){
		this.validator7 = validator7;
	}

	public Object getValidator7(){
		return validator7;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setValidator6(Object validator6){
		this.validator6 = validator6;
	}

	public Object getValidator6(){
		return validator6;
	}

	public void setAccountDescription(Object accountDescription){
		this.accountDescription = accountDescription;
	}

	public Object getAccountDescription(){
		return accountDescription;
	}

	public void setCreationTime(long creationTime){
		this.creationTime = creationTime;
	}

	public long getCreationTime(){
		return creationTime;
	}

	public void setValidator5(Object validator5){
		this.validator5 = validator5;
	}

	public Object getValidator5(){
		return validator5;
	}

	public void setValidator4(Object validator4){
		this.validator4 = validator4;
	}

	public Object getValidator4(){
		return validator4;
	}

	public void setValidator3(Object validator3){
		this.validator3 = validator3;
	}

	public Object getValidator3(){
		return validator3;
	}

	public void setValidator2(Object validator2){
		this.validator2 = validator2;
	}

	public Object getValidator2(){
		return validator2;
	}

	public void setDigitalOperationStatus(String digitalOperationStatus){
		this.digitalOperationStatus = digitalOperationStatus;
	}

	public String getDigitalOperationStatus(){
		return digitalOperationStatus;
	}

	public void setRequireConfirmation(boolean requireConfirmation){
		this.requireConfirmation = requireConfirmation;
	}

	public boolean isRequireConfirmation(){
		return requireConfirmation;
	}

	public void setSubscription(boolean subscription){
		this.subscription = subscription;
	}

	public boolean isSubscription(){
		return subscription;
	}

	public void setLogin(String login){
		this.login = login;
	}

	public String getLogin(){
		return login;
	}

	public void setWorkflowDecision(Object workflowDecision){
		this.workflowDecision = workflowDecision;
	}

	public Object getWorkflowDecision(){
		return workflowDecision;
	}

	public void setDigitalUser(Object digitalUser){
		this.digitalUser = digitalUser;
	}

	public Object getDigitalUser(){
		return digitalUser;
	}

	public void setEndpoint(Object endpoint){
		this.endpoint = endpoint;
	}

	public Object getEndpoint(){
		return endpoint;
	}

	public void setConfirmationClientCode(Object confirmationClientCode){
		this.confirmationClientCode = confirmationClientCode;
	}

	public Object getConfirmationClientCode(){
		return confirmationClientCode;
	}

	public void setLastConnectionTime(long lastConnectionTime){
		this.lastConnectionTime = lastConnectionTime;
	}

	public long getLastConnectionTime(){
		return lastConnectionTime;
	}

	public void setClient(String client){
		this.client = client;
	}

	public String getClient(){
		return client;
	}

	public void setCurrency(Object currency){
		this.currency = currency;
	}

	public Object getCurrency(){
		return currency;
	}

	public void setWorkflowResume(boolean workflowResume){
		this.workflowResume = workflowResume;
	}

	public boolean isWorkflowResume(){
		return workflowResume;
	}

	public void setOperationNature(String operationNature){
		this.operationNature = operationNature;
	}

	public String getOperationNature(){
		return operationNature;
	}

	public void setConfirmationTimeout(Object confirmationTimeout){
		this.confirmationTimeout = confirmationTimeout;
	}

	public Object getConfirmationTimeout(){
		return confirmationTimeout;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setCreator(Object creator){
		this.creator = creator;
	}

	public Object getCreator(){
		return creator;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public String getAddress(){
		return address;
	}

	public void setClientId(Object clientId){
		this.clientId = clientId;
	}

	public Object getClientId(){
		return clientId;
	}

	public void setComments(List<Object> comments){
		this.comments = comments;
	}

	public List<Object> getComments(){
		return comments;
	}

	public void setManager(Object manager){
		this.manager = manager;
	}

	public Object getManager(){
		return manager;
	}

	public void setSmsConfirmation(boolean smsConfirmation){
		this.smsConfirmation = smsConfirmation;
	}

	public boolean isSmsConfirmation(){
		return smsConfirmation;
	}

	public void setTradeDate(String tradeDate){
		this.tradeDate = tradeDate;
	}

	public String getTradeDate(){
		return tradeDate;
	}

	public void setAccountNumber(Object accountNumber){
		this.accountNumber = accountNumber;
	}

	public Object getAccountNumber(){
		return accountNumber;
	}

	public void setMenu(List<MenuItem> menu){
		this.menu = menu;
	}

	public List<MenuItem> getMenu(){
		return menu;
	}

	public void setTaskAffectationConfig(Object taskAffectationConfig){
		this.taskAffectationConfig = taskAffectationConfig;
	}

	public Object getTaskAffectationConfig(){
		return taskAffectationConfig;
	}

	public void setActor(Object actor){
		this.actor = actor;
	}

	public Object getActor(){
		return actor;
	}

	public void setProspect(boolean prospect){
		this.prospect = prospect;
	}

	public boolean isProspect(){
		return prospect;
	}

	public void setUserActions(List<Object> userActions){
		this.userActions = userActions;
	}

	public List<Object> getUserActions(){
		return userActions;
	}

	public void setPk(int pk){
		this.pk = pk;
	}

	public int getPk(){
		return pk;
	}

	public void setDigitalOpeType(Object digitalOpeType){
		this.digitalOpeType = digitalOpeType;
	}

	public Object getDigitalOpeType(){
		return digitalOpeType;
	}

	public void setAccount(Object account){
		this.account = account;
	}

	public Object getAccount(){
		return account;
	}

	public void setCurrencyDecimal(Object currencyDecimal){
		this.currencyDecimal = currencyDecimal;
	}

	public Object getCurrencyDecimal(){
		return currencyDecimal;
	}
}