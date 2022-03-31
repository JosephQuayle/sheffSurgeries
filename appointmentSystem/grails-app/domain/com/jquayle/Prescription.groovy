package com.jquayle

class Prescription {

	String pharmacyName
	String prescripNumber
	String medicine
	String totalCost
	Date dateIssued
	Boolean patientPaying

	String toString(){
		return prescripNumber;
	}
	static belongsTo = [doctor:Doctor, patient:Patient]

    static constraints = {
	/* blank for strings, nullable for numbers */
	pharmacyName blank: false;
	prescripNumber nullable: false;
	medicine blank: false;
	totalCost nullable: false;
	dateIssued blank: false;
    }
}
