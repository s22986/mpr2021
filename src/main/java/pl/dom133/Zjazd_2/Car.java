package pl.dom133.Zjazd_2;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int seat;
    private int yearOfProduction;
    private int wheels;
    private int accessoryType;
    private String model;
    private String color;
    private String mark;
    private String vin;

    public Car(){

    }

    public Car(int seat, int yearOfProduction, int wheels, int accessoryType, String model, String color, String mark, String vin) {
        this.seat = seat;
        this.yearOfProduction = yearOfProduction;
        this.wheels = wheels;
        this.accessoryType = accessoryType;
        this.model = model;
        this.color = color;
        this.mark = mark;
        this.vin = vin;
    }

    public Long getId() {
        return id;
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

    public String getVin() {
        return vin;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setVin(String vin) {
        this.vin = vin;
    }
}