public class Rabbit implements Prey{

    String nume;

    int greutate;

    public Rabbit(String nume, int greutate)
    {
        this.nume = nume;

        this.greutate = greutate;
    }
    @Override
    public void flee() {

        System.out.println("The Rabbit is fleeing");
    }

    @Override
    public  String toString(){
        return "NUME: "+ this.nume+ " GREUTATE: " + this.greutate;
    }

    public int getGreutate() {
        return greutate;
    }

    public String getNume() {
        return nume;
    }
}
