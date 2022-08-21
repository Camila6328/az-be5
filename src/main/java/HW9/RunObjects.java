package HW9;

import java.util.ArrayList;
import java.util.List;

public class RunObjects {
    public static void main(String[] args) {
        Human mother = new Human("Malahat", "Garayeva",1962);
        Human father = new Human("Rafig", "Garayev",1960);

        Human mother1 = new Human("Sona", "Zamanli",1962);
        Human father1 = new Human("Roman", "Zamanli",1960);

        Human mother2 = new Human("Samir", "Zamanli",1962);
        Human father2 = new Human("Mamam", "Zamanli",1960);

        Human child1 = new Human("Camila", "Garayeva",1993);
        Human child2 = new Human("Ulviyya", "Garayeva",1990);
        Human child3 = new Human("Turana", "Garayeva",1989);
      //  CollectionFamilyDao cf = new CollectionFamilyDao();
        List<Family> ls_fm= new ArrayList<>();
        CollectionFamilyDao s = new CollectionFamilyDao();
        Family fm = new Family(mother,father, new Human[]{});
        fm.addChild(child3);
       // System.out.println(fm);
        fm.addChild(child2);
        fm.addChild(child1);
        Family fm1 = new Family(mother1,father1);
        Family fm2 = new Family(mother2,father2);
        ls_fm.add(fm);
        ls_fm.add(fm1);
        ls_fm.add(fm2);

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
//          System.out.println(ls_fm);
//          System.out.println(s.getFamilyById(0,ls_fm));
//        System.out.println(fm.children.length);
        System.out.println(s.getAllFamilies(ls_fm));


    }

}
