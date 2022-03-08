package com.jquayle

class Surgery {

	String name
	String address
	String surgeryPhoneNumber
	int numberOfPatients
	String description
	String openingTime

	String toString(){
		return name;
	}
	
	static hasMany = [doctors:Doctor, nurses:Nurse, receptionists:Receptionist, patients:Patient, appopintments:Appointment]


    static constraints = {
 	/* blank for strings, nullable for numbers */
	name blank: false;
	address blank: false;
	surgeryPhoneNumber blank: false, size: 9..11;
	numberOfPatients nullable: false;
	description blank: false, widget: 'textarea';
	openingTime blank: false;
    }
}
