package exercises.class6.exercises6.technology;

public class SmartPhone extends Computer{
    private String brand;
    private String os;
    private int year;
    private boolean isOn = false;
    private boolean isOff = true;
    private boolean inAirplaneMode;

    public SmartPhone(String brand, String os, int year) {
        this.brand = brand;
        this.os = os;
        this.year = year;

    }
    public boolean isInAirplaneMode() {
        return inAirplaneMode;
    }

    public void setInAirplaneMode(boolean inAirplaneMode) {
        this.inAirplaneMode = inAirplaneMode;
    }

    public void sendText(String text) {
        System.out.println(text);
    }
}
