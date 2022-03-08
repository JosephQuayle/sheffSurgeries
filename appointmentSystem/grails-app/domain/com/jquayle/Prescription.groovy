package com.jquayle

class Prescription {

	String pharmacyName
	int prescripNumber
	String medicine
	int totalCost
	Date dateIssued
	Boolean patientPaying

	String toString(){
		return prescripNumber;
	}
	static hasOne = [doctor:Doctor, patient:Patient]
	

    static constraints = {
	/* blank for strings, nullable for numbers */
	pharmacyName blank: false;
	prescripNumber nullable: false;
	medicine blank: false;
	totalCost nullable: false;
	dateIssued blank: false;
    }
}
