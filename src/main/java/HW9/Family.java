package HW9;

import java.util.*;

public class Family {
  Human mother;
  Human father;
  Human[] children=new Human[]{};//1
  Set<Pet> pet;

  public Family(Human mother, Human father,Human[] children,Set<Pet> pet) { //
    this.mother = mother;
    this.father = father;
    this.children = children;
    this.pet = pet;
  }

  public Family(Human mother, Human father,Set<Pet>pet) { //
    this.mother = mother;
    this.father = father;
    this.pet = pet;
  }

  public Family(Human mother, Human father) { //
    this.mother = mother;
    this.father = father;
  }

  public Family(Human mother, Human father,Human[] children) { //
    this.mother = mother;
    this.father = father;
    this.children = children;
  }

    @Override
  public String toString() {
    return "Family{" +
            "mother=" + mother + "\n"+
            ", father=" + father + "\n"+
            ", children=" + Arrays.toString(children) + "\n"+
            ", pet=" + pet + "\n"+
            "} " ;//+ super.toString();
  }

  public int getFamilySize(){
    int count;
    if (children.length != 0) { count = children.length;}
      else{ count = 0; }
    return 2 + count;
  }
  public void addChild(Human child){
         Human[] a =this.children;
    this.children = new Human[this.children.length+1];
    System.arraycopy(a, 0, this.children, 0, a.length);
    this.children[a.length] = child;
  }

  public Human[] getChildren() {
    return children;
  }

  public void setChildren(Human[] children) {
    this.children = children;
  }
}
