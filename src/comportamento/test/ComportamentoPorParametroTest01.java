package comportamento.test;

import comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(
                new Car("black", 1999),
                new Car("red", 2001),
                new Car("green", 2020)));

        cars.add(new Car("green", 2026));

        List<Car> filteredCars = filterCarsByColor(cars, "green");
        System.out.println(filteredCars);
        System.out.println("--------------");
        filteredCars = filterByYearBefore(cars, 2010);
        System.out.println(filteredCars);

    }
    private static List<Car> filterCarsByColor(List<Car> cars, String color) {
        List<Car> carsList = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carsList.add(car);
            }
        }
        return carsList;
    }

    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
