package models;

import java.util.Objects;

public class Car {

    private boolean hasEngine;
    private int cntCylinder;
    private String name;
    private int cntWheel;

    public Car(int cntCylinder, String name) {

        this.name = name;
        this.cntCylinder = cntCylinder;
        this.hasEngine = true;
        this.cntWheel = 4;
    }
    public int getCntCylinder() {
        return cntCylinder;
    }
    public String getName() {
        return name;
    }
    public void logClassSimpleName() {
        System.out.println("Class SimpleName: " + getClass().getSimpleName());
    }
    public String startEngine() {
        logClassSimpleName();
        return "the car's engine is starting";
    }
    public String accelerate() {
        logClassSimpleName();
        return "the car is accelerating";
    }
    public String brake() {
        logClassSimpleName();
        return "the car is braking";
    }
    @Override
    public String toString() {
        return "Car{" +
                "hasEngine=" + hasEngine +
                ", cntCylinder=" + cntCylinder +
                ", name='" + name + '\'' +
                ", cntWheel=" + cntWheel +
                '}';
    }
    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;
        if( null == obj || this.getClass() != obj.getClass())
            return false;

        Car car = (Car)obj;
        return Objects.equals(car.name, this.name) && car.cntCylinder == this.cntCylinder;
    }
}
