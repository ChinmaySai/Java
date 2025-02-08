import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDCBCreateTable {

	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		String url="jdbc:postgresql://localhost:5432/demo";
		String userName="postgres";
		String pass="abcd";
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection(url,userName,pass);
		String sqlCreate="CREATE TABLE TEMP_TABLE(NAME TEXT)";
		Statement st=con.createStatement();
		st.executeUpdate(sqlCreate);
		System.out.println("Table created Successfully");
		
	}
}
