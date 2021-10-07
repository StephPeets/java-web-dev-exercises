package exercises.class5.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());
        System.out.println(car.getGasTankLevel());
        System.out.println(car.getGasTankSize());

    }
}
