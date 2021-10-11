package exercises.class6.exercises6.technology;

public class Laptop extends Computer{

    private String brand;
    private String os;
    private int year;
    private boolean isOn = false;
    private boolean isOff = true;
    private boolean isConvertible;
    boolean sleepOnClose = true;

    private boolean isInSleepMode = false;


    public Laptop(String brand, String os, int year, boolean isConvertible) {
        this.brand = brand;
        this.os = os;
        this.year = year;
        this.isConvertible = isConvertible;
    }

    public boolean isInSleepMode() {
        return isInSleepMode;
    }

    public void closeLaptop() {
        if (!isInSleepMode)
        isInSleepMode = true;
    }

    public void openLaptop() {
        if (isInSleepMode)
            isInSleepMode = false;
    }


}
