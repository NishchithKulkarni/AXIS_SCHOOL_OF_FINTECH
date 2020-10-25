import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodorder","root","");
		String sql="insert into customer values(?,?,?,?,?,?,?)";
		PreparedStatement statement=conn.prepareStatement(sql);
		int noOfRowsAffected=statement.executeUpdate();
		String sql2="Select * from customer";
		Statement stmt=conn.createStatement();
		ResultSet result=stmt.executeQuery(sql2);
		while(result.next()) {
			System.out.println(result.getString(2));
		}
		
		
		
		/*Statement stmt=conn.createStatement();
		ResultSet resultSet=stmt.executeQuery("SELECT * FROM blood_storage");
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1));
		}
	}*/

}
}
