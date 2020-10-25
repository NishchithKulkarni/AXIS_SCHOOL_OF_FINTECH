package daoServices

import java.sql.PreparedStatement
import java.sql.DriverManager.getConnection
import java.sql.ResultSet
//import java.time.Formatter.DateTimeFormatter
import java.time.format.DateTimeFormatter
import java.time.DateTimeException
import java.*
import java.lang.Exception
import java.util.*

class InsertAndDelete {
     companion object {
         fun insertIntoRequest(id: Int, first_name: String, last_name: String, email: String, phone: Int, blood: String, amount: Int, user_address: String, city: String) {
            // var conn = getConnection("jdbc:mysql://localhost:3306/bloodbank?serverTimezone=UTC", "root", "")
             var sql: String = "INSERT INTO requests (id,first_name,last_name,email,phone,blood,amount,user_address,city) VALUES (?,?,?,?,?,?,?,?,?)"
             var statement: PreparedStatement? = conn?.prepareStatement(sql)
             if (statement != null) {
                 statement.setInt(1, id)
             }
             if (statement != null) {
                 statement.setString(2, first_name)
             }
             if (statement != null) {
                 statement.setString(3, last_name)
             }
             if (statement != null) {
                 statement.setString(4, email)
             }
             if (statement != null) {
                 statement.setInt(5, phone)
             }
             if (statement != null) {
                 statement.setString(6, blood)
             }
             if (statement != null) {
                 statement.setInt(7, amount)
             }
             if (statement != null) {
                 statement.setString(8, user_address)
             }
             if (statement != null) {
                 statement.setString(9, city)
             }

             var rowsUpdated = statement?.executeUpdate()
             if (rowsUpdated != null) {
                 if (rowsUpdated > 0)
                     println("An existing user was updated successfully")
             }
         }

         fun deleteRecordRequest(id:Int) {
             val sql:String = "DELETE FROM requests WHERE id = $id"
             val stmt:PreparedStatement? = conn?.prepareStatement(sql)
             val rowsDeleted = stmt?.executeUpdate()
             if (rowsDeleted != null) {
                 if (rowsDeleted > 0) {
                     println("An user was deleted successfully!")
                 }
             }
         }

         fun insertIntoDonors(did: Int, first_name: String, last_name: String, email: String, phone: Int, blood: String, last_date:String,user_address: String , city: String, age: Int, gender: String) {

            // var date=DateTimeFormatter.ofPattern("yyyy-MM-dd")
             try {
                 var sql: String = "INSERT INTO donors (did,first_name,last_name,email,phone,blood,last_date,user_address,city,age,gender) VALUES (?,?,?,?,?,?,?,?,?,?,?)"
                 var statement: PreparedStatement? = conn?.prepareStatement(sql)
                 if (statement != null) {
                     statement.setInt(1, did)
                 }
                 if (statement != null) {
                     statement.setString(2, first_name)
                 }
                 if (statement != null) {
                     statement.setString(3, last_name)
                 }
                 if (statement != null) {
                     statement.setString(4, email)
                 }
                 if (statement != null) {
                     statement.setInt(5, phone)
                 }
                 if (statement != null) {
                     statement.setString(6, blood)
                 }
                 if (statement != null) {
                     statement.setString(7, last_date)
                 }
                 if (statement != null) {
                     statement.setString(8, user_address)
                 }
                 if (statement != null) {
                     statement.setString(9, city)
                 }
                 if (statement != null) {
                     statement.setInt(10, age)
                 }
                 if (statement != null) {
                     statement.setString(11, gender)
                 }
                 var rowsUpdated = statement?.executeUpdate()
                 if (rowsUpdated != null) {
                     if (rowsUpdated > 0)
                         println("An existing user was updated successfully")
                 }
             }
             catch (e: Exception){
                 e.printStackTrace()
             }
         }

         fun deleteRecordDonor(did:Int) {
             val sql = "DELETE FROM donors WHERE did = $did"
             val stmt = conn?.prepareStatement(sql)
             val rowsDeleted = stmt?.executeUpdate()
             if (rowsDeleted != null) {
                 if (rowsDeleted > 0) {
                     println("An user was deleted successfully!")
                 }
             }
         }
     }
 }

