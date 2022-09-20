package hw_StepProject;

import java.io.IOException;
import java.util.Map;

public interface BookingAppInt {
    public Map<String,Flights> getMyFlights(String fullName);
    public String bookingFlight(int flightId, String name, String surname) throws IOException;//
    public void saveBooking(Flights flight, String fullName);

}
