package hw_StepProject;
import java.io.File;

public class FlightService {
    private File f;
    public File getF() {return f;}
    public void setF(File f) {this.f = f;}
    public FlightCollectionDao acd = new FlightCollectionDao(getF());
    public FlightService(FlightCollectionDao acd) {
        this.acd = acd;
    }
    public FlightService(){};
    public static String pathFlight = "//Users/jamilagara/flights.txt";
    public static String pathBooking = "//Users/jamilagara/booking.txt";
    static File fileFlight = new File(pathFlight);
    static File fileBooking = new File(pathBooking);
    static FlightCollectionDao appC = new FlightCollectionDao(fileFlight);
    static BookingCollectionDao bcd = new BookingCollectionDao(fileBooking);
    public static void bookingFlight(int flightId, String name, String surname) {
        if (appC.findFlight(flightId).isPresent()) {
        Flights fl = appC.findFlight(flightId).get();
        int seats = fl.getAvblTicketCnt();
        fl.setAvblTicketCnt(seats - 1);
        appC.deleteFlight(flightId);
        appC.saveFlight(fl);
        System.out.println("Aviable Seats: " + seats);

            bcd.saveBooking(appC.findFlight(flightId).get(), name + " " + surname);
        } else {
            System.out.println("this flight is not found");
        }
    }
    public static void cancelBooking(int cancelFlightId, String name, String surname){
        if (appC.findFlight(cancelFlightId).isPresent()) {
            Flights ff = appC.findFlight(cancelFlightId).get();
            appC.deleteFlight(cancelFlightId);
            int seats = ff.getAvblTicketCnt();
            if (bcd.findFlight(cancelFlightId).isPresent()) {
                ff.setAvblTicketCnt(seats + 1);
                appC.deleteFlight(cancelFlightId);
                appC.saveFlight(ff);
                System.out.println("Aviable Seats: " + seats);
            }
        } else {
            System.out.println("this flight is not found");
        }

        }
    }

