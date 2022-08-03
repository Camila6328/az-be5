package hw5;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    String[][] schedule = new String[7][2];

    @Override
    public String toString() {
        return "{name=" + this.name  + ", surname=" + this.surname + ", year=" + this.year
                + ", iq=" + this.iq
                + ", schedule=" +  Arrays.deepToString(this.schedule)
                +"]"
                ;
    }
    // create methods:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getIq() {
        return iq;
    }
    public void setIq(int iq) {
        this.iq = iq;
    }
    public String[][] getSchedule() {
        return schedule;
    }
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void greet(){
        System.out.println("to welcome the favourite");
    }

    public void describe(){
        System.out.println("to describe the favourite");
    }

    //constructor which describes the name, surname
    public Human( String name, String surname){
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
    }

    //constructor which describes the name, surname and the date of birth or iq
    public Human( String name, String surname, int var){
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