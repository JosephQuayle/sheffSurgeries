package com.jquayle


class PrescriptionController {

    def scaffold=Prescription

    def advSearch1(){
		render view: 'advSearch1'
	}

	def advResults1(){
		def prescriptionProps = Prescription.metaClass.properties*.name

		def prescriptions = Prescription.withCriteria{
			"${params.queryType}"{

					params.each {field, value ->
					if (prescriptionProps.grep(field) && value){
						ilike(field, value)
					}
				}
			}
		}
		return [prescriptions:prescriptions]
	}

}
