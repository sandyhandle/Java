package BusReservation;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {

    public  static void main(String[] args){

        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings = new ArrayList<Booking>();

        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,true,50));
        buses.add(new Bus(3,true,32));




        Scanner scanner = new Scanner(System.in);
        int userOpt = 1;


        for (Bus b: buses){
             b.displayBusInfo();
        }


        while (userOpt==1){
            System.out.println("Enter 1 to book and 2 to exit: ");
            userOpt = scanner.nextInt();

            if (userOpt == 1){
                Booking b = new Booking();
                if(b.isAvilable(bookings, buses)){
                    bookings.add(b);
                    System.out.println("Your booking is confirmed");
                } else {
                    System.out.println("Sorry. Bus is full. Try another bus or date.");
                }
            }
        }



    }
}
