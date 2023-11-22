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

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getCntCylinders() {
        return cntCylinders;
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
