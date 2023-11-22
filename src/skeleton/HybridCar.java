package skeleton;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batteryCapacity;
    private int cntCylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batteryCapacity, int cntCylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batteryCapacity = batteryCapacity;
        this.cntCylinders = cntCylinders;
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
        return "HybridCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", batteryCapacity=" + batteryCapacity +
                ", cntCylinders=" + cntCylinders +
                '}';
    }
}
