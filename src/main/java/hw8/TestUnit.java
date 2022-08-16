package hw8;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class TestUnit {
    Map<String, String> sch = new HashMap<>();
    String [] workList ={"w1","w2","w3","w4","w5","w6","w7"};
    String [] DayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    Human mother = new Human("Malahat", "Garayeva",1962,sch);
    Human father = new Human("Rafig", "Garayev",1960,sch);
    Human child1 = new Human("Camila", "Garayeva",1993,sch);
    Human child2 = new Human("Ulviyya", "Garayeva",1990,sch);
    //Human child3 = new Human("Turana", "Garayeva",1989,sch);
    List<Human> child = new ArrayList<>();
    Set<String> habits  = new HashSet<>();
    Set<Pet> pet = new HashSet<>();
    Pet pt = new Pet(Pet.Species.dog,"Maestro",1,30,habits);
    Pet pt2 = new Pet(Pet.Species.cat,"Barni",2,70,habits);
    Family fm = new Family(father,mother,child,pet);

    @Test
        public void firstTest() {
            for (int i = 0; i < DayOfWeek.length; i++) {
                sch.put(DayOfWeek[i],workList[i]);
            }

        pet.add(pt);
        pet.add(pt2);
        habits.add("eat");
        habits.add("drink");
        habits.add("sleep");
        child.add(child1);
        child.add(child2);
        System.out.println(fm);
        Assert.assertTrue(true);
        }
}
