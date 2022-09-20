package hw_StepProject;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FlightCollectionDao implements FlightAppInt {//extends AppData
    File file;
    public FlightCollectionDao(File file) {
        this.file = file;
        }
    @Override
    public List<Flights> getAllFlights() {
        try (FileInputStream fs = new FileInputStream(file);
             BufferedInputStream bs = new BufferedInputStream(fs);
             ObjectInputStream os = new ObjectInputStream(bs);
             )
        {
            Object flights = os.readObject();
            List<Flights> allFlights = (ArrayList<Flights>) flights;
                return allFlights;
        }
        catch (IOException | ClassNotFoundException ex) {
                return new ArrayList<>();
        }
    }
    @Override
    public void saveFlight(Flights flight) {
        List<Flights>flights = getAllFlights();
        flights.add(flight);
        write(flights);
     }
    public void write(List<Flights> flights) {
        try (FileOutputStream fs = new FileOutputStream(file);
             BufferedOutputStream bs = new BufferedOutputStream(fs);
             ObjectOutputStream os = new ObjectOutputStream(bs);
             )
        {
            os.writeObject(flights);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public Optional<Flights> findFlight(int flightId) {

        return getAllFlights().stream().filter(s -> s.getFlightId() == flightId).findFirst();
    }
    @Override
    public List<Flights>findFlights(String toCity, String fromDate, int passCnt) {
      return getAllFlights().stream()
                .filter(
                        f->(f.getToCity().toLowerCase().equals(toCity.toLowerCase())
                                && f.getDateFrom().equals(fromDate)
                                && f.getAvblTicketCnt()>=passCnt)
                ).collect(Collectors.toList());
    }

    @Override
    public int findFlightAvbCnt(int flightId) {
        int cnt = findFlight(flightId).get().avblTicketCnt;
        return cnt;
    }

    @Override
    public String chooseFlight(int flightId) {
        if (findFlight(flightId).stream().findFirst().isPresent()) {
            return findFlight(flightId).stream().findFirst().toString();
       } else if (flightId==0) {


        }
        return "Please Enter available flight ID: ";
    }

}
