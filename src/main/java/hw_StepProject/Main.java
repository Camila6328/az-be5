package hw_StepProject;
import lesson1.BookingCollectionDaoM;

import java.io.*;
import java.text.ParseException;
import java.util.Scanner;
public class Main {
    static FlightService fs = new FlightService();
    static File fileFlight = new File(fs.pathFlight);
    static File fileBooking = new File(fs.pathBooking);
    static FlightCollectionDao appC = new FlightCollectionDao(fileFlight);
    static BookingCollectionDao bcd = new BookingCollectionDao(fileBooking);
    public static void main(String[] args) throws ParseException, IOException {
        System.out.println( appC.getAllFlights());
        FlightService appS =  new FlightService(new FlightCollectionDao(fileFlight));
        FlightData fd = new FlightData(appC);
        Scanner sc = new Scanner(System.in);
        // fd.AppDatagenerate();
        boolean isCheck = true;

    while(isCheck) {
        /* Search flight by flightId */
//        System.out.println("Search flight by flightId.");
//        System.out.print("Please enter flightId: ");
//        int flightId=sc.nextInt();
//        System.out.println(appC.findFlight(flightId));
//        System.out.println("Search flight by toCity,dateFrom and passengers Count");
//        System.out.print("Please enter toCityName: ");
//        String toCityName = sc.nextLine();
//        System.out.print("Please enter dateFrom: ");
//        String dateFrom = sc.nextLine();
//        System.out.print("Please enter passengers Count: ");
//        int passCnt=sc.nextInt();
//        System.out.println(appC.findFlight(toCityName,dateFrom,passCnt));
//        System.out.println("Find aviableSeat Count Flight by Flight id");
//        System.out.print("Please enter flightId: ");
//        int aflightId=sc.nextInt();
//        System.out.println(appC.findFlightAvbCnt(aflightId));
        // System.out.println(appC.chooseFlight(1236));

        System.out.println();
        System.out.println("Flight Booking");
        System.out.print("Enter a flightId for book: ");
        int bookFLight = sc.nextInt();
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Enter your surname: ");
        String surname = sc.next();
        Passengers pas1 = new Passengers(name,surname);
        fs.bookingFlight(bookFLight, pas1.getName(), pas1.getSurname());

//        String passFullname = pas1.getName() + " " + pas1.getSurname();
//        bcd.saveBooking(appC.findFlight(1236).get(), passFullname);

        System.out.println(appC.getAllFlights());

        //  System.out.println(bcd.getMyFlights("Jamila Garayeva"));
        //   System.out.println(bcd.getMyFlights(passFullname));

         System.out.println("Cancellation of Booking");
        System.out.print("Enter a flightId for book: ");
        int cbookFLight = sc.nextInt();
        System.out.println("Enter your name: ");
        String cname = sc.next();
        System.out.println("Enter your surname: ");
        String csurname = sc.next();
        Passengers pas2 = new Passengers(cname,csurname);
        fs.cancelBooking(cbookFLight, pas2.getName(), pas2.getSurname());

       // System.out.println(bcd.getMyFlights(passFullname));

            System.out.print("PLS ENTER EXIT FOR 'Shuts down the application'  or anything for continue: ");
            String endBook = sc.next();
            if (endBook.toUpperCase().equals("EXIT")) {
                isCheck = false;
            } else {
                isCheck = true;
            }
         }

    }

      //  System.out.println(appC.findFlight(1236));
    }



