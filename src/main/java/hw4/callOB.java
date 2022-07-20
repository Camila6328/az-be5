package hw4;

import java.util.Arrays;

public class callOB {
    public static void main(String[] args) {
        Pet fPet = new Pet("dog","Maestro",1,30, new String[]{"eat", "drink", "sleep"});
        Pet mPet = new Pet("birds","Kuly",1,47, new String[]{"eat", "drink", "sleep"});
        String[][] sc = new String[][]{{"1","w1"},{"2","w2"},{"3","w3"},{"4","w4"},{"5","w5"},{"6","w6"},{"7","w7"}};

        Human father = new Human("Rafig", "Garayev",1960,fPet);
        Human mother = new Human("Malahat", "Garayev",1962,mPet);
        Pet childPet = new Pet("cat","Barni",5,70, new String[]{"eat", "drink", "sleep"});
         Human child = new Human("Camila", "Garayeva",1993,
                childPet,mother,father,sc

         );
        //,);
        //In the Main class create several families, so that every class uses all the available constructors. Display data about every person.
        String nm = child.getName();
        System.out.println(child.toString());
        String nc = childPet.getNickname();
        //System.out.println(nc);
        child.greetPet(nc);
        String sp = childPet.getSpecies();
        int catAge = childPet.getAge();
        int slyLevel = childPet.getTrickLevel();
        child.describePet(slyLevel,sp,catAge);
        System.out.println(childPet.toString());
    }
}
