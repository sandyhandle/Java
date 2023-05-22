package BusResv;

import java.sql.*;
import java.util.Date;

public class BookingDAO {
    public int getBookedCount(int busNo, Date date) throws SQLException{

        String query = "Select count(passenger_name) from booking where bus_no=? and travel_data=?";
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        java.sql.Date sqldate = new java.sql.Date(date.getTime());
        pst.setInt(1, busNo);
        pst.setDate(2, sqldate);
        ResultSet rs = pst.executeQuery();
        rs.next();
        return rs.getInt(1);
    }

    public void addBooking(Booking b) throws SQLException {
        String query = "Insert into booking values(?,?,?);";
        Connection con = DbConnection.getConnection();
        PreparedStatement pst = con.prepareStatement(query);
        java.sql.Date sqldate = new java.sql.Date(b.date.getTime());
        pst.setString(1, b.passengerName);
        pst.setInt(2,b.busNo);
        pst.setDate(3,sqldate);
        pst.executeUpdate();
    }


}
