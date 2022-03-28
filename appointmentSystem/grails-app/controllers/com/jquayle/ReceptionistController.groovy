package com.jquayle


class ReceptionistController {

   def scaffold=Receptionist

   def login(){

      def validate() {
      def user = Lecturer.findByUsername(params.username)
      if (user && user.password == params.password){
      session.user = user
      render view:'receptionist'
      }

   }

}
