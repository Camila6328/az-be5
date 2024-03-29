package HW11;
import java.util.List;

public interface FamilyDao {
    //getAllFamilies - returns an indexed list of all families (List).
    List<Family> getAllFamilies();
    //getFamilyByIndex (accepts the family index from general list) - returns the family by the specified index. In case you have requested an element with a non-existent index, return null.
//    Family getFamilyByIndex(int i_ls_fm,List<Family> ls_fm);
//    //deleteFamily (accepts the index) - deletes family with a specified index, if such an index exists;
//    // returns true if the removal took place, false - if not.
//    boolean deleteFamily(int i_ls_fm,List<Family> ls_fm);
//    //deleteFamily (takes on the Family type) - deletes a family if one exists on the list; returns true if the removal took place, false - if not.
//    boolean deleteFamily(Family fm,List<Family> ls_fm);
//    //saveFamily (accepts the Family type) - updates an existing family in Database if if that one already exists,
//    saves at the end of the list - if not.
//    boolean saveFamily(Family fm,List<Family> ls_fm);
//    //displayAllFamilies - to put all the families on the screen (in the indexed list) with all the family members.
    String displayAllFamilies();
//    //getFamiliesBiggerThan - to find family with number of people more than (takes the number of people and returns all families where the number of people is greater than specified);displays the information on the screen.
    List<Family> getFamiliesBiggerThan(int cnt);
//    //getFamiliesLessThan - to find family with number of people less than (takes the number of people and returns all families where the number of people is less than specified); выводит информацию на экран.
    List<Family> getFamiliesLessThan(int cnt);
//    //countFamiliesWithMemberNumber - to calculate the number of families with the number of people equal to the number of transfered people.
      boolean countFamiliesWithMemberNumber();
//    // createNewFamily - create a new family ( takes two parameters of Human type) - create a new family, saves in database.
//    Family createNewFamily(Human h1, Human h2);
//    //deleteFamilyByIndex - to delete a family by its index in the list - deletes the family from database.
//    boolean deleteFamilyByIndex(int ind_family,List<Family>ls_fm);
//    // bornChild - to give a birth to a child's family (takes Family and two String types: masculine and feminine) - a new child is born in the given family taking into account the parents' data, the information about the family is updated in the database; the method returns the renewed family. If the child is born a boy, it is given a male name, if the girl is female.
//    Family bornChild (Family fm,String gender);
//    // adoptChild - to adopt child (takes two types: Family, Human)- the child is kept in the given family, the information about the family is updated in the database; the method returns the renewed family.
//    Family adoptChild (Family fm,Human child);
boolean deleteAllChildrenOlderThen(int age, Family family);
    //deleteAllChildrenOlderThen - to delete all children older than (takes int) - in all families, children over the specified age are removed and the information is updated in the database.
//    //count - returns the number of families in the database.
//    int count(List<Family>ls_fm);
//    //getFamilyById - takes the family index, returns Family as specified index.
//    Map getFamilyById(int fm_index, List<Family>ls_fm);
//    //getPets - takes the family index, returns the list of pets that live in the family.
//    List<Pet> getPets(int fm_index, List<Family>ls_fm);
//    //addPet - takes family index and Pet parameter - adds a new pet to the family, updates the data in the database.
//    Family addPet(int fm_index, Pet pet, List<Family>ls_fm);

}

