package HW11;
import java.util.Arrays;
import java.util.Set;

public class Family {
  Human mother;
  Human father;
  Human[] children=new Human[]{};//1
  Set<Pet> pet;

  public Family(Human mother, Human father, Human[] children) { //
    this.mother = mother;
    this.father = father;
    this.children = children;
  }

  public Family(Human mother, Human father, Human[] children, Set<Pet> pet) { //
    this.mother = mother;
    this.father = father;
    this.children = children;
    this.pet = pet;
  }

  public Family(Human mother, Human father, Set<Pet>pet) { //
    this.mother = mother;
    this.father = father;
    this.pet = pet;
  }

  public Family(Human mother, Human father) { //
    this.mother = mother;
    this.father = father;
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

  public boolean deleteChild(Human child1){
    Human[] arr = this.children;
    if (arr == null ||  this.children.length < 0 || this.children.length > arr.length){
      return false;
    }
    Human[] anotherArray = new Human[arr.length - 1];

    for (int i = 0, k = 0; i < anotherArray.length; i++) {
      if (arr.hashCode()== child1.hashCode()) {
        System.out.println("sucsess");
        continue;
      }
      anotherArray[k++] = arr[i];
    }
    this.children = anotherArray;
    return true;
  }
}
