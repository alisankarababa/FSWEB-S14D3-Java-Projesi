package skeleton;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cntCylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cntCylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cntCylinders = cntCylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCntCylinders() {
        return cntCylinders;
    }

    @Override
    public String toString() {
        return "GasPoweredCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cntCylinders=" + cntCylinders +
                '}';
    }
}
