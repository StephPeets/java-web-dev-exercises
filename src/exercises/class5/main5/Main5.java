package exercises.class5.main5;

public class Main5 {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
        System.out.println(car.getMake() + " - " + car.getModel());
        System.out.println(car.getGasTankLevel());
        System.out.println(car.getGasTankSize());

    }
}
