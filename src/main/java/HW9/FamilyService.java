package HW9;

import java.util.List;

public class FamilyService {
    FamilyDao fd = new CollectionFamilyDao() {};
    //Create FamilyService class, which should contain the FamilyDao field to access stored data.
    //+getAllFamilies - to get a list of all the families.


    //createNewFamily - create a new family ( takes two parameters of Human type) - create a new family, saves in database.
    //deleteFamilyByIndex - to delete a family by its index in the list - deletes the family fron database.
    //bornChild - to give a birth to a child's family (takes Family and two String types: masculine and feminine) - a new child is born in the given family taking into account the parents' data, the information about the family is updated in the database; the method returns the renewed family. If the child is born a boy, it is given a male name, if the girl is female.
    //adoptChild - to adopt child (takes two types: Family, Human)- the child is kept in the given family, the information about the family is updated in the database; the method returns the renewed family.
    //deleteAllChildrenOlderThen - to delete all children older than (takes int) - in all families, children over the specified age are removed and the information is updated in the database.
    //count - returns the number of families in the database.
    //getFamilyById - takes the family index, returns Family as specified index.
    //getPets - takes the family index, returns the list of pets that live in the family.
    //addPet - takes family index and Pet parameter - adds a new pet to the family, updates the data in the database.
}
