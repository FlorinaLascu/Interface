public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit("John",20);
        rabbit.flee();
        System.out.println(rabbit.toString());

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish("Salau","Lacul Secu",200);
        fish.hunt();
        fish.flee();
        System.out.println(fish.toString());
    }
}