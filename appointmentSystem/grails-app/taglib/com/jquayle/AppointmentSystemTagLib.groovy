package com.jquayle

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

	def loginToggle={
	
	out << "<div style ='margin-left:0px 0 0px;'>"
	if (request.getSession(false) && session.user){
	out << "<span style=float: left; padding-left: 200px;margin-left:400px'>"
	out << "Welcome ${session.user}."
	out << "</span><span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Receptionist', action:'logout')}'>"
	out << "Logout</a></span>"
	}else{
	
	out << "<span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Receptionist', action:'login')}'>"
	out << "Login </a></span>"
	}

	out << "</div><br/>"
	
	}
}
