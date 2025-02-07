import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String url="jdbc:postgresql://localhost:5432/demo";
        String username="postgres";
        String password="abcd";
        String sqlDelete="delete from student where sid=4";
        Class.forName("org.postgresql.Driver");
        Connection con=DriverManager.getConnection(url,username,password);
        System.out.println("Establishing the Connection");
        Statement st=con.createStatement();
        st.execute(sqlDelete);
        System.out.println("Row deleted Successfully.");
        con.close();
        System.out.println("Closing the Connection");
    }
}
