package exercises.class6.exercises6.technology;

public class Computer {
    private String brand;
    private String os;
    private int year;
    private boolean isOn = false;
    private boolean isOff = true;

    public Computer() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isOff() {
        return isOff;
    }

    public void powerOn(){
        this.isOn = true;
        this.isOff = false;
    }

    public void powerOff() {
        this.isOn = false;
        this.isOff = true;
    }


}
