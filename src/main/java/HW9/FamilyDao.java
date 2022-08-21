package HW9;
import java.util.List;
import java.util.Map;

public interface FamilyDao {
    //getAllFamilies - returns an indexed list of all families (List).
    List getAllFamilies(List<Family>ls_fm);
    //getFamilyByIndex (accepts the family index from general list) - returns the family by the specified index. In case you have requested an element with a non-existent index, return null.
    Family getFamilyByIndex(int i_ls_fm,List<Family> ls_fm);
    //deleteFamily (accepts the index) - deletes family with a specified index, if such an index exists;
    // returns true if the removal took place, false - if not.
    boolean deleteFamily(int i_ls_fm,List<Family> ls_fm);
    //deleteFamily (takes on the Family type) - deletes a family if one exists on the list; returns true if the removal took place, false - if not.
    boolean deleteFamily(Family fm,List<Family> ls_fm);
    //saveFamily (accepts the Family type) - updates an existing family in Database if if that one already exists, saves at the end of the list - if not.
    boolean saveFamily(Family fm,List<Family> ls_fm);

    //displayAllFamilies - to put all the families on the screen (in the indexed list) with all the family members.
    List displayAllFamilies(List<Family>ls_fm);

    //getFamiliesBiggerThan - to find family with number of people
    // more than (takes the number of people and returns all families where the number of people is greater than specified);
    // displays the information on the screen.
    List<Family> getFamiliesBiggerThan(List<Family>ls_fm, int cnt);
    //getFamiliesLessThan - to find family with number of people less than (takes the number of people and returns all families where the number of people is less than specified); выводит информацию на экран.
    List<Family> getFamiliesLessThan(List<Family>ls_fm, int cnt);

    //countFamiliesWithMemberNumber - to calculate the number of families with the number of people equal to the number
    // of transfered people.
    boolean countFamiliesWithMemberNumber(List<Family>ls_fm);
    // createNewFamily - create a new family ( takes two parameters of Human type) - create a new family, saves in database.
    Family createNewFamily(Human h1,Human h2);
    //deleteFamilyByIndex - to delete a family by its index in the list - deletes the family from database.
    boolean deleteFamilyByIndex(int ind_family,List<Family>ls_fm);

    // bornChild - to give a birth to a child's family (takes Family and two String types: masculine and feminine) - a new child is born in the given family taking into account the parents' data, the information about the family is updated in the database; the method returns the renewed family. If the child is born a boy, it is given a male name, if the girl is female.
    Family bornChild (Family fm,String gender);
    // adoptChild - to adopt child (takes two types: Family, Human)- the child is kept in the given family, the information about the family is updated in the database; the method returns the renewed family.
    Family adoptChild (Family fm,Human child);
    //count - returns the number of families in the database.
    int count(List<Family>ls_fm);
    //getFamilyById - takes the family index, returns Family as specified index.
    Map getFamilyById(int fm_index, List<Family>ls_fm);

}

