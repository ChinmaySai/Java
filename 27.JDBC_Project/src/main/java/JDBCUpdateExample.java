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

public class JDBCUpdateExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:postgresql://localhost:5432/demo";
        String username="postgres";
        String password="abcd";
        String sqlUpdate="update student set sname='Chinmay Sai' where sid=1";
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Establishing the Connection");
        Statement st=con.createStatement();
        st.execute(sqlUpdate);
        System.out.println("Updated Row");
        con.close();
        System.out.println("Closing the Connection");
    }
}
