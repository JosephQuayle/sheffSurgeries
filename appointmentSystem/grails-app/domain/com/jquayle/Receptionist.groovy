package com.jquayle

class Receptionist {

	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

    static constraints = {
	/* blank for strings, nullable for numbers */
	recepName blank: false;
	recepEmail blank: false, email: true;
	recepUsername blank: false;
	recepPassword blank: false;
	recepPhone blank: false, size: 9..11;
    }
}
