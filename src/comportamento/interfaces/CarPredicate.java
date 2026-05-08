package comportamento.interfaces;

import comportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    //anonimas, funções, conciso
    boolean test(Car car);
    //(parametro) -> <expressão>
    //ex: (Car car) -> car.getColor.equals("red");
}
