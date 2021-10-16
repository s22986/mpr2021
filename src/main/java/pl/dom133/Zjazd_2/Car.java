package pl.dom133.Zjazd_2;


public class Car {
    private int seat;
    private int yearOfProduction;
    private int wheels;
    private int accessoryType;
    private String model;
    private String color;
    private String mark;

    public Car(int seat, int yearOfProduction, int wheels, int accessoryType, String model, String color, String mark) {
        this.seat = seat;
        this.yearOfProduction = yearOfProduction;
        this.wheels = wheels;
        this.accessoryType = accessoryType;
        this.model = model;
        this.color = color;
        this.mark = mark;
    }

    public int getSeat() {
        return seat;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getWheels() {
        return wheels;
    }

    public int getAccessoryType() {
        return accessoryType;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMark() {
        return mark;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setAccessoryType(int accessoryType) {
        this.accessoryType = accessoryType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return mark+"{" +
                "seat=" + seat +
                ", yearOfProduction=" + yearOfProduction +
                ", wheels=" + wheels +
                ", accessoryType=" + accessoryType +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                '}';
    }
}