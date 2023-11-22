package skeleton;

public class Main {

    public static void main(String[] args) {

        CarSkeleton carSkeleton = new CarSkeleton("genericSkeletonName", "generic skeleton");

        CarSkeleton electricCar = new ElectricCar("electricCarName", "runs on electricity", 100, 720000);
        CarSkeleton gasPoweredCar = new GasPoweredCar("gasPoweredCarName", "runs on gas", 10, 8);
        CarSkeleton hybridCar = new HybridCar("hybridCarName", "runs on both gas and electricity", 8, 360000, 7 );

        carSkeleton.runEngine();
        carSkeleton.startEngine();
        carSkeleton.drive();
        electricCar.runEngine();
        electricCar.startEngine();
        electricCar.drive();
        gasPoweredCar.runEngine();
        gasPoweredCar.startEngine();
        gasPoweredCar.drive();
        hybridCar.runEngine();
        hybridCar.startEngine();
        hybridCar.drive();
    }
}
