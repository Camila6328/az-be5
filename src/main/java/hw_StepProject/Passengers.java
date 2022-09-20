package hw_StepProject;

import java.time.LocalDateTime;
import java.util.Date;

public class Passengers {
    String name;
    String surname;
    LocalDateTime bDate;
    String passportNo;

    public Passengers(String name, String surname, LocalDateTime bDate, String passportNo) {
        this.name = name;
        this.surname = surname;
        this.bDate = bDate;
        this.passportNo = passportNo;
    }
}
