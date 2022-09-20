package hw_StepProject;

import org.junit.Test;

public class TestUnitFindFlight {// Main.appC.findFlight()
    @Test
    public void findFlightTest() {
        int flightId = 1244;
        if (Main.appC.findFlight(flightId).isPresent()){
            System.out.println(Main.appC.findFlight(flightId));
        }
        else
        {
            System.out.println("Flight is not Found");
        }

    }
}
