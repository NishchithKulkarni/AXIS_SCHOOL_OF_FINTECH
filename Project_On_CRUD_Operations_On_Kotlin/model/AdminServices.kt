package model

import daoServices.AdminDetails
import daoServices.Enquire
import daoServices.closeConnection
import daoServices.getConnection
import java.util.*

class AdminServices {
    companion object {
        fun adminServices() {
            println("The Admin Details are")
            getConnection()
            AdminDetails.adminDetails()
            closeConnection()
        }
    }
}