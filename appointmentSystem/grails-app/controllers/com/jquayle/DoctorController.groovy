package com.jquayle


class DoctorController {

    def scaffold=Doctor

    def login(){


   }

   def validate() {
      
      def user1 = Doctor.findByEmail(params.email)
      if (user1 && user1.password == params.password)
      {
      session.user1 = user1
      render view:'doctor'
      
   }else{

      flash.message = "Invalid email and password."
      render view:'login'

   }
   }

   def logout={
      session.user1 = null
      redirect(uri:'/')
   }
}
