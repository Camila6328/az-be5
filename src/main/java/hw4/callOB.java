package hw4;

import hw5.Family;
import hw5.Human;
import hw5.Pet;

import java.util.ArrayList;

public class callOB {
    public static void main(String[] args) {
        System.out.println();
    }

//
//        Pet pet = new Pet("dog","Maestro",1,30, new String[]{"eat", "drink", "sleep"});
//       // Family ch = new Family();
//       // ArrayList<Human> chh = new ArrayList<>();
//     //   chh.add(child1);
//       // ArrayList<Human> listch = (ArrayList<Human>) ch.addChild(child2);
//
//        //Human[]  = ch.addChild(child1);
//       Family fm = new Family();
//
//       // Family fm2 = new Family(mother,father,pet);
//
//
////        System.out.println(fm);
////        String sp = pet.getSpecies();
////        pet.greetPet(pet.nickname);
////        int catAge = pet.getAge();
////        int slyLevel = pet.getTrickLevel();
////        pet.describePet(slyLevel,sp,catAge);
////
////
////        System.out.println(sp);
//
//        //describePet(5,"dog",30)
//
//
////        String nm = mother.getName();
////        System.out.println(mother+"\n"+father + " \n"+child);
////        Pet fPet = new Pet();
////        Pet mPet = new Pet("birds","Kuly",1,47, new String[]{"eat", "drink", "sleep"});
////
////
////        Human father = new Human("Rafig", "Garayev",1960,fPet);
////        Human mother = new Human("Malahat", "Garayev",1962,mPet);
////        Pet childPet = new Pet("cat","Barni",5,70, new String[]{"eat", "drink", "sleep"});
//
//             //   childPet,mother,father,sc);
//        //,);
//        //In the Main class create several families, so that every class uses all the available constructors. Display data about every person.
//
////        String nc = childPet.getNickname();
////        //System.out.println(nc);
////        child.greetPet(nc);
////
////        System.out.println(childPet);
//    }

    public static class FamilyBuilder {
        private hw5.Human mother;
        private hw5.Human father;
        private hw5.Human[] children;
        private hw5.Pet pet;
        private ArrayList<hw5.Human> children0;

        public FamilyBuilder setMother(hw5.Human mother) {
            this.mother = mother;
            return this;
        }

        public FamilyBuilder setFather(hw5.Human father) {
            this.father = father;
            return this;
        }

        public FamilyBuilder setChildren(hw5.Human[] children) {
            this.children = children;
            return this;
        }

        public FamilyBuilder setPet(Pet pet) {
            this.pet = pet;
            return this;
        }

        public FamilyBuilder setChildren0(ArrayList<Human> children0) {
            this.children0 = children0;
            return this;
        }

        public Family createFamily() {
            return new Family(mother, father, children);
        }
    }
}
