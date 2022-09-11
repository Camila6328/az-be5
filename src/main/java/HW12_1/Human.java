package HW12_1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class Human {
    String name;
    String surname;
   // int year;
    long birthDate;
    String bDate;
    int iq;
    Map<String, String> schedule = new HashMap<>();
    String [] workList;
    String [] DayOfWeek;

    public Human(){};
    public Human(String name) {
        this.name = name; //"undefined name";
       // this.surname = surname;//"undefined surname";
    }
    public Human(String name, String surname) {
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
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
    public Human(String name, String surname, String birthDate, int iq) {
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        this.bDate=birthDate;
        this.iq = iq;
    }
    public Human(String name, String surname, int iq,Map<String, String> schedule) {
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int iq) {
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIq() {
        return iq;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toFormatSch() {
        if (schedule.isEmpty()) {
            return "";
        } else return ", " + "schedule" + schedule;
    }

    @Override
    public String toString() {

        return "{ name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate= " + bDate + //birthDate+//
                ", iq=" + iq +
                  toFormatSch() +
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

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge(long birthDate){

        Date dataTime =  new Date(birthDate*1000L);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/YYYY");
        df.setTimeZone(TimeZone.getTimeZone("GMT-4"));
        String bYear = new SimpleDateFormat("YYYY").format(dataTime);
        String cYear = new SimpleDateFormat("YYYY").format(new Date().getTime());
    return (int) Integer.parseInt(cYear)- Integer.parseInt(bYear);
        // return 1;
    }

}
