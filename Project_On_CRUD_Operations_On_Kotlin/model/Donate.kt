package model

import java.util.Scanner
import daoServices.*
class DonorServices {
    companion object {
        fun donor_services() {
            println("Choose an option from the submenu")
            println("1.Add Donor \n2.Delete Donor \n3.Go back to main menu")
            when (readLine()?.toInt()) {
                1 -> this.adddonor()
                2 -> this.deleteDonor()
                3 -> println()
                else -> println("INVALID MENU OPTION...\nPLEASE TRY AGAIN LATER")
            }
        }

        fun adddonor() {
            println("Enter donor details")
            var sc = Scanner(System.`in`)
            println("Enter did")
            var did = sc.nextInt()
            println("Enter first name and last name")
            var first_name = sc.next()
            var last_name = sc.next()
            println("Enter email ")
            var email = sc.next()
            println("Enter phone")
            var phone = sc.nextInt()
            println("Enter blood type ")
            var blood = sc.next()
            println("Enter user address ")
            var user_address = sc.next()
            println("Enter date")
            var date=sc.next()
            println("Enter city")
            var city = sc.next()
            println("Enter age")
            var age = sc.nextInt()
            println("Enter gender")
            var gender = sc.next()
            getConnection()
            InsertAndDelete.insertIntoDonors(did,first_name, last_name, email, phone, blood, date, user_address, city,age,gender)
            closeConnection()
        }
        fun deleteDonor() {
            println("-----------Clear Request-------------")
            println("Enter ID to delete")
            var sc1=Scanner(System.`in`)
            var did = sc1.nextInt()
            getConnection()
            InsertAndDelete.deleteRecordDonor(did)
            closeConnection()
        }
    }
}
