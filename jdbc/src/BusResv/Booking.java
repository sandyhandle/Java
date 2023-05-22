package BusResv;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Passenger: ");
        passengerName = sc.next();

        System.out.println("Enter bus no: ");
        busNo = sc.nextInt();

        System.out.println("Enter date dd-mm-yyyy: ");
        String dateInpupt = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date = dateFormat.parse(dateInpupt);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }


}

    public boolean isAvilable() throws SQLException {
        BusDAO busdao = new BusDAO();
        BookingDAO bookingdao = new BookingDAO();

        int capacity = busdao.getCapacity(busNo);

        int booked = bookingdao.getBookedCount(busNo,date);


        return booked<capacity?true:false;
    }
    }
