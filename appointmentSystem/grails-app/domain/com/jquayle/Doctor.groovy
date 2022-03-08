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
	static hasOne = [surgery:Surgery]
	static hasMany = [patients:Patient, appointments:Appointment, nurses:Nurse, prescriptions:Prescription]

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
