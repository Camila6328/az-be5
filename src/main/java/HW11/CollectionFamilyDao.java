package HW11;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao{
    List<Family> ls_family ;

    public CollectionFamilyDao() {
        ls_family = new ArrayList<Family>();
//        Family f1 = new Family(new Human("Allahverdi","Hajiyev"),
//                    new Human("Allahverdi","Hajiyev"));
//        Family f2 = new Family(new Human("Hajiyev","Allahverdi"),new Human("Hajiyev","Allahverdi"));
//        ls_family.add(f1);
//        ls_family.add(f2);
    }
    @Override
    public List<Family> getAllFamilies() {
        return ls_family;
    }
    @Override
    public String displayAllFamilies() {
         return Arrays.toString(getAllFamilies().toArray());
    }

    //getFamiliesBiggerThan(int count);
    @Override
    public List<Family> getFamiliesBiggerThan(int cnt) {
        return getAllFamilies().stream().filter(f->f.getFamilySize()>cnt).toList();
    }

    @Override
    public List<Family> getFamiliesLessThan(int cnt) {
        return getAllFamilies().stream().filter(f->f.getFamilySize()<cnt).toList();
    }

    @Override
    public boolean countFamiliesWithMemberNumber() {
        return ls_family.stream()
                .filter(f->f.children.length==2)
                .findAny().isPresent();
    }

    @Override
    public boolean deleteAllChildrenOlderThen(int age, Family family) {
        List nwChild = null;
        List allChild = null;
        List<Family> nwFamily;
        nwFamily = getAllFamilies().stream().filter(f -> f.getFamilySize()>2)
                .toList().stream().collect(Collectors.toList());
        int sn = family.getFamilySize()-2;
        System.out.println(sn);
        for (int i = 0; i < sn-1; i++) {

            allChild = Arrays.stream(nwFamily.stream().collect(Collectors.toList()).get(i).getChildren())
                    .collect(Collectors.toList());
            nwChild = Arrays.stream(nwFamily.stream().collect(Collectors.toList()).get(i).getChildren())
                    .filter(c -> c.getAge(c.getBirthDate()) > age).collect(Collectors.toList());

//            allChild.remove(nwChild.get(i));
//            nwFamily.get(i).deleteChild((Human) allChild.get(i));
//            nwFamily.get(i).addChild((Human) nwChild.get(i));
          // family.deleteChild((Human)nwChild.get(i+1));
           family.deleteChild((Human)nwChild.get(i));
            System.out.println(i);
           // System.out.println(nwChild.get(1));
        }
        return true;// Arrays.stream(family.getChildren()).toList();
        }
       //

                //.filter(fm->fm.children.



}
