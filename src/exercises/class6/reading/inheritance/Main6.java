package exercises.class6.reading.inheritance;

public class Main6 {

    public static void main(String[] args) {
        HouseCat charlie = new HouseCat("Charlie", 12);
//        charlie.setHungry(true);
        System.out.println(charlie.isHungry());
        System.out.println(charlie.noise());

        Cat pickles = new HouseCat("Pickles", 30);
        System.out.println(pickles.getWeight());
        System.out.println(pickles.noise());
        System.out.println(((HouseCat) pickles).isSatisfied());


    }
}
