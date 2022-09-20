package hw_StepProject;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static String pathFlight = "//Users/jamilagara/flights.txt";
    public static String pathBooking = "//Users/jamilagara/booking.txt";
    public static void main(String[] args) throws ParseException, IOException {
        File fileFlight = new File(pathFlight);
        File fileBooking = new File(pathBooking);

     //   FlightService appS =  new FlightService(new FlightCollectionDao(fileFlight));

        FlightCollectionDao appC = new FlightCollectionDao(fileFlight);
        BookingCollectionDao bcd = new BookingCollectionDao(fileBooking);


        System.out.println(appC.chooseFlight(1236));
         System.out.println(appC.findFlights("baku","03.02.2022",15));
        Flights fl1 = new Flights(1244,"Baku","03.02.2022", "12:20",130);
       System.out.println(appC.findFlight(1236));
        System.out.println(appC.findFlightAvbCnt(1236));
       bcd.saveBooking(appC.findFlight(1236).get(),"Jamila Garayeva");

        System.out.println(bcd.bookingFlight(1236, "Camila", "Garayeva"));
        //System.out.println(bcd.getMyFlights("Jamila Garayeva"));
      //  System.out.println(appC.findFlight(1236));
    }

}
