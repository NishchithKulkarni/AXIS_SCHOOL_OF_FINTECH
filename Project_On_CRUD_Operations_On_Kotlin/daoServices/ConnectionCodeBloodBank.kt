package daoServices
import java.sql.Connection
import java.sql.DriverManager
var conn :Connection? = null
fun getConnection()
{
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank?serverTimezone=UTC", "root", "")

    }catch (e : Exception)
    {
        e.printStackTrace()
    }
}
fun closeConnection()
{
    conn?.close()
}