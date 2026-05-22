package in.bank.entity;

import java.time.LocalDate;
import java.util.List;

public class Customer {
	private String firstName;
	private String middleName;
	private String lastName;
	
	private String fatherName;
	private LocalDate dateOfBirth;
	private char gender;
	private String panNumber;
	
	private String passportDetails;
	private String marriedStatus;
	private int noOfDependents;
	private List<Integer> ageOfDependents;
	private String nationality;
	private String residentialStatus;
	private String religion;
	private String educationalQualification;
	private List<String> earningMemberInFamily;
	private int lengthOfRelationshipWithBank;
	private boolean isExistingBorrower;
	private String staffName;		// TODO clarify, person who process the request in bank
	
	public String getFirstName() {
		return firstName;
	}
	public Customer(String firstName, String middleName, String lastName, String fatherName, LocalDate dateOfBirth,
			char gender, String panNumber, String passportDetails, String marriedStatus, int noOfDependents,
			List<Integer> ageOfDependents, String nationality, String residentialStatus, String religion,
			String educationalQualification, List<String> earningMemberInFamily, int lengthOfRelationshipWithBank,
			boolean isExistingBorrower, String staffName, long accountNumber, long bankDeposits) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fatherName = fatherName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.panNumber = panNumber;
		this.passportDetails = passportDetails;
		this.marriedStatus = marriedStatus;
		this.noOfDependents = noOfDependents;
		this.ageOfDependents = ageOfDependents;
		this.nationality = nationality;
		this.residentialStatus = residentialStatus;
		this.religion = religion;
		this.educationalQualification = educationalQualification;
		this.earningMemberInFamily = earningMemberInFamily;
		this.lengthOfRelationshipWithBank = lengthOfRelationshipWithBank;
		this.isExistingBorrower = isExistingBorrower;
		this.staffName = staffName;
		this.accountNumber = accountNumber;
		this.bankDeposits = bankDeposits;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getPassportDetails() {
		return passportDetails;
	}
	public void setPassportDetails(String passportDetails) {
		this.passportDetails = passportDetails;
	}
	public String getMarriedStatus() {
		return marriedStatus;
	}
	public void setMarriedStatus(String marriedStatus) {
		this.marriedStatus = marriedStatus;
	}
	public int getNoOfDependents() {
		return noOfDependents;
	}
	public void setNoOfDependents(int noOfDependents) {
		this.noOfDependents = noOfDependents;
	}
	public List<Integer> getAgeOfDependents() {
		return ageOfDependents;
	}
	public void setAgeOfDependents(List<Integer> ageOfDependents) {
		this.ageOfDependents = ageOfDependents;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getEducationalQualification() {
		return educationalQualification;
	}
	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}
	public List<String> getEarningMemberInFamily() {
		return earningMemberInFamily;
	}
	public void setEarningMemberInFamily(List<String> earningMemberInFamily) {
		this.earningMemberInFamily = earningMemberInFamily;
	}
	public int getLengthOfRelationshipWithBank() {
		return lengthOfRelationshipWithBank;
	}
	public void setLengthOfRelationshipWithBank(int lengthOfRelationshipWithBank) {
		this.lengthOfRelationshipWithBank = lengthOfRelationshipWithBank;
	}
	public boolean isExistingBorrower() {
		return isExistingBorrower;
	}
	public void setExistingBorrower(boolean isExistingBorrower) {
		this.isExistingBorrower = isExistingBorrower;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public long getBankDeposits() {
		return bankDeposits;
	}
	public void setBankDeposits(long bankDeposits) {
		this.bankDeposits = bankDeposits;
	}
	private long accountNumber;
	private long bankDeposits;
	
	
}
