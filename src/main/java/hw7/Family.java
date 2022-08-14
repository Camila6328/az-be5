package hw7;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class Family implements HumanCreator {
    List<String> mList = Arrays.asList("Rafiq","Jamal","Ahmad","Kamal");

    Man father= new Man(man(),"Garayev",80);
    Woman mather= new Woman("Malahat","Garayeva",70);
    Child ch =  new Child("Vali", "Garayev", averageIq());
    @Override
    public Child bornChild() {
        return ch;
    }
    @Override
    public String man() {
        Random rand = new Random();
        return mList.get(rand.nextInt(mList.size()));
    }


    @Override
    public int averageIq() {
        return (father.iq+mather.iq) /2;
    }
    @Override
    public String women() {
        return mather.name ;
    }

    @Override
    public String toString() {
        return "Family{" +
                "Father = " + man() + ", " +
                "Mather = " + women() + ", " +
                "Child_name = " + bornChild().name + ", Child_iq = " + bornChild().iq +
                '}';
    }
}
