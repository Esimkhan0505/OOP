package lab2.problem1c;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<Car> cars = new HashSet<>();

        cars.add(new Car("Toyota", 2020, "111ABC"));
        cars.add(new Car("Toyota", 2020, "111ABC"));
        cars.add(new Car("BMW", 2021, "222DEF"));

        System.out.println("HashSet size: " + cars.size());

        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
