package com.jquayle

class Doctor {

	String fullName
	String docQualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

	String toString(){
		return fullName;
	}
	static belongsTo = [surgery:Surgery]
	static hasMany = [appointments:Appointment, prescriptions:Prescription, patients:Patient, nurses:Nurse]

    static constraints = {
	/* blank for strings, nullable for numbers */
	fullName blank: false;
	docQualification blank: false;
	position blank: false;
	doctorEmail blank: false, email: true;
	password blank: false;
	doctorOffice blank: false;
	doctorPhone blank: false, size: 9..11;
	bio blank: false, widget: 'textarea';
    }
}
