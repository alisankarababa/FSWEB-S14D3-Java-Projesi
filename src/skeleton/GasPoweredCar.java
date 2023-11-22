package skeleton;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cntCylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cntCylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
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
        return "GasPoweredCar{" +
                "avgKmPerLitre=" + avgKmPerLitre +
                ", cntCylinders=" + cntCylinders +
                '}';
    }
}
