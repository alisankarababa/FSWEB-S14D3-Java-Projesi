package skeleton;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerCharge;
    private int battteryCapacity;

    public ElectricCar(String name, String description, double avgKmPerCharge, int battteryCapacity) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.battteryCapacity = battteryCapacity;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBattteryCapacity() {
        return battteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "avgKmPerCharge=" + avgKmPerCharge +
                ", battteryCapacity=" + battteryCapacity +
                '}';
    }
}
