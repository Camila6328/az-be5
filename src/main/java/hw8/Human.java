package hw8;

import java.util.HashMap;
import java.util.Map;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Map<String, String> schedule;
    String [] workList;
    String [] DayOfWeek;

    public Human(String name, String surname, int year, Map<String, String> schedule) {
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        this.year = year;
        this.schedule = schedule;

    }

    @Override
    public String toString() {
        return "{name=" + this.name + ", surname=" + this.surname + ", year=" + this.year
                + ", iq=" + this.iq +"\n"
                + ", schedule=" + this.schedule
                + "]";
    }



}
