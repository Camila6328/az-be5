package HW9;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TimeZone;

public class Human {
    String name;
    String surname;
   // int year;
    long birthDate;
    String bDate;
    int iq;
    Map<String, String> schedule;
    String [] workList;
    String [] DayOfWeek;
    public Human(String roman, String zamanli, String s) {}
    public Human(String name) {
        this.name = name; //"undefined name";
       // this.surname = surname;//"undefined surname";
    }
    public Human(String name, String surname) {
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
      //  this.year = year;
    }

    public Human(String name, String surname, long birthDate) {
        Date dataTime = new Date(birthDate*1000L);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        df.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String java_date = df.format(dataTime);
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        this.bDate = java_date;
    }
    public Human(String name, String surname, String birthDate,int iq) {
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        this.bDate=birthDate;
        this.iq = iq;
    }

    @Override
    public String toString() {


        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate= " + bDate + //birthDate+//
                //
                ", iq=" + iq +
                '}';
    }

    public String describeAge(long birthDate){
        Date dataTime = new Date(birthDate*1000L);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        df.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String java_date = df.format(dataTime);
        String nv = "year:" +  new SimpleDateFormat("YYYY").format(dataTime)
                 + " month:" + new SimpleDateFormat("MM").format(dataTime)
                 + " day:" + new SimpleDateFormat("dd").format(dataTime);
        return nv;
    }


}
