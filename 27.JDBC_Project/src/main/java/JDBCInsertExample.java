/**
 * JDBC Steps
 * 1.Import Packages
 * 2.Load Drivers and Register drivers
 * 3.Create a Connection
 * 4.Create Statement
 * 5.Excecute Statement
 * 6.Process Result
 * 7.Close
 */

import java.sql.*;

public class JDBCInsertExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:postgresql://localhost:5432/demo";
        String username="postgres";
        String password="abcd";
        String sqlInsert="insert into student values(5,95,'Harsh')";
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
