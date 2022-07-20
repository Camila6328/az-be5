package hw4;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int year;
    int iq;
    Pet pet;
    Human mother;
    Human father;
    String[][] schedule = new String[7][2];

    @Override
    public String toString() {
        return "{name=" + this.name  + ", surname=" + this.surname + ", year=" + this.year + "\n"
                + ", pet=" + this.pet + "\n"
                + ", mother=" + this.mother + "\n" + ", father=" + this.father + "\n"
                 + ", schedule=" +  Arrays.deepToString(this.schedule)
                +"]"
                ;
        //dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}
    }

    // (name)
    //(surname)
    //date of birth (year), number
    //IQ level (iq) (a whole number from 1 to 100))
    //(pet) (object type Pet)
    //(mother) (object type Human)
    //(father) (object type Human)
    //Schedule of non-working activities (schedule) (2d array: [day of the week] x [type of the activity])
//    public static void main(String[] args) {
//        System.out.println("tsts");
//
//    }
    public void greetPet(String nickname){
        System.out.printf("Hello, [%s]",nickname,"/n");
        System.out.println();
    }
    // (greetPet)("Hello, [the name of the pet]")

    //  (describePet): (display the information about your pet:
    //  "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50".
    public void describePet(int slyLevel, String species, int age){
        String  sly;
        if(slyLevel>50){
            sly = "very sly";
        }
        else {
            sly = "almost not sly";
        }
        System.out.printf("I have a [%s], he is [%s] years old, he is [%s]",species,age,sly,"/n");
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

    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year, String[][] schedule ) {
        super();
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.schedule = schedule;
    }

    //constructor which describes the name, surname and the date of birth
    public Human( String name, String surname, int year){
        this.name = name; //"undefined name";
        this.surname = surname;//"undefined surname";
        this.year = year; // - 1;
      }
    //    constructor which describes the name, surname, date of birth, father and mother
    public Human(String name, String surname, int year,Human mother, Human father){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
    }
    public Human(String name, String surname, int year,Pet pet){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
    }

    //    constructor which describes all the fields
    public Human(String name, String surname, int year,Pet pet, Human mother, Human father,String[][] schedule){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.pet = pet;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;

    }
    // String[][] schedule = new String[7][2];
//    empty constructor
    public Human(){
    }

}


