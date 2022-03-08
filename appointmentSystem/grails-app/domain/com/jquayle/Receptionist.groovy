package com.jquayle

class Receptionist {

	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

	String toString(){
		return recepName;
	}
	static hasOne = [surgery:Surgery]
	

    static constraints = {
	/* blank for strings, nullable for numbers */
	recepName blank: false;
	recepEmail blank: false, email: true;
	recepUsername blank: false;
	recepPassword blank: false;
	recepPhone blank: false, size: 9..11;
    }
}
