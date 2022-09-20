package hw_StepProject;
import java.util.List;

public interface BookingAppInt {
    public List<Flights> getMyFlights(String fullName);
   // public void bookingFlight(int flightId, String name, String surname) throws IOException;//
    public void saveBooking(Flights flight, String fullName);

}
