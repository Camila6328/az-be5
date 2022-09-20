package hw_StepProject;

import java.util.ArrayList;

public class Bookings {
    Passengers passenger;
    Flights flight;
    @Override
    public String toString() {
        return "Bookings{" +
                "passenger=" + passenger +
                ", flight=" + flight +
                '}';
    }

    public Passengers getPassenger() {
        return passenger;
    }

    public void setPassenger(Passengers passenger) {
        this.passenger = passenger;
    }

    public Flights getFlight() {
        return flight;
    }

    public void setFlight(Flights flight) {
        this.flight = flight;
    }
}
