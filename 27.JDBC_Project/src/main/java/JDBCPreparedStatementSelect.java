import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCPreparedStatementSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

	    String url="jdbc:postgresql://localhost:5432/demo";
	    String username="postgres";
	    String password="abcd";
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Student id");
	    int sid=sc.nextInt();
	    String sqlSelect="select * from student where sid=?";
	    Class.forName("org.postgresql.Driver");//Invoking the Driver
	    Connection con=DriverManager.getConnection(url,username,password); //Establishing the Connection
	    System.out.println("Establishing the Connection");
	    PreparedStatement st=con.prepareStatement(sqlSelect);
	    st.setInt(1,sid);
	    System.out.println("Id Marks Name");
	    ResultSet rs=st.executeQuery();
	    while(rs.next())
	    {
	    	System.out.print(rs.getInt(1)+"  ");
	    	System.out.print(rs.getInt(2)+"    ");
	    	System.out.println(rs.getString(3));
	    	
	    }
	    con.close();
	    System.out.println("Closing the Connection");
	}

}
