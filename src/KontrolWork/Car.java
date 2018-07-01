package KontrolWork;

public class Car {
    private String name;
    private String carModel;
    private int engineCapacity;

    public Car(int engineCapacity) {
        this.name = "Name";
        this.carModel = "CarModel";
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public java.lang.String toString() {
        return "Car{" +
                "name=" + name +
                ", carModel=" + carModel +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
