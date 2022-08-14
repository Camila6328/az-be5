package hw7;

public class DomesticCat extends Pet {

    public DomesticCat(String nickname, int trickLevel, Species species) {
        super(nickname, trickLevel, species);
    }

    public DomesticCat(String nickname, int trickLevel) {
        super(nickname, trickLevel);
    }
    public void describePet() {
        String sly;
        boolean slyLevel;
        if(this.trickLevel>50){sly = "very sly";}
        else {sly = "almost not sly";}
        System.out.println("I have a "+ Species.cat + ", he is "+sly );
    }
    @Override
    public String respond()
    {
        return "Hello, owner. I am -" + this.nickname+ ". I miss you!";
    }
    public void foul(){
        System.out.println("I need to cover it up DomesticCat");

    }
}
