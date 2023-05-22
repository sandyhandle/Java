package BusResv;

import java.awt.print.Book;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public  static void main(String[] args) throws SQLException {


        Scanner scanner = new Scanner(System.in);
        int userOpt = 1;


        BusDAO busdao = new BusDAO();
        busdao.displayBusInfo();


        while (userOpt==1){
            System.out.println("Enter 1 to book and 2 to exit: ");
            userOpt = scanner.nextInt();

            if (userOpt == 1){
                Booking b = new Booking();
                if(b.isAvilable()){
                    BookingDAO bookingdao = new BookingDAO();
                    bookingdao.addBooking(b);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry. Bus is full. Try another bus or date.");
                }
            }
        }

        scanner.close();




    }
}
