package KontrolWork;

import java.util.*;

public class ListOfCar {
    private static Random random = new Random();

    public static void main(String[] args) {

        int countOfCars = 20;
        List<Car> cars = new ArrayList<>(10);
        for (int i = 0; i < countOfCars; i++) {
            Car car = new Car(getRandomEngineCapacity(1, 3));
            cars.add(car);
            System.out.println(car);
        }

        Map<Integer, ArrayList<Car>> groupedCars = new HashMap<>();
        for (Car car : cars) {
            Integer key = car.getEngineCapacity();
            if (groupedCars.get(key) == null) {

                groupedCars.put(key, new ArrayList<>());
            }
            groupedCars.get(key).add(car);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Add value engineCapacity");
        int value = scanner.nextInt();

        List<Car> cars1 = groupedCars.get(value);
        for (Car car : cars1) {
            System.out.println(car);
        }
    }

    private static int getRandomEngineCapacity(int start, int end) {

        return random.nextInt(end - start + 1) + start;

    }
}

