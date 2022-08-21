package HW9;

import java.util.*;
public class CollectionFamilyDao implements FamilyDao {
    //List<Family> ls_family = new List<Family>
    //getAllFamilies - returns an indexed list of all families (List).
    @Override
    public List getAllFamilies(List<Family> ls_fm) {
        return ls_fm;
    }
    //getFamilyByIndex (accepts the family index from general list) - returns the family by the specified index. In case you have requested an element with a non-existent index, return null.
    @Override
    public Family getFamilyByIndex(int i_ls_fm, List<Family> ls_fm) {
        return ls_fm.get(i_ls_fm);
    }
    //deleteFamily (accepts the index) - deletes family with a specified index, if such an index exists;
    // returns true if the removal took place, false - if not.
    @Override
    public boolean deleteFamily(int i_ls_fm, List<Family> ls_fm) {
        if (i_ls_fm >= ls_fm.size()) {
            return false;
        } else {
            ls_fm.remove(i_ls_fm);
            return true;
        }
    }
    //deleteFamily (takes on the Family type) - deletes a family if one exists on the list; returns true if the removal took place, false - if not.
    @Override
    public boolean deleteFamily(Family fm, List<Family> ls_fm) {
        return ls_fm.contains(fm);
    }
    ///saveFamily (accepts the Family type) - updates an existing family in Database if if that one already exists, saves at the end of the list - if not.
    @Override
    public boolean saveFamily(Family fm, List<Family> ls_fm) {
        if (ls_fm.contains(fm)) {
            Family fm1 = ls_fm.get(ls_fm.indexOf(fm));
            // fm1 = fm;
            return true;
        } else return false;
    }
    //displayAllFamilies - to put all the families on the screen (in the indexed list) with all the family members.
    @Override
    public List displayAllFamilies(List<Family> ls_fm) {
        return ls_fm;
    }
    @Override
    public boolean countFamiliesWithMemberNumber(List<Family> ls_fm) {
            for (Family fm : ls_fm) {
                if (ls_fm.size() == fm.children.length) {return true;}
                }
            return false;
    }
    //getFamiliesBiggerThan - to find family with number of people more than (takes the number of people and returns all families where the number of people is greater than specified);displays the information on the screen.
    @Override
    public List<Family> getFamiliesLessThan(List<Family> ls_fm, int cnt) {
        int l_sz;
        List<Family>less_fm = new ArrayList<>();
        for (Family fm : ls_fm) {
            l_sz=fm.getFamilySize();
            if (l_sz < cnt) {less_fm.add(fm);}
        }
        return less_fm;
    }
    @Override
    public List<Family>  getFamiliesBiggerThan(List<Family> ls_fm, int cnt) {
        int b_sz;
        List<Family> big_fm = new ArrayList<>();
        for (Family fm : ls_fm) {
            b_sz=fm.getFamilySize();
            if ( b_sz > cnt) {
                big_fm.add(fm);}
        }
        return big_fm;
//        for (Family fm:ls_fm) {
//          fm_size.add(fm.getFamilySize());
//        }
//        return (int) Collections.max(fm_size);
//countFamiliesWithMemberNumber - to calculate the number of families with
// the number of people equal to the number of transfered people.
    }
    @Override
    public Family createNewFamily(Human h1, Human h2) {
        return new Family(h1,h2, new Human[]{});
    }
    @Override
    public boolean deleteFamilyByIndex(int ind_family,List<Family>ls_fm) {
       // List<Family>del_ls_fm = new ArrayList<Family>();
        if(!ls_fm.isEmpty() && ls_fm.size()>ind_family){
            ls_fm.remove(ind_family);
        return true;
        }
        return false;
    }
    @Override
    public Family bornChild(Family dfm, String gender) {
        Family fm = new Family(dfm.mother,dfm.father, new Human[]{});
        List<String> girls = List.of(new String[]{"Camila", "Turana", "Ulviyye"});
        List<String> boys = List.of(new String[]{"Jamal", "Turan", "Ulvi"});
        if (gender.equalsIgnoreCase("girl")){
            Human child = new Human(girls.get(0));
            fm.addChild(child);
        }
        else if(gender.equalsIgnoreCase("boy")){
            Human child = new Human(boys.get(0));
            fm.addChild(child);
        }
        //else {fm = fm ; }
        return fm;
    }
    @Override
    public Family adoptChild(Family fm, Human child) {
        Family nfm = new Family(fm.mother,fm.father, new Human[]{});
        nfm.addChild(child);
        return nfm;
    }
    @Override
    public int count(List<Family> ls_fm) {
        return  ls_fm.size();
    }
    @Override
    public Map getFamilyById(int fm_index, List<Family>ls_fm) {
        Map<Integer,Family> maap_fm = new HashMap<>();
        return (Map) maap_fm.put(fm_index,ls_fm.get(fm_index));}

    @Override
    public List<Pet> getPets(int fm_index, List<Family> ls_fm) {
        return ls_fm.get(fm_index).pet.stream().toList();
    }
    @Override
    public Family addPet(int fm_index,Pet pet, List<Family>ls_fm) {
        Set<Pet>pets= new HashSet<>();
        Family nfm = new Family(ls_fm.get(fm_index).mother,ls_fm.get(fm_index).father,ls_fm.get(fm_index).pet);
        pets.add(pet);
        return nfm;
    }
}