package hw5;

import java.util.Arrays;

public class Pet {

        String species;
        String nickname;
        int age;
        int trickLevel; // (a whole number from 1 to 100)
        String[] habits ; // (array of strings)

        public void eat(){
                System.out.println("I am eating");
        }
        public void respond(){
                System.out.printf("Hello, owner. I am - [{%s}]. I miss you!"+nickname+"\n");

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

        public void greetPet(String nickname){
                System.out.printf("Hello, [%s]",nickname+"/n");
                System.out.println();
        }

        //  (describePet): (display the information about your pet:
        //  "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50".
        public void describePet(int slyLevel, String species, int age){
                String sly;
                if(slyLevel>50){sly = "very sly";}
                else {sly = "almost not sly";}
                System.out.printf("I have a [%s], he is [%s] years old, he is [%s]"+species+age+sly+"/n");
        }

        // In class Pet create constructors:
        //constructor which describes the pet's species a nickname
        public Pet(String species, String nickname){
                this.species = "undedined species";
                this.nickname = "undefined nickname";
        }
        //constructor which describes all the fields for the pet
        public Pet(String species, String  nickname, int age, int trickLevel, String[] habits) {
                this.species = species;
                this.nickname = nickname;
                this.age = age;
                this.trickLevel = trickLevel;
                this.habits = habits;
        }
        //empty constructor
        public Pet(){
        }
}
