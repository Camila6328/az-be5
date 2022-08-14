package hw7;

public class Man extends Human{
Man(String name, String surname,int iq)
{
    // Super keyword refers to parent class
    super(name,surname,iq);
}

    public Man() {

    }

    @Override
    public void greet() {
        System.out.println("Welcome Sir");
    }

    public void repairCar(){
        System.out.println("RepairCar for men");
    }
}
