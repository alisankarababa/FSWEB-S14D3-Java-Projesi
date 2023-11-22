package skeleton;

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
        logClassSimpleName();
        System.out.println("startEngine");
    }
    public void drive() {
        logClassSimpleName();
        System.out.println("driving");
    }
    protected void runEngine() {
        logClassSimpleName();
        System.out.println("engine running");
    }
}
