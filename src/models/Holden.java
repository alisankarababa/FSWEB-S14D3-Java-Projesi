package models;

public class Holden extends Car {

    public Holden(int cntCylinder, String name) {
        super(cntCylinder, name);
    }

    @Override
    public String startEngine() {
        logClassSimpleName();
        return  "Holden's engine is starting";
    }
    @Override
    public String accelerate() {
        logClassSimpleName();
        return  "Holden is accelerating";
    }
    @Override
    public String brake() {
        logClassSimpleName();
        return  "Holden is braking";
    }
}
