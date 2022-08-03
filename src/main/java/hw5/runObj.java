package hw5;

import java.util.Arrays;

public class runObj {
    // Driver Code
    public static void main(String[] args) {
        String[][] sc = new String[][]{{"1","w1"},{"2","w2"},{"3","w3"},{"4","w4"},{"5","w5"},{"6","w6"},{"7","w7"}};
        Human mother = new Human("Malahat", "Garayeva",1962,64,sc);
        Human father = new Human("Rafig", "Garayeva",1960,70,sc);
        Human child1 = new Human("Camila", "Garayeva",1993, 60,sc);
        Human child2 = new Human("Ulviyya", "Garayeva",1990, 60,sc);
        Human child3 = new Human("Turana", "Garayeva",1989,45,sc);
        Pet pet = new Pet("dog","Maestro",1,30, new String[]{"eat", "drink", "sleep"});

        Family fm = new Family(father,mother,pet);
        System.out.println(fm);
        fm.addChild(child3);
        fm.addChild(child2);
        fm.addChild(child1);
        System.out.println(fm);
        fm.deleteChild(1);
        System.out.println(fm);

        int c = fm.countFamily();
        System.out.println("count of Family members = " + c);

        //  In the Main class create several families, so that every class uses all the available constructors. Display data about every person.
        //        String nc = pet.getNickname();
        //        pet.greetPet(nc);
        //        String sp = pet.getSpecies();
        //        int catAge = pet.getAge();
        //        int slyLevel = pet.getTrickLevel();
        //        pet.describePet(slyLevel,sp,catAge);
        //        System.out.println(pet);

    }
}
