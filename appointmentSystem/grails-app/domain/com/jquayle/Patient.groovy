package com.jquayle

class Patient {

	String patientName
	String patientAddress
	String patientResidence
	Date patientDob
	int patientID
	Date dateRegistered
	String patientPhone
	

    static constraints = {
	/* blank for strings, nullable for numbers */
	patientName blank: false;
	patientAddress blank: false;
	patientResidence blank: false;
	patientDob blank: false;
	patientID nullable: false;
	dateRegistered blank: false;
	patientPhone blank: false, size: 9..11;
    }
}
