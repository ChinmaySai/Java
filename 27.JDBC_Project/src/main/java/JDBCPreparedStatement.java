import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCPreparedStatement {


public static void main(String[] args) throws ClassNotFoundException, SQLException {

    String url="jdbc:postgresql://localhost:5432/demo";
    String username="postgres";
    String password="abcd";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Student id,marks, name");
    int sid=sc.nextInt();
    int marks=sc.nextInt();
    String name=sc.next();
    String sqlInsert="insert into student values(?,?,?)";
    Class.forName("org.postgresql.Driver");//Invoking the Driver
    Connection con=DriverManager.getConnection(url,username,password); //Establishing the Connection
    System.out.println("Establishing the Connection");
    PreparedStatement st=con.prepareStatement(sqlInsert);
    st.setInt(1,sid);
    st.setInt(2,marks);
    st.setString(3,name);
    st.execute();
    System.out.println("Row inserted Successfully");
    System.out.println("User input:");
    System.out.println("sid : "+sid);
    System.out.println("marks : "+marks);
    System.out.println("name : "+name);
    con.close();
    System.out.println("Closing the Connection");
}
}

