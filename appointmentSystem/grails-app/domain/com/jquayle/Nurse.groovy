package com.jquayle

class Nurse {

	String nurseName
	String nurseQualification
	String nurseEmail
	String nurseOffice
	String nursePhone

    static constraints = {
	/* blank for strings, nullable for numbers */
	nurseName blank: false;
	nurseQualification blank: false;
	nurseEmail blank: false, email: true;
	nurseOffice blank: false;
	nursePhone blank: false, size: 9..11;
    }
}
