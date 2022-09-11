package HW12_1;
import java.util.*;
public class Family {
  Human mother;
  Human father;
  Human[] children=new Human[]{};//1
  Set<Pet> pet;

  public Family( Human mother, Human father, Human[] children) { //
    this.mother = mother;
    this.father = father;
    this.children = children;
  }
  public Family( Human mother, Human father, Human[] children, Set< Pet> pet) { //
    this.mother = mother;
    this.father = father;
    this.children = children;
    this.pet = pet;
  }
  public Family( Human mother, Human father, Set<Pet>pet) { //
    this.mother = mother;
    this.father = father;
    this.pet = pet;
  }

  public Family( Human mother, Human father) { //
    this.mother = mother;
    this.father = father;
  }
public String toChildFormat() {
  ArrayList<Human> lst = new ArrayList<>();
  for (int i = 0; i < children.length; i++) {
    lst.add(children[i]);
  }
  Iterator<Human> iter = lst.iterator();
  if (iter.hasNext()) {
    return  Main.gGirl + ": " + iter.next().toString() + '\n'+
            "           " + Main.gBoy + ": " +iter.next().toString() + '\n' +
            "           " + Main.gBoy + ": " +iter.next().toString();

  } else {
    return "[]";
  }
}

public String prettyFormat() {
  String s = " ";
      return   "family : " + "\n"+
              "   mother : " + mother + "," + "\n"+
              "   father : " + father + "," + "\n"+
              "   children : " + "\n" +
              "           " +  toChildFormat()+ "\n"+
              "   pets : " + pet + "\n"+
              "} "  ;

//  family:
//  mother: {name='Kate', surname='Bibo', birthDate='03/03/1991', iq=95, schedule={FRIDAY=fitness, MONDAY=fitness}},
//  father: {name='Karl', surname='Bibo', birthDate='10/12/1990', iq=90, schedule={FRIDAY=library, MONDAY=library}},
//  children:
//  boy: {name='Donna', surname='Bibo', birthDate='23/10/2018', iq=92, schedule=null}
//  girl: {name='Sun', surname='Bibo', birthDate='23/10/2018', iq=92, schedule=null}
//  boy: {name='Kurt', surname='Kobein', birthDate='05/05/2003', iq=85, schedule={FRIDAY=music}}
//  pets: [{species=DOG, nickname='Jack', age=3, trickLevel=35, habits=[sleep]}, {species=CAT, nickname='Oscar', age=5, trickLevel=81, habits=[eat, play]}]
}
  @Override
  public String toString() {
    List< Human> ch_lst = new ArrayList<>();
    Human[] ch = getChildren();
    return prettyFormat();
  }
  public int getFamilySize(){
    int count;
    if (children.length != 0) { count = children.length;}
      else{ count = 0; }
    return 2 + count;
  }
  public void addChild( Human child,String gender){
         Human[] a =this.children;
    this.children = new Human[this.children.length+1];
    System.arraycopy(a, 0, this.children, 0, a.length);
    this.children[a.length] = child;
  }
  public Human[] getChildren() {
    return children;
  }

  public void setChildren( Human[] children) {
    this.children = children;
  }

  public Human getFather() {
    return father;
  }

  public void setFather(Human father) {
    this.father = father;
  }

  public Human getMother() {
    return mother;
  }

  public void setMother(Human mother) {
    this.mother = mother;
  }

  public Set<Pet> getPet() {
    return pet;
  }

  public void setPet(Set<Pet> pet) {
    this.pet = pet;
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
