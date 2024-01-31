package com.newgen.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GENERAL_UAN_DETAILS")

public class UANDETAILS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uanNumber;
    private String panNumber;
    private String nameOfCustomer;
    private String NameOfFirm;
	private String DateOfRegistration;
    private String constitution;
    private String gstNo;
    private String gstStatus;
    private String natureOfBusiness	;
    private String businessAddress;
    private String businessVintage;
    private String passportNumber;

    public UANDETAILS() {
        super();
    }
    
    
	public UANDETAILS(Long id, String uanNumber, String panNumber, String nameOfCustomer, String nameOfFirm,
			String dateOfRegistration, String constitution, String gstNo, String gstStatus, String natureOfBusiness,
			String businessAddress, String businessVintage, String passportNumber) {
		super();
		this.id = id;
		this.uanNumber = uanNumber;
		this.panNumber = panNumber;
		this.nameOfCustomer = nameOfCustomer;
		NameOfFirm = nameOfFirm;
		DateOfRegistration = dateOfRegistration;
		this.constitution = constitution;
		this.gstNo = gstNo;
		this.gstStatus = gstStatus;
		this.natureOfBusiness = natureOfBusiness;
		this.businessAddress = businessAddress;
		this.businessVintage = businessVintage;
		this.passportNumber = passportNumber;
	}

	
	public UANDETAILS(String uanNumber, String panNumber, String nameOfCustomer, String nameOfFirm,
			String dateOfRegistration, String constitution, String gstNo, String gstStatus, String natureOfBusiness,
			String businessAddress, String businessVintage, String passportNumber) {
		super();
		this.uanNumber = uanNumber;
		this.panNumber = panNumber;
		this.nameOfCustomer = nameOfCustomer;
		NameOfFirm = nameOfFirm;
		DateOfRegistration = dateOfRegistration;
		this.constitution = constitution;
		this.gstNo = gstNo;
		this.gstStatus = gstStatus;
		this.natureOfBusiness = natureOfBusiness;
		this.businessAddress = businessAddress;
		this.businessVintage = businessVintage;
		this.passportNumber = passportNumber;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUanNumber() {
		return uanNumber;
	}

	public void setUanNumber(String uanNumber) {
		this.uanNumber = uanNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getNameOfCustomer() {
		return nameOfCustomer;
	}

	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}

	public String getNameOfFirm() {
		return NameOfFirm;
	}

	public void setNameOfFirm(String nameOfFirm) {
		NameOfFirm = nameOfFirm;
	}

	public String getDateOfRegistration() {
		return DateOfRegistration;
	}

	public void setDateOfRegistration(String dateOfRegistration) {
		DateOfRegistration = dateOfRegistration;
	}

	public String getConstitution() {
		return constitution;
	}

	public void setConstitution(String constitution) {
		this.constitution = constitution;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getGstStatus() {
		return gstStatus;
	}

	public void setGstStatus(String gstStatus) {
		this.gstStatus = gstStatus;
	}

	public String getNatureOfBusiness() {
		return natureOfBusiness;
	}

	public void setNatureOfBusiness(String natureOfBusiness) {
		this.natureOfBusiness = natureOfBusiness;
	}

	public String getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(String businessAddress) {
		this.businessAddress = businessAddress;
	}

	public String getBusinessVintage() {
		return businessVintage;
	}

	public void setBusinessVintage(String businessVintage) {
		this.businessVintage = businessVintage;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}


	@Override
	public String toString() {
		return "UANDETAILS [id=" + id + ", uanNumber=" + uanNumber + ", panNumber=" + panNumber + ", nameOfCustomer="
				+ nameOfCustomer + ", NameOfFirm=" + NameOfFirm + ", DateOfRegistration=" + DateOfRegistration
				+ ", constitution=" + constitution + ", gstNo=" + gstNo + ", gstStatus=" + gstStatus
				+ ", natureOfBusiness=" + natureOfBusiness + ", businessAddress=" + businessAddress
				+ ", businessVintage=" + businessVintage + ", passportNumber=" + passportNumber + "]";
	}


}