package skeleton;

import models.Car;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void logClassSimpleName() {
        System.out.println("Class SimpleName: " + getClass().getSimpleName());
    }
    public void startEngine() {
        System.out.println("startEngine");
    }
    public void drive() {
        runEngine(this);
        System.out.println(name + " driving");
    }
    protected void runEngine(CarSkeleton carSkeleton) {
        logClassSimpleName();

        if(carSkeleton instanceof ElectricCar) {
            System.out.println("ElectricCar run engine. kmPerCharge: " +  ((ElectricCar)carSkeleton).getAvgKmPerCharge());
        } else if (carSkeleton instanceof GasPoweredCar ) {
            System.out.println("GasPowerCar run engine. kmPerLiter: " +  ((GasPoweredCar)carSkeleton).getAvgKmPerLitre());
        } else if (carSkeleton instanceof HybridCar) {
            System.out.println("HybridCar run engine. kmPerLiter: " +  ((HybridCar)carSkeleton).getAvgKmPerLitre()
            + " kmPerCharge: " + ((HybridCar)carSkeleton).getAvgKmPerLitre());
        } else {
            System.out.println("nope");
        }

    }
}
