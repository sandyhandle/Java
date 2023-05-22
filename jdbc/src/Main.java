import java.sql.*;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws Exception{
        delete();
    }
    public static void insertRecords() throws Exception {
        String url = "jdbc:mysql://localhost:3306/sandy";
        String userName = "root";
        String password = "8xhx3j9G&NP8Ms";
        String query = "insert into student (name, major, gpa) values('priya', 'eee', 7.67)";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);
        System.out.println("No of rows affected : " + rows);
//        while (rs.next()){
//            System.out.println(rs.getInt(1));
//            System.out.println(rs.getString(2));
//            System.out.println(rs.getString(3));
//        }
        con.close();
    }
    public static void delete() throws Exception {
        String url = "jdbc:mysql://localhost:3306/sandy";
        String userName = "root";
        String password = "8xhx3j9G&NP8Ms";

        String query = "delete from student where student_id = 5";

        Connection con = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        int rows = st.executeUpdate(query);

        System.out.println("No of rows affected : " + rows);
        con.close();
    }
    public static void readRecords() throws Exception {
        String url = "jdbc:mysql://localhost:3306/sandy";
        String userName = "root";
        String password = "8xhx3j9G&NP8Ms";
        String query = "select * from student";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
        }
        con.close();
    }
}