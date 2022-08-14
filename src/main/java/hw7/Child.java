package hw7;

public class Child extends Human{

    Child(String name, String surname,int iq)
    {
        // Super keyword refers to parent class
        super(name,surname,iq);
    }
    @Override
    public void greet() {
        System.out.println("Welcome child");
    }
}
