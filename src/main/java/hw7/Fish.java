package hw7;

public class Fish extends Pet{
    public Fish(String nickname, int trickLevel, Species species) {
        super(nickname, trickLevel, species);
    }

    public Fish(String nickname, int trickLevel) {
        super(nickname, trickLevel);
    }
    public void describePet() {
        String sly;
        boolean slyLevel;
        if(this.trickLevel>50){sly = "very sly";}
        else {sly = "almost not sly";}
        System.out.println("I have a "+ Species.fish + ", he is "+sly ); //species+age+
    }
    @Override
    public String respond()
    {
        return "Hello, owner. I am -" + this.nickname+ ". I miss you!";
    }

    public void foul(){
        System.out.println("I need to cover it up Fish");
    }
}
