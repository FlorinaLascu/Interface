public class Fish implements Prey,Predator{

    String specia;

    String regiune;

    int greutate;

    public Fish(String specia, String regiune, int greutate){

        this.specia = specia;

        this.regiune = regiune;

        this.greutate = greutate;

    }
    @Override
    public void hunt() {

        System.out.println("This fish is hunting smaller fish");
    }

    @Override
    public void flee() {

        System.out.println("This fish is fleeing from a larger fish");

    }
    @Override
    public  String toString(){
        return "SPECIA: "+ this.specia+ " REGIUNEA: " + this.regiune+ " GREUTATE: " + this.greutate;
    }
}
