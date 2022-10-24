package HW12;

public class Main {

    public static void main(String[] args) {
        FamilyController s = new FamilyController();
        Human mother = new Human("Malahat", "Garayeva", 1962);
        Human father = new Human("Rafig", "Garayev", 1960);
        Family fm = new Family(mother, father, new Human[]{});
        Human child1 = new Human("Camila", "Garayeva");
        child1.setBirthDate(1577094336);
        Human child2 = new Human("Ulviyya", "Garayeva", 1577094336);
        Human child3 = new Human("Turana", "Garayeva");
        child3.setBirthDate(1597094336);
        Human father2 = new Human("Roman", "Zamanli", 1577094336);
        Human mother2 = new Human("Rahila", "Zamanli", "02/04/2022", 44);
        Family fm2 = new Family(mother2, father2, new Human[]{});
//        fm2.addChild(child1);
//        fm2.addChild(child3);
        s.ls_family.add(fm2);
        // s.ls_family.add(fm);

        //   Family fm1 = new Family(mother1, father1,new Human[]{});
//        System.out.println(s.getAllFamilies());
//        System.out.println(s.displayAllFamilies());
//        System.out.println(child1.getAge(child1.getBirthDate()));
//        System.out.println(child3.getAge(child3.getBirthDate()));
//        System.out.println(s.displayAllFamilies());
//        System.out.println(s.getFamiliesBiggerThan(1));
//        System.out.println(s.getFamiliesLessThan(3));
//        System.out.println(s.countFamiliesWithMemberNumber());
//        System.out.println(s.deleteAllChildrenOlderThen(2,fm2));
        System.out.println(fm2);
        s.bornChild(fm2,"BOY");
        s.bornChild(fm2,"GIRL");
        System.out.println(fm2);
      //  System.out.println(fm2.toString());
     //   System.out.println(s.displayAllFamilies());
    }
}
