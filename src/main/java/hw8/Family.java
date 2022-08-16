package hw8;


import java.util.*;

public class Family {
  Human mother;
  Human father;
  List<Human>child;
  Set<Pet> pet;

  public Family(Human mother, Human father,List<Human> child,Set<Pet> pet) { //
    this.mother = mother;
    this.father = father;
    this.child = child;
    this.pet = pet;
  }

  @Override
  public String toString() {
    return "Family{" +
            "mother=" + mother + "\n"+
            ", father=" + father + "\n"+
            ", children=" + Arrays.toString(child.toArray())+ "\n"+
            ", pet=" + pet + "\n"+
            "} " ;//+ super.toString();
  }
}
