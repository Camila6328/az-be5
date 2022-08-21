package HW9;
import java.util.Map;
public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Map<String, String> schedule;
    String [] workList;
    String [] DayOfWeek;
    public Human() {}
    public Human(String name) {
        this.name = name; //"undefined name";
       // this.surname = surname;//"undefined surname";
    }
    public Human(String name, String surname, int year) {
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        this.year = year;
    }
    @Override
    public String toString() {
        return "{name=" + this.name + ", surname=" + this.surname + ", year=" + this.year
                + "]";
    }
}
