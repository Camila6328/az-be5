package hw_StepProject;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class BookingCollectionDao extends FlightCollectionDao implements BookingAppInt
{
    public BookingCollectionDao(File file) {
        super(file);
    }
    FlightCollectionDao appC = new FlightCollectionDao(file);
    @Override
    public Map<String,Flights> getMyFlights(String fullName) {
        try (FileInputStream fs = new FileInputStream(file);
             BufferedInputStream bs = new BufferedInputStream(fs);
             ObjectInputStream os = new ObjectInputStream(bs);
        )
        {   Object flights = os.readObject();
            Map myFlights = new HashMap<>();
            myFlights.put(fullName,flights);
           // List<Flights> allFlights = (ArrayList<Flights>) flights;
            return myFlights;
        }
        catch (IOException | ClassNotFoundException ex) {
            return new HashMap<>();
        }
    }
    @Override
    public void saveBooking(Flights flight, String fullName) {
        Map<String, Flights> mapFlights = getMyFlights(fullName);
            mapFlights.put(fullName,flight);
            write(mapFlights);
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
    public String pathFlight = "//Users/jamilagara/flights.txt";
    @Override
    public String bookingFlight(int flightId, String name, String surname) throws IOException {
   //     getAllFlights().stream().filter(f->f.flightId==flightId).
      //  Flights flight = new Flights();

       // saveBooking(appC.findFlight(flightId).get(),name + " " + surname);
     //   Path path = Paths.get("flights.txt");
    // findFlightAvbCnt(flightId);
     //   Files.lines(path).filter(line -> line.contains("5")).findFirst().map(line-> line.replaceAll("5", "4"));
        return "1";//appC.findFlight(flightId).toString()
    }

}
