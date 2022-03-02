package com.jquayle

class Appointment {

	Date appointmentDate
	String appointmentTime
	int appDurationInMins
	String roomNumber
	
    static constraints = {
	/* blank for strings, nullable for numbers */
	appointmentDate blank: false;
	appointmentTime blank: false;
	appDurationInMins nullable: false;
	roomNumber blank: false;
    }
}
