package hw7;

public class Woman extends Human{
    Woman(String name, String surname,int iq)
    {
        // Super keyword refers to parent class
        super(name,surname,iq);
    }
    @Override
    public void greet() {
            System.out.println("Welcome Lady");
    }
    public void makeup(){
        System.out.println("makeup for women");
    }
}
