package daoServices

import java.sql.ResultSet
import java.sql.*

class AdminDetails{
    companion object{
        fun adminDetails(){
            val sql = "SELECT * FROM donors WHERE did = '1' "
            val stmt = conn?.prepareStatement(sql)
            val result: ResultSet? = stmt?.executeQuery(sql)
            if (result != null) {
                while (result.next()) {
                   println(result.getInt(1))
                    println(result.getString(2))
                    println(result.getString(3))
                    println(result.getString(4))
                    println(result.getInt(5))
                    println(result.getString(6))
                   // println(result.getDate(7)
                    println(result.getString(8))
                    println(result.getString(9))
                    println(result.getInt(10))
                    println(result.getString(11))
                }
            }
        }
    }
}



