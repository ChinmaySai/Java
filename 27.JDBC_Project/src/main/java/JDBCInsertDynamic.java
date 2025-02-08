
import java.sql.*;
import java.util.Scanner;

public class JDBCInsertDynamic {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:postgresql://localhost:5432/demo";
        String username="postgres";
        String password="abcd";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Student id,marks, name");
        int sid=sc.nextInt();
        int marks=sc.nextInt();
        String name=sc.next();
        String sqlInsert="insert into student values("+sid+","+marks+",'"+name+"')";
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Establishing the Connection");
        Statement st=con.createStatement();
        st.execute(sqlInsert);
        System.out.println("Row inserted");
        con.close();
        System.out.println("Closing the Connection");
    }
}
