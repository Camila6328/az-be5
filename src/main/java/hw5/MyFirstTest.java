package hw5;

import lesson12.BracketsV4;
import org.junit.Assert;
import org.junit.Test;
public class MyFirstTest {
    String[][] sc = new String[][]{{Human.DayOfWeek.Sunday.name(),"w1"}, {Human.DayOfWeek.Monday.name(),"w2"},
            {Human.DayOfWeek.Tuesday.name(),"w3"},{Human.DayOfWeek.Wednesday.name(),"w4"},
            {Human.DayOfWeek.Thursday.name(),"w5"},{Human.DayOfWeek.Friday.name(),"w6"},{Human.DayOfWeek.Saturday.name(),"w7"}};
    Human mother = new Human("Malahat", "Garayeva",1962,64,sc);
    Human father = new Human("Rafig", "Garayeva",1960,70,sc);
    Human child1 = new Human("Camila", "Garayeva",1993, 60,sc);
    Human child2 = new Human("Ulviyya", "Garayeva",1990, 60,sc);
    Human child3 = new Human("Turana", "Garayeva",1989,45,sc);
    Pet pet = new Pet(Pet.Species.dog,"Maestro",1,30, new String[]{"eat", "drink", "sleep"});

    Family fm = new Family(father,mother);

        @Test
        public void firstTest() {
            fm.finalize();
            pet.finalize();
            fm.addChild(child3);
            fm.addChild(child2);
            fm.addChild(child1);
            System.out.println(fm);
            fm.deleteChild(1);
            System.out.println(fm);
            fm.deleteChild(child1);
            System.out.println(fm);
            int c = fm.countFamily();
            System.out.println("count of Family members = " + c);
            Human h =new Human("Malahat", "Garayeva",1962,64,sc);
            for (int i = 1000; i< 10000 ; i++) {
                String name = h.getName();
                //   System.out.println(name);
            }
        //    h.finalize();
            Assert.assertTrue(fm.equals(fm));

        }
}
