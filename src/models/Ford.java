package models;

public class Ford extends Car {

    public Ford(int cntCylinder, String name) {
        super(cntCylinder, name);
    }

    @Override
    public String startEngine() {
        logClassSimpleName();
        return "Ford's engine is starting";
    }
    @Override
    public String accelerate() {
        logClassSimpleName();
        return "Ford is accelerating";
    }
    @Override
    public String brake() {
        logClassSimpleName();
        return "Ford is braking";
    }
}
