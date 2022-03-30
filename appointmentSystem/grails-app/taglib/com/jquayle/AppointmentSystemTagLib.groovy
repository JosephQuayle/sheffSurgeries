package com.jquayle

class AppointmentSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    //static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

	def loginToggleMainRec={
	
	out << "<div style ='margin-left:0px 0 0px;'>"
	if (request.getSession(false) && session.user){
	out << "<span style=float: left; padding-left: 200px;margin-left:400px'>"
	out << "Welcome ${session.user}.<br>"
	out << "</span><span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Receptionist', action:'logout')}'<button type='button' class='btn link'>"
	out << "Logout </button></a></span>"
	}else{
	
	out << "<span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Receptionist', action:'login')}'<button type='button' class='btn link'>"
	out << "Receptionist Login </button> </a></span>"
	}

	out << "</div><br/>"
	
	}

	def loginToggleMainDoc={
	
	out << "<div style ='margin-left:200px 0 0px;'>"
	if (request.getSession(false) && session.user1){
	out << "<span style=float: left; padding-left: 200px;margin-left:400px'>"
	out << "Welcome ${session.user1}.<br>"
	out << "</span><span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Doctor', action:'logout')}'<button <button type='button' class='btn link'>"
	out << "Logout </button></a></span>"
	}else{
	
	out << "<span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Doctor', action:'login')}'<button type='button' class='btn link'>"
	out << "Doctor Login </button></a></span>"
	}

	out << "</div><br/>"
	
	}
	
	def loginToggleRec={
	
	out << "<div style ='margin-left:0px 0 0px;'>"
	if (request.getSession(false) && session.user){
	out << "<span style=float: left; padding-left: 200px;margin-left:400px'>"
	out << "Welcome ${session.user}.<br>"
	out << "</span><span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Receptionist', action:'logout')}'<button type='button' class='btn link'>"
	out << "  Logout</button></a></span>"
	}else{
	
	out << "<span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Receptionist', action:'login')}'<button type='button' class='btn link'>"
	out << "Receptionist Login </button></a></span>"
	}

	out << "</div><br/>"
	
	}

	def loginToggleDoc={
	
	out << "<div style ='margin-left:0px 0 0px;'>"
	if (request.getSession(false) && session.user1){
	out << "<span style=float: left; padding-left: 200px;margin-left:400px'>"
	out << "Welcome ${session.user1}.<br>"
	out << "</span><span style='float:right;margin-right:200px;'>"
	out << "<a href='${createLink(controller:'Doctor', action:'logout')}'<button type='button' class='btn link'>"
	out << "  Logout</button></a></span>"
	}else{
	
	out << "<span style='float:right;margin-right:200px'>"
	out << "<a href='${createLink(controller:'Doctor', action:'login')}'<button type='button' class='btn link'>"
	out << "Doctor Login </button></a></span>"
	}

	out << "</div><br/>"
	
	}
}
