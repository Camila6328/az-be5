package hw5;

import java.util.Arrays;
import java.util.Objects;

public class Family  {
    Human mother;
    Human father;
    Human[] children=new Human[]{};//1
    Pet pet;

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }
    public void addChild(Human child){
            Human[] a =this.children;
            this.children = new Human[this.children.length+1];
        System.arraycopy(a, 0, this.children, 0, a.length);
         this.children[a.length] = child;
    }

    //Delete child from Family
    public boolean deleteChild(int index){
        Human[] arr = this.children;
        if (arr == null || index < 0 || index >= arr.length) {
            return false;
        }
        Human[] anotherArray = new Human[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        this.children = anotherArray;
        return true;
    }

    public int countFamily() {
        Human [] arr = this.children;
        return 2 + arr.length;
    }
    public Family(Human mother, Human father, Human[] children) {
        this.mother = mother;
        this.father = father;
        this.children = children;
    }
    public Family(Human mother, Human father, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }
    public Family(Human mother, Human father, Human[] children, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet = pet;
    }
    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother + "\n"+
                ", father=" + father + "\n"+
                ", children=" + Arrays.toString(children)+ "\n"+
                ", pet=" + pet + "\n"+
                "} " ;//+ super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family family)) return false;
        return Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Objects.equals(getChildren(), family.getChildren()) && Objects.equals(getPet(), family.getPet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMother(), getFather(), getChildren(), getPet());
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
