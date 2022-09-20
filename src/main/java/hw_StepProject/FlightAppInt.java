package hw_StepProject;

import java.util.List;
import java.util.Optional;

public interface FlightAppInt {
    public void saveFlight(Flights flight);
    public List<Flights> getAllFlights();
    public Optional<Flights> findFlight(int flightId); //searching and booking plane tickets //Optional<Flights>
    public List<Flights>findFlight(String toCity,String fromDate,int passCnt);
    public String chooseFlight(int flightId);
    public void deleteFlight(int flightId);
    public int findFlightAvbCnt(int flightId);

}
