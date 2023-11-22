package skeleton;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int battteryCapacity;

    public ElectricCar(String name, String description, double avgKmPerCharge, int battteryCapacity) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.battteryCapacity = battteryCapacity;
    }

    @Override
    public void startEngine() {
        logClassSimpleName();
        System.out.println(getClass().getSimpleName() + " startEngine");
    }

    @Override
    public void drive() {
        logClassSimpleName();
        System.out.println(getClass().getSimpleName() + " drive");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", battteryCapacity=" + battteryCapacity +
                '}';
    }
}
