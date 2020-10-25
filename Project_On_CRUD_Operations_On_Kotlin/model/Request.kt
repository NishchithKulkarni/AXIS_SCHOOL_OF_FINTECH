package model
import java.util.Scanner
import daoServices.*
class RequestServices {
    companion object {
        fun request_services() {
            println("Choose an option from the submenu")
            println("1.Add Request \n2.Delete Request \n3.Go back to main menu")
            when (readLine()?.toInt()) {
                1 -> this.addreq()
                2 -> this.deleteRequest()
                3 -> println()
                else -> println("INVALID MENU OPTION...\nPLEASE TRY AGAIN LATER")
            }
        }

        fun addreq() {
            println("Enter the details of requestor")
            var sc = Scanner(System.`in`)
            println("Enter id")
            var id = sc.nextInt()
            println("Enter first_name & last_name")
            var first_name = sc.next()
            var last_name = sc.next()
            println("Enter email ")
            var email = sc.next()
            println("Enter phone number")
            var phone = sc.nextInt()
            println("Enter blood type")
            var blood = sc.next()
            println("Enter amount of blood in kgs")
            var amount = sc.nextInt()
            println("Enter user address ")
            var user_address = sc.next()
            println("Enter city")
            var city = sc.next()
            getConnection()
            InsertAndDelete.insertIntoRequest(id,first_name, last_name, email, phone, blood, amount, user_address, city)
            closeConnection()
        }
        fun deleteRequest() {
            println("-----------Clear Request-------------")
            println("Enter ID to delete")
            val sc=Scanner(System.`in`)
            val did=sc.nextInt()
            getConnection()
            InsertAndDelete.deleteRecordRequest(did)
            closeConnection()
        }
    }
}
