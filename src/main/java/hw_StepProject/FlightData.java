package hw_StepProject;

import java.text.ParseException;

public class FlightData extends FlightService {

    public FlightData(FlightCollectionDao acd) {
        super(acd);
    }
    public void AppDatagenerate() throws ParseException {
        Flights fl = new Flights(1244,"Baku","03.02.2023", "12:20",130);
        Flights fl2 = new Flights(1235, "Ganja", "05.02.2023", "14:20",100);
        Flights fl3 = new Flights(1236, "Gabala","01.02.2023", "18:20", 51);
        Flights fl4 = new Flights(1244,"Istanbul","03.10.2022", "12:20",20);
        Flights fl5 = new Flights(1235, "Ankara", "05.12.2022", "14:20",77);
        Flights fl6 = new Flights(1236, "Izmir","29.10.2022", "18:20", 45);
        Flights fl7 = new Flights(1244,"Paris","03.10.2022", "12:20",13);
        Flights fl8 = new Flights(1235, "Prague", "05.12.2022", "14:20",10);
        Flights fl9 = new Flights(1236, "Viana","07.11.2022", "18:20", 50);

        acd.saveFlight(fl);
        acd.saveFlight(fl2);
        acd.saveFlight(fl3);
        acd.saveFlight(fl4);
        acd.saveFlight(fl5);
        acd.saveFlight(fl6);
        acd.saveFlight(fl7);
        acd.saveFlight(fl8);
        acd.saveFlight(fl9);
    }
}