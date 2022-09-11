package hw13_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao {
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
    public Family createNewFamily(Human h1, Human h2) {
        return new Family(h1,h2, new Human[]{});
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
    public boolean deleteAllChildrenOlderThen(int age,  Family family) {
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

           family.deleteChild((Human)nwChild.get(i));
            System.out.println(i);
        }
        return true;// Arrays.stream(family.getChildren()).toList();
        }

    @Override
    public Family bornChild(Family dfm, String gender) {
       // Family fm = new  Family(dfm.mother,dfm.father, new  Human[]{});
        List<String> girls = List.of(new String[]{"Camila", "Turana", "Ulviyye"});
        List<String> boys = List.of(new String[]{"Jamal", "Turan", "Ulvi"});
        if (gender.equalsIgnoreCase("girl")){
              Human child = new Human(girls.get(0));
            dfm.addChild(child,"girl");
        }
        else if(gender.equalsIgnoreCase("boy")){
              Human child = new Human(boys.get(0));
            dfm.addChild(child,"boy");
        }
        //else {fm = fm ; }
        return dfm;
    }

    @Override
    public boolean deleteFamily(int index) {
        if (index < ls_family.size()){
            ls_family.remove(ls_family.get(index));
            return true;
        } else return false;
    }

    @Override
    public boolean deleteFamilyByIndex(int ind_family) {
        // List<Family>del_ls_fm = new ArrayList<Family>();

        if(!getAllFamilies().stream().toList().isEmpty() && getAllFamilies().stream().toList().size()>ind_family){
            deleteFamily(ind_family) ;
            return true;
        }
        return false;
    }
    String gender = "";
    @Override
    public Family adoptChild(Family fm, Human child) {
        fm.addChild(child,"boy");
        return fm;
    }


}
