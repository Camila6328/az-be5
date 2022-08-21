package HW9;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class RunObjectstestUnit {
        Human mother = new Human("Malahat", "Garayeva", 1962);
        Human father = new Human("Rafig", "Garayev", 1960);
        Human mother1 = new Human("Sona", "Zamanli", 1962);
        Human father1 = new Human("Roman", "Zamanli", 1960);
        Human mother2 = new Human("Samir", "Zamanli", 1962);
        Human father2 = new Human("Mamam", "Zamanli", 1960);
        Human child1 = new Human("Camila", "Garayeva", 1993);
        Human child2 = new Human("Ulviyya", "Garayeva", 1990);
        Human child3 = new Human("Turana", "Garayeva", 1989);
        List<Family>ls_fm = new ArrayList<>();
        Family fm = new Family(mother, father, new Human[]{});
        Set<Pet> pet = new HashSet<>();
        Set<String> habits = new HashSet<>();
        Pet pt = new Pet(Pet.Species.dog, "Maestro", 1, 30, habits);
        Pet pt2 = new Pet(Pet.Species.cat, "Barni", 2, 70, habits);
        Set<Pet> pet2 = new HashSet<>();
        //System.out.println(pet);
        Family fm1 = new Family(mother1, father1,new Human[]{},pet);
        Family fm2 = new Family(father2,mother2,new Human[]{},pet2);
        @Test
        public void test(){
                        fm.addChild(child1);
                        fm.addChild(child2);
                        fm.addChild(child3);
                        pet.add(pt);
                        pet2.add(pt2);
                        habits.add("eat");
                        habits.add("drink");
                        habits.add("sleep");
                        ls_fm.add(fm);
                        ls_fm.add(fm1);
                        ls_fm.add(fm2);
          FamilyController s = new FamilyController();
//        Family fm1 = new Family(mother1, father1,new Human[]{},);
//        System.out.println(s.getAllFamilies(ls_fm));
//        System.out.println(s.getFamilyByIndex(2,s.getAllFamilies(ls_fm)));
//        System.out.println(s.deleteFamily(2,s.getAllFamilies(ls_fm)));
//        System.out.println(s.deleteFamily(fm2,s.getAllFamilies(ls_fm)));
//        System.out.println(s.saveFamily(fm2,s.getAllFamilies(ls_fm)));
//        System.out.println(s.getAllFamilies(ls_fm));
//        System.out.println(s.displayAllFamilies(ls_fm));
//        System.out.println(s.getFamiliesBiggerThan(ls_fm,5));
//        System.out.println(s.getFamiliesLessThan(ls_fm,5));
//        System.out.println(s.countFamiliesWithMemberNumber(ls_fm));
//        System.out.println(s.createNewFamily(mother,father));
//        System.out.println(s.deleteFamilyByIndex(2,ls_fm));
//        System.out.println(s.bornChild(fm,"BOY"));
//        System.out.println(s.adoptChild(fm,child3));
//        System.out.println(s.count(ls_fm));
//        System.out.println(ls_fm);
//        System.out.println(s.getFamilyById(0,ls_fm));
//        System.out.println(fm.children.length);
//        System.out.println(s.getAllFamilies(ls_fm));
          System.out.println(s.getPets(1,ls_fm));
          System.out.println(s.addPet(2,pt2,ls_fm));
          Assert.assertTrue(true);

    }

}
