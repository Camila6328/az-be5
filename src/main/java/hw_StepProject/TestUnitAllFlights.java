package hw_StepProject;
import org.junit.Assert;
import org.junit.Test;

public class TestUnitAllFlights extends Main{
    @Test
    public void getAllFlightsTest() {
        if (Main.appC.getAllFlights().size()>0){
            System.out.println(Main.appC.getAllFlights());
        }else
        {
            System.out.println("Flight is not Found");
        }

        }
    }
