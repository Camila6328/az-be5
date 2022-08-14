package hw7;

import java.util.Arrays;

public abstract class Pet {

    // In class Pet create constructors:
    public Pet(String nickname, int trickLevel, Species species) {
        this.nickname = nickname;
        this.trickLevel = trickLevel;
        this.species = species;
    }

    public Pet(String nickname, int trickLevel) {
        this.nickname = nickname;
        this.trickLevel = trickLevel;
    }

    enum Species {
        bird(true, 2, false),
        cat(false, 4, true),
        dog(false, 4, true),
        fish(false, 0, false),
        unknown("unknown");
        // unknown(false, 0, false);
        private boolean fly;
        private int numberOfLegs;
        private boolean hasFur;
        private final static String label = null;
        Species(boolean canFly, int numberOfLegs, boolean hasFur) {
            this.fly = canFly;
            this.numberOfLegs = numberOfLegs;
            this.hasFur = hasFur;
        }
        Species(String label) {
        }
        public static Species resolveYourEnum(String stringToMatch) {
            return Arrays.stream(values()).filter(aEnum -> aEnum.label.equals(stringToMatch))
                    .findFirst().orElse(unknown);
        }

    }

    Species species;
        String nickname;
        int age;
        int trickLevel; // (a whole number from 1 to 100)
        String[] habits ; // (array of strings)
        public void eat(){
                System.out.println("I am eating");
        }
        public abstract String respond();
        //  (describePet): (display the information about your pet:
       //  "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50".
        public abstract void describePet();

}
