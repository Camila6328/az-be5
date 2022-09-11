package HW12_1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static String gBoy = "boy";
    public static String gGirl = "girl";

    public static void main(String[] args) throws FamilyOverflowException {
        List<Family> ls_fm = new ArrayList<>();
        Map<String, String> matSch = new HashMap<>();
        Map<String, String> fatSch = new HashMap<>();
        Map<String, String> chSch = new HashMap<>();
        String[] workList = {"w1", "w2", "w3", "w4", "w5", "w6", "w7"};
        String[] DayOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        matSch.put(DayOfWeek[1], workList[1]);
        matSch.put(DayOfWeek[2], workList[2]);
        fatSch.put(DayOfWeek[1], workList[4]);
        fatSch.put(DayOfWeek[2], workList[5]);
        chSch.put(DayOfWeek[5], workList[3]);
        Human mother = new Human("Malahat", "Garayeva", 70, matSch);
        Human father = new Human("Rafig", "Garayev", 80, fatSch);
        Human child1 = new Human("Camila", "Garayeva", 45);
        Human child2 = new Human("Ulvi", "Garayev", 90, chSch);
        Human child3 = new Human("Turan", "Garayev", 89);
        Set<String> cathabits = new HashSet<>();
        Set<String> doghabits = new HashSet<>();
        Set<Pet> pet = new HashSet<>();
        doghabits.add("eat");
        doghabits.add("drink");
        cathabits.add("sleep");
        cathabits.add("eat");
        Pet pt = new Pet(Pet.Species.dog, "Maestro", 1, 30, doghabits);
        Pet pt2 = new Pet(Pet.Species.cat, "Barni", 2, 70, cathabits);
        Family fm = new Family(mother, father, new Human[]{}, pet);
        fm.addChild(child1, gBoy);
        fm.addChild(child3, gGirl);
        fm.addChild(child2, gBoy);
        pet.add(pt);
        pet.add(pt2);
       // System.out.println(fm);

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Human father2 = new Human("Roman", "Zamanli", 1577094336);
        Human mother2 = new Human("Rahila", "Zamanli", "02/04/2022", 44);

        FamilyService fs = new FamilyService();
        Scanner sc = new Scanner(System.in);
        Family fm2 = fs.createNewFamily(father2, mother2);
        Family fm3 = new Family(mother, father, new Human[]{});
        fs.ls_family.add(fm);

        Iterator<Family> it = fs.getAllFamilies().iterator();
        for(int i=1; it.hasNext(); i++) {
            System.out.println(i + " Family:    " + it.next().toString());
        }
        try {
            System.out.print("Enter a number to get families number of members bigger than that number: ");
            Collection<Family> f1 = fs.getFamiliesBiggerThan(sc.nextInt());
            Iterator<Family> iter1 = f1.iterator();
            for(int i=1; iter1.hasNext(); i++) {
                System.out.println(i + " Family:    " + iter1.next());
            }
        } catch (Exception ex) {
            System.err.println("No familes found");
        }
        try {
            System.out.print("Enter a number to get families having number of members less than that number: ");
            Collection<Family> f2 = fs.getFamiliesLessThan(sc.nextInt());
            Iterator<Family> iter2 = f2.iterator();
            for(int i=1; iter2.hasNext(); i++) {
                System.out.println(i + " Family:    " + iter2.next());
            }
        } catch (Exception ex) {
            System.err.println("No familes found");
        }
//        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.print("Enter a number to get families having number of members equals that number: ");
        int member_cnt = sc.nextInt();
        List<Family> fmm = fs.getAllFamilies().stream()
                .filter(s-> Arrays.stream(s.getChildren()).toList().size()+2==member_cnt)
                .collect(Collectors.toList());
        Iterator<Family> iter3 = fmm.iterator();
        for(int i=1; iter3.hasNext(); i++) {
            System.out.println(i + " Family:    " + iter3.next());
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Human father3 = new Human();
        System.out.print("father name: ");
        father3.setName(sc.nextLine());
        System.out.print("father surname: ");
        father3.setSurname(sc.nextLine());
        System.out.print("father task: ");
        Map<String, String> fsch = new HashMap<>();
        fsch.put(DayOfWeek[1],  sc.nextLine());
        father3.setSchedule(fsch);
        System.out.println(father3.getSchedule().toString());
        System.out.print("father IQ: ");
        father3.setIq(sc.nextInt());
        System.out.print("father bday: ");
        Scanner scLong = new Scanner(System.in);
        father3.setBirthDate(scLong.nextLong());
        father3.setSchedule(new HashMap<>());

        Human mother3 = new Human();

        System.out.print("mother name: ");
        mother3.setName(sc.nextLine());
        System.out.print("mother surname: ");
        mother3.setSurname(sc.nextLine());
        System.out.print("mother task: ");
        mother3.getSchedule().put(DayOfWeek[4], sc.nextLine());
        System.out.print("mother IQ: ");
        mother3.setIq(sc.nextInt());
        System.out.print("mother bday: ");
        mother3.setBirthDate(scLong.nextLong());
        mother3.setSchedule(new HashMap<>());

        fs.createNewFamily(father, mother);
        Family family3 = fs.getAllFamilies().get(0);
        family3.setFather(father);
        family3.setMother(mother);
        family3.setChildren(family3.getChildren());
        family3.setPet(new HashSet<>());
        System.out.println(family3);
       // System.out.println(family3.prettyFormat());
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("delete family by its position: ");
        int deleted = sc.nextInt();
        System.out.print("Delete family in position: ");
        fs.deleteFamilyByIndex(deleted);
        System.out.println(fs.getAllFamilies());

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //FamilyOverflowException foe = new FamilyOverflowException("Error");
        Human adopted = new Human();
        adopted.setName("adopted");
        adopted.setSurname("adopted");
        adopted.setIq(60);
        adopted.setSchedule(new HashMap<>());
        adopted.getSchedule().put(DayOfWeek[1], workList[0]);
        fs.adoptChild(fm3,adopted);
        fs.adoptChild(fm3,adopted);
        fs.adoptChild(fm3,adopted);
        fs.ls_family.add(fm3);
        int limit = sc.nextInt();
        System.out.println(fs.getAllFamilies());
        int cnt2 = fm.getChildren().length + 2;
        if (cnt2 > limit) throw new FamilyOverflowException("Error");
    }
}




