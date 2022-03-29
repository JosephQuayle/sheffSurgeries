package com.jquayle

class Receptionist {

	String recepName
	String recepEmail
	String username
	String password
	String recepPhone

	String toString(){
		return recepName;
	}
	static belongsTo = [surgery:Surgery]
	

    static constraints = {
	/* blank for strings, nullable for numbers */
	recepName blank: false;
	recepEmail blank: false, email: true;
	username blank: false;
	password blank: false;
	recepPhone blank: false, size: 9..11;
    }
}
