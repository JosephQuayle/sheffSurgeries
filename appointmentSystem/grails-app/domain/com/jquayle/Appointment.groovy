package com.jquayle

class Appointment {

	Date appointmentDate
	String appointmentTime
	int appDurationInMins
	String roomNumber
	

	String toString(){
		return appointmentDate;
	}
	static hasOne = [surgery:Surgery, doctor:Doctor, patient:Patient]

    static constraints = {
	/* blank for strings, nullable for numbers */
	appointmentDate blank: false;
	appointmentTime blank: false;
	appDurationInMins nullable: false;
	roomNumber blank: false;
    }
}
