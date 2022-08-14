package hw7;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Maestro", 70);
        Dog d1 = new Dog("Kiki", 30 );
        System.out.println(d.respond());
        d.eat();
        d.describePet();
        d1.describePet();
        d.foul();
        System.out.println();
        DomesticCat cat = new DomesticCat("Barni", 76);
        System.out.println(cat.respond());
        cat.eat();
        cat.describePet();
        cat.foul();
        System.out.println();

        Fish fish = new Fish("Nemo", 32);
        System.out.println(fish.respond());
        fish.eat();
        fish.describePet();
        fish.foul();
        System.out.println();

        RoboCat rcat = new RoboCat("Kiki", 30);
        System.out.println(rcat.respond());
        rcat.eat();
        rcat.describePet();
        rcat.foul();
        System.out.println();

        Man m = new Man("Jamal","Garayev",45);
        System.out.println("I'm man: " + m.name + " " + m.surname);

        Woman w = new Woman("Jamila","Garayev",45);
        System.out.println("I'm woman: " + w.name + " " + w.surname);


        // task with advanced complexity
        Family fm = new Family();
        System.out.println(fm);

    }
}
