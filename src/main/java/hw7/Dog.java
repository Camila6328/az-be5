package hw7;

public class Dog extends Pet {

    Dog(String nickname,int trickLevel,Species species) {
        super(nickname,trickLevel,species);
    }
    Dog(String nickname,int trickLevel ) {
        super(nickname,trickLevel);
    }
    @Override
    public String respond()
    {
       return "Hello, owner. I am -" + this.nickname+ ". I miss you!";
    }
    @Override
    public void describePet() {
            String sly;
            boolean slyLevel;
            if(this.trickLevel>50){sly = "very sly";}
            else {sly = "almost not sly";}
            System.out.println("I have a "+ Species.dog + ", he is "+sly ); //species+age+
    }
    public void foul(){
        System.out.println( "I need to cover it up for dog");
    }

}
