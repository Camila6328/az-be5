package hw7;
public abstract class Human {

    enum DayOfWeek{
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }
    String name;
    String surname;
    int year;
    int iq;
    String[][] schedule = new String[7][2];

    public abstract void greet();

    public void describe(){
        System.out.println("to describe the favourite");
    }
    //constructor which describes the name, surname
    public Human(String name, String surname){
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
    }

    //constructor which describes the name, surname and the date of birth or iq
    public Human(String name, String surname, int var){
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        if (var<=100) { this.iq =  var;}
        else if(var>=1000) {this.year = var;}
    }

    //    constructor which describes all the fields
    public Human(String name, String surname, int year, int iq, String[][] schedule ) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;

    }
    //    empty constructor
    public Human(){
    }

}