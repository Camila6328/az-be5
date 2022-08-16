package hw8;

import java.util.Set;
public class Pet {
    enum Species {
        dog(false, 4, true),
        cat(false, 4, true),
        bird(true, 2, false),
        fish(false, 0, false);

        Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        }
    }
    String nickname;
    int age;
    int trickLevel;
    Set<String> habits ;//= new HashSet<String>();
    Species species;

    public Pet(Pet.Species species, String  nickname, int age, int trickLevel, Set<String> habits) { //
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species=" + species +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +

                '}';
    }
}
