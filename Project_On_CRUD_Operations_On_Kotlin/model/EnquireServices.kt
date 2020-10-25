package model

import daoServices.Enquire
import daoServices.closeConnection
import daoServices.getConnection
import java.util.Scanner

class EnquireServices{
    companion object{
        fun enquireServices(){
            println("Enter blood type ,city to enquire")
            var sc=Scanner(System.`in`)
            var blood_type = readLine()
            var city = readLine()
            //var amt = sc.nextInt()
            getConnection()
            if (blood_type != null) {
                if (city != null) {
                    Enquire.enquire(blood_type,city)
                }
            }
            closeConnection()
        }

    }
}