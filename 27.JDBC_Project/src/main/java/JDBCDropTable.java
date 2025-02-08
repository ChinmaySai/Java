import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDropTable {

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		String url="jdbc:postgresql://localhost:5432/demo";
		String userName="postgres";
		String pass="abcd";
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection(url,userName,pass);
		String sqlDropTable="DROP TABLE TEMP_TABLE";
		Statement st=con.createStatement();
		st.executeUpdate(sqlDropTable);
		System.out.println("Table dropped Successfully");
		
	}
}
