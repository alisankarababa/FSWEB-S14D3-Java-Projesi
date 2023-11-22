package models;

public class Mitsubishi extends Car {

    public Mitsubishi(int cntCylinder, String name) {
        super(cntCylinder, name);
    }

    @Override
    public String startEngine() {
        logClassSimpleName();
        return "Mitsubishi's engine is starting";
    }
    @Override
    public String accelerate() {
        logClassSimpleName();
        return "Mitsubishi is accelerating";
    }
    @Override
    public String brake() {
        logClassSimpleName();
        return "Mitsubishi is braking";
    }
}
