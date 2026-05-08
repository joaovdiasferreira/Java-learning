package comportamento.test;

import comportamento.dominio.Car;
import comportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars;
    static {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("black", 1999));
        carList.add(new Car("red", 2001));
        carList.add(new Car("green", 2020));
        cars = new ArrayList<>(carList);
    }

    public static void main(String[] args) {

//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("green");
//            }
//        });
        cars.add(new Car("green", 1999));
        cars.add(new Car("green", 1978));
        cars.sort((o1, o2) -> Integer.compare(o1.getYear(), o2.getYear()));

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("green"));
        System.out.println(greenCars);

    }
    private static List<Car> filter(List<Car> carList, Predicate<Car> carPredicate) {
        List<Car> filteredCarList = new ArrayList<>();

        for (Car car : carList){
            if (carPredicate.test(car)){
                filteredCarList.add(car);
            }
        }
        return filteredCarList;
    }

}
