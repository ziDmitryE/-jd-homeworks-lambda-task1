package LYAMBDA.Calculator;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;
    int z;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
//        Причина возникновения ошибки в делении на 0
//        В качестве решения проблемы можно добавить проверку оператором if:
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) {
            System.out.println("ERROR: Деление на ноль");
        } else {
            z = x / y;
        }
        return z;
    };
//    Либо тоже самое тернарным оператором:
//    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : 0;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;

}
