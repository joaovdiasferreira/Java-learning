package comportamento.test;

import comportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars;
    static {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("black", 1999));
        carList.add(new Car("red", 2001));
        carList.add(new Car("green", 2020));
        cars = new ArrayList<>(carList);
    }

    public static void main(String[] args) {


        cars.add(new Car("green", 1999));
        cars.add(new Car("green", 1978));
        cars.sort((o1, o2) -> Integer.compare(o1.getYear(), o2.getYear()));

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        List<Car> yearsBefore = filter(cars, car -> car.getYear() < 2020);
        System.out.println(greenCars);
        System.out.println(yearsBefore);
        System.out.println("---------------");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(filter(numbers, num -> num % 2 == 0));

    }
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
