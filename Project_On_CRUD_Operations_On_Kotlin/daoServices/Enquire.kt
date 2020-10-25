package daoServices

import java.sql.PreparedStatement
import java.sql.ResultSet

class Enquire {
    companion object {
        fun enquire(blood_type: String, city: String) {
            val sql = "SELECT * FROM `blood_storage` WHERE blood_type = '$blood_type' AND city = '$city'"
            val stmt = conn?.prepareStatement(sql)
            val result: ResultSet? = stmt?.executeQuery(sql)
            if (result != null) {
                while (result.next()) {
                    val amount = result.getInt("amount")
                    val city = result.getString("city")
                    //while (result.next()) {
                    println("The amount of blood present in $city is :" )
                    println(amount)
                    //  }

                }
            }
        }
    }
}
