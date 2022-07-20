package hw4;

import java.util.Arrays;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel; // (a whole number from 1 to 100)
    String[] habits ; // (array of strings)

    public Pet(String species, String  nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat(){
        System.out.println("I am eating");
    }
    public void respond(){
        System.out.printf("Hello, owner. I am - [{%S}}]. I miss you!",nickname,"\n");

    }
    public void foul(){
        System.out.println("I need to cover it up'");
    }
    @Override
    public String toString() {
        return this.species + "{nickname=" + this.nickname + ", age=" + this.age + ", trickLevel=" + this.trickLevel  +
                ", habits=" + Arrays.toString(this.habits)  + "]";
        //dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies (String species){
        this.species = species;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname (String nickname){
        this.nickname = nickname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getTrickLevel() {
        return trickLevel;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    // In class Pet create constructors:
    //constructor which describes the pet's species an nickname
    public Pet(String species, String nickname){
        this.species = "undedined species";
        this.nickname = "undefined nickname";
    }
    //constructor which describes all the fields for the pet
    public Pet (String species, String nickname, String age, int trickLevel , String[] habits){
        this.species = "undedined species";
        this.nickname = "undefined nickname";
        this.age = -1;
        this.trickLevel = 0;
        this.habits = new String[]{};
    }
    //empty constructor
    public Pet(){

    }



}

