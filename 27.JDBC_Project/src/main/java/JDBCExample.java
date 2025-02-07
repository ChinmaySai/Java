/**
 * JDBC Steps
 * 1.Import Packages
 * 2.Load Drivers and Register drivers
 * 3.Create a Connection
 * 4.Create Statement
 * 5.Excecute Statement
 * 6.Process Result
 * 7.Close*
 */

import java.sql.*;

public class JDBCExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:postgresql://localhost:5432/demo";
        String username="postgres";
        String password="abcd";
        String sql="select * from student";
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Establishing the Connection");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        //rs.next();
        //System.out.println(rs.getString("sname"));
        while(rs.next()){
            System.out.println(rs.getInt(1)+"-"+rs.getInt(2)+"-"+rs.getString(3));
        }
        con.close();
        System.out.println("Closing the Connection");
    }
}
