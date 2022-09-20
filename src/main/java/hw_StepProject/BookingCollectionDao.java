package hw_StepProject;
import java.io.*;
import java.util.*;
public class BookingCollectionDao extends FlightCollectionDao implements BookingAppInt
{ public BookingCollectionDao(File file) {
        super(file);
    }
    @Override
    public List<Flights> getMyFlights(String fullName) {
        try (FileInputStream fs = new FileInputStream(file);
             BufferedInputStream bs = new BufferedInputStream(fs);
             ObjectInputStream os = new ObjectInputStream(bs);
        )
        {   Object flights = os.readObject();
            List<Flights> allBookings = (ArrayList<Flights>) flights;
            return allBookings;
        }
        catch (IOException | ClassNotFoundException ex) {
            return new ArrayList<>();
        }
    }
    @Override
    public void saveBooking(Flights flight, String fullName) {
        List<Flights>flights = getMyFlights(fullName);
        flights.add(flight);
        write(flights);

        }
        public void write(Map<String, Flights> mapFlights) {
            try (FileOutputStream fs = new FileOutputStream(file);
                 BufferedOutputStream bs = new BufferedOutputStream(fs);
                 ObjectOutputStream os = new ObjectOutputStream(bs);
            )
            {  //System.out.println(mapFlights);
                os.writeObject(mapFlights);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
    }



}
