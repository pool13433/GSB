package com.poolsawat.api.gsb.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Discipline implements Serializable{

	private static final long serialVersionUID = -5095706930741411332L;

	@JsonProperty(value="PERNR")
	private String perNR;
	
	@JsonProperty(value="NAMEOFFORMOFADDRESS")	
	private String nameOffOrMofAddress;
	
	@JsonProperty(value="FIRSTNAME")	
	private String firstName;
	
	@JsonProperty(value="LASTNAME")
	private String lastName;
	
	@JsonProperty(value="POSITION")
	private String position;
	
	@JsonProperty(value="INV_PUNISH_TYPE_TEXT")
	private String invPunishTypeText;
	
	@JsonProperty(value="INV_PUNISH_DATEC")
	private String invPunishDatec;
	
	@JsonProperty(value="INV_FACT_DATE")
	private String invFactDate;
	
	@JsonProperty(value="INV_FACT_NO")
	private String invFactNo;
	
	@JsonProperty(value="COMMIT_DATE")
	private String commitDate;
	
	@JsonProperty(value="INV_FACT_DETAIL1")
	private String invFactDetail1;
	
	@JsonProperty(value="INV_FACT_DETAIL2")
	private String invFactDetail2;
	
	@JsonProperty(value="INV_FACT_DETAIL3")
	private String invFactDetail3;
	
	@JsonProperty(value="INV_FACT_RESULT")
	private String invFactResult;
	
	@JsonProperty(value="INV_FACT_REASON")
	private String invFactReason;
	
	@JsonProperty(value="INV_FACT_PUNISH_DATE")
	private String invFactPunishDate;
	
	@JsonProperty(value="INV_FACT_REASON1")
	private String invFactReason1;
	
	@JsonProperty(value="INV_FACT_REASON2")
	private String invFactReason2;
	
	@JsonProperty(value="INV_FACT_PUNISH_COMM_NO")
	private String invFactPunishCommNo;
	
	@JsonProperty(value="RECEIVE_INV_FACT_DATE")
	private String receiveInvFactDate;
	
	@JsonProperty(value="INV_NO")
	private String invNo;
	
	@JsonProperty(value="APPOINT_COMMITEE_DATE")
	private String appointCommiteeDate;
	
	@JsonProperty(value="ACCUSATION_DATE")
	private String accusationDate;
	
	@JsonProperty(value="INV_DETAIL1")
	private String invDatail1;
	
	@JsonProperty(value="INV_DETAIL2")
	private String invDatail2;
	
	@JsonProperty(value="INV_DETAIL3")
	private String invDatail3;
	
	@JsonProperty(value="INV_DETAIL4")
	private String invDatail4;
	
	@JsonProperty(value="INV_DETAIL5")
	private String invDatail5;
	
	@JsonProperty(value="INV_EXTEND_NO")
	private String invExtendNo;
	
	@JsonProperty(value="INV_EXTEND_DATE")
	private String invExtendDate;
	
	@JsonProperty(value="INV_PUNISH_TYPE")
	private String invPunishType;
	
	@JsonProperty(value="INV_PUNISH_REASON")
	private String invPunishReason;
	
	@JsonProperty(value="INV_PUNISH_STEP")
	private String invPunishStep;
	
	@JsonProperty(value="INV_PUNISH_REASON2")
	private String invPunishReason2;
	
	@JsonProperty(value="INV_PUNISH_SALARY")
	private String invPunishSaraly;
	
	@JsonProperty(value="INV_PUNISH_REASON3")
	private String invPunishReason3;
	
	@JsonProperty(value="INV_PUNISH_DATE")
	private String invPunishDate;
	
	@JsonProperty(value="INV_PUNISH_COMM_DATE")
	private String invPunishCommDate;
	
	@JsonProperty(value="INV_PUNISH_SALARY_MONTH")
	private String invPunishSaralyMonth;
	
	@JsonProperty(value="INV_PUNISH_COMM_NO")
	private String invPunishCommNo;
	
	@JsonProperty(value="INV_OTHER_REASON")
	private String invOtherReason;
	
	@JsonProperty(value="APPEAL_DATE")
	private String appealDate;
	
	@JsonProperty(value="APPEAL_NO")
	private String appealNo;
	
	@JsonProperty(value="APPEAL_RESULT")
	private String appealResult;
	
	@JsonProperty(value="APPEAL_REASON")
	private String appealReason;
	
	@JsonProperty(value="APPEAL_STEP")
	private String appealstep;
	
	@JsonProperty(value="APPEAL_REASON2")
	private String appealReason2;
	
	@JsonProperty(value="APPEAL_SALARY")
	private String appealSaraly;
	
	@JsonProperty(value="APPEAL_REASON3")
	private String appealReason3;
	
	@JsonProperty(value="APPEAL_EFFECTIVE_DATE")
	private String appealEffectiveDate;
	
	@JsonProperty(value="APPEAL_COMM_DATE")
	private String appealCommDate;
	
	@JsonProperty(value="APPEAL_SALARY_MONTH")
	private String appealSaralyMonth;
	
	@JsonProperty(value="APPEAL_COMM_NO")
	private String appealCommNo;
	
	@JsonProperty(value="PURIFY_DATE")
	private String purifDate;
	
	@JsonProperty(value="PURIFY_YEAR")
	private String purifYear;
	
	@JsonProperty(value="PURIFY_EFFECTIVE_DATE")
	private String purifEffectiveDate;
	
	@JsonProperty(value="PURIFY_DETAIL1")
	private String purifDetail1;
	
	@JsonProperty(value="PURIFY_DETAIL2")
	private String purifDetail2;
	
	

	public Discipline() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Discipline(String perNR) {
		super();
		this.perNR = perNR;
	}

	public String getPerNR() {
		return perNR;
	}

	public void setPerNR(String perNR) {
		this.perNR = perNR;
	}

	public String getNameOffOrMofAddress() {
		return nameOffOrMofAddress;
	}

	public void setNameOffOrMofAddress(String nameOffOrMofAddress) {
		this.nameOffOrMofAddress = nameOffOrMofAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getInvPunishTypeText() {
		return invPunishTypeText;
	}

	public void setInvPunishTypeText(String invPunishTypeText) {
		this.invPunishTypeText = invPunishTypeText;
	}

	public String getInvPunishDatec() {
		return invPunishDatec;
	}

	public void setInvPunishDatec(String invPunishDatec) {
		this.invPunishDatec = invPunishDatec;
	}

	public String getInvFactDate() {
		return invFactDate;
	}

	public void setInvFactDate(String invFactDate) {
		this.invFactDate = invFactDate;
	}

	public String getInvFactNo() {
		return invFactNo;
	}

	public void setInvFactNo(String invFactNo) {
		this.invFactNo = invFactNo;
	}

	public String getCommitDate() {
		return commitDate;
	}

	public void setCommitDate(String commitDate) {
		this.commitDate = commitDate;
	}

	public String getInvFactDetail1() {
		return invFactDetail1;
	}

	public void setInvFactDetail1(String invFactDetail1) {
		this.invFactDetail1 = invFactDetail1;
	}

	public String getInvFactDetail2() {
		return invFactDetail2;
	}

	public void setInvFactDetail2(String invFactDetail2) {
		this.invFactDetail2 = invFactDetail2;
	}

	public String getInvFactDetail3() {
		return invFactDetail3;
	}

	public void setInvFactDetail3(String invFactDetail3) {
		this.invFactDetail3 = invFactDetail3;
	}

	public String getInvFactResult() {
		return invFactResult;
	}

	public void setInvFactResult(String invFactResult) {
		this.invFactResult = invFactResult;
	}

	public String getInvFactReason() {
		return invFactReason;
	}

	public void setInvFactReason(String invFactReason) {
		this.invFactReason = invFactReason;
	}

	public String getInvFactPunishDate() {
		return invFactPunishDate;
	}

	public void setInvFactPunishDate(String invFactPunishDate) {
		this.invFactPunishDate = invFactPunishDate;
	}

	public String getInvFactReason1() {
		return invFactReason1;
	}

	public void setInvFactReason1(String invFactReason1) {
		this.invFactReason1 = invFactReason1;
	}

	public String getInvFactReason2() {
		return invFactReason2;
	}

	public void setInvFactReason2(String invFactReason2) {
		this.invFactReason2 = invFactReason2;
	}

	public String getInvFactPunishCommNo() {
		return invFactPunishCommNo;
	}

	public void setInvFactPunishCommNo(String invFactPunishCommNo) {
		this.invFactPunishCommNo = invFactPunishCommNo;
	}

	public String getReceiveInvFactDate() {
		return receiveInvFactDate;
	}

	public void setReceiveInvFactDate(String receiveInvFactDate) {
		this.receiveInvFactDate = receiveInvFactDate;
	}

	public String getInvNo() {
		return invNo;
	}

	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}

	public String getAppointCommiteeDate() {
		return appointCommiteeDate;
	}

	public void setAppointCommiteeDate(String appointCommiteeDate) {
		this.appointCommiteeDate = appointCommiteeDate;
	}

	public String getAccusationDate() {
		return accusationDate;
	}

	public void setAccusationDate(String accusationDate) {
		this.accusationDate = accusationDate;
	}

	public String getInvDatail1() {
		return invDatail1;
	}

	public void setInvDatail1(String invDatail1) {
		this.invDatail1 = invDatail1;
	}

	public String getInvDatail2() {
		return invDatail2;
	}

	public void setInvDatail2(String invDatail2) {
		this.invDatail2 = invDatail2;
	}

	public String getInvDatail3() {
		return invDatail3;
	}

	public void setInvDatail3(String invDatail3) {
		this.invDatail3 = invDatail3;
	}

	public String getInvDatail4() {
		return invDatail4;
	}

	public void setInvDatail4(String invDatail4) {
		this.invDatail4 = invDatail4;
	}

	public String getInvDatail5() {
		return invDatail5;
	}

	public void setInvDatail5(String invDatail5) {
		this.invDatail5 = invDatail5;
	}

	public String getInvExtendNo() {
		return invExtendNo;
	}

	public void setInvExtendNo(String invExtendNo) {
		this.invExtendNo = invExtendNo;
	}

	public String getInvExtendDate() {
		return invExtendDate;
	}

	public void setInvExtendDate(String invExtendDate) {
		this.invExtendDate = invExtendDate;
	}

	public String getInvPunishType() {
		return invPunishType;
	}

	public void setInvPunishType(String invPunishType) {
		this.invPunishType = invPunishType;
	}

	public String getInvPunishReason() {
		return invPunishReason;
	}

	public void setInvPunishReason(String invPunishReason) {
		this.invPunishReason = invPunishReason;
	}

	public String getInvPunishStep() {
		return invPunishStep;
	}

	public void setInvPunishStep(String invPunishStep) {
		this.invPunishStep = invPunishStep;
	}

	public String getInvPunishReason2() {
		return invPunishReason2;
	}

	public void setInvPunishReason2(String invPunishReason2) {
		this.invPunishReason2 = invPunishReason2;
	}

	public String getInvPunishSaraly() {
		return invPunishSaraly;
	}

	public void setInvPunishSaraly(String invPunishSaraly) {
		this.invPunishSaraly = invPunishSaraly;
	}

	public String getInvPunishReason3() {
		return invPunishReason3;
	}

	public void setInvPunishReason3(String invPunishReason3) {
		this.invPunishReason3 = invPunishReason3;
	}

	public String getInvPunishDate() {
		return invPunishDate;
	}

	public void setInvPunishDate(String invPunishDate) {
		this.invPunishDate = invPunishDate;
	}

	public String getInvPunishCommDate() {
		return invPunishCommDate;
	}

	public void setInvPunishCommDate(String invPunishCommDate) {
		this.invPunishCommDate = invPunishCommDate;
	}

	public String getInvPunishSaralyMonth() {
		return invPunishSaralyMonth;
	}

	public void setInvPunishSaralyMonth(String invPunishSaralyMonth) {
		this.invPunishSaralyMonth = invPunishSaralyMonth;
	}

	public String getInvPunishCommNo() {
		return invPunishCommNo;
	}

	public void setInvPunishCommNo(String invPunishCommNo) {
		this.invPunishCommNo = invPunishCommNo;
	}

	public String getInvOtherReason() {
		return invOtherReason;
	}

	public void setInvOtherReason(String invOtherReason) {
		this.invOtherReason = invOtherReason;
	}

	public String getAppealDate() {
		return appealDate;
	}

	public void setAppealDate(String appealDate) {
		this.appealDate = appealDate;
	}

	public String getAppealNo() {
		return appealNo;
	}

	public void setAppealNo(String appealNo) {
		this.appealNo = appealNo;
	}

	public String getAppealResult() {
		return appealResult;
	}

	public void setAppealResult(String appealResult) {
		this.appealResult = appealResult;
	}

	public String getAppealReason() {
		return appealReason;
	}

	public void setAppealReason(String appealReason) {
		this.appealReason = appealReason;
	}

	public String getAppealstep() {
		return appealstep;
	}

	public void setAppealstep(String appealstep) {
		this.appealstep = appealstep;
	}

	public String getAppealReason2() {
		return appealReason2;
	}

	public void setAppealReason2(String appealReason2) {
		this.appealReason2 = appealReason2;
	}

	public String getAppealSaraly() {
		return appealSaraly;
	}

	public void setAppealSaraly(String appealSaraly) {
		this.appealSaraly = appealSaraly;
	}

	public String getAppealReason3() {
		return appealReason3;
	}

	public void setAppealReason3(String appealReason3) {
		this.appealReason3 = appealReason3;
	}

	public String getAppealEffectiveDate() {
		return appealEffectiveDate;
	}

	public void setAppealEffectiveDate(String appealEffectiveDate) {
		this.appealEffectiveDate = appealEffectiveDate;
	}

	public String getAppealCommDate() {
		return appealCommDate;
	}

	public void setAppealCommDate(String appealCommDate) {
		this.appealCommDate = appealCommDate;
	}

	public String getAppealSaralyMonth() {
		return appealSaralyMonth;
	}

	public void setAppealSaralyMonth(String appealSaralyMonth) {
		this.appealSaralyMonth = appealSaralyMonth;
	}

	public String getAppealCommNo() {
		return appealCommNo;
	}

	public void setAppealCommNo(String appealCommNo) {
		this.appealCommNo = appealCommNo;
	}

	public String getPurifDate() {
		return purifDate;
	}

	public void setPurifDate(String purifDate) {
		this.purifDate = purifDate;
	}

	public String getPurifYear() {
		return purifYear;
	}

	public void setPurifYear(String purifYear) {
		this.purifYear = purifYear;
	}

	public String getPurifEffectiveDate() {
		return purifEffectiveDate;
	}

	public void setPurifEffectiveDate(String purifEffectiveDate) {
		this.purifEffectiveDate = purifEffectiveDate;
	}

	public String getPurifDetail1() {
		return purifDetail1;
	}

	public void setPurifDetail1(String purifDetail1) {
		this.purifDetail1 = purifDetail1;
	}

	public String getPurifDetail2() {
		return purifDetail2;
	}

	public void setPurifDetail2(String purifDetail2) {
		this.purifDetail2 = purifDetail2;
	}
	
}
