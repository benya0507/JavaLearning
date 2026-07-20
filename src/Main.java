import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        int number = 3;

        //runnable: nincs bemenet, nincs kimenet
        Runnable printName = () -> System.out.println("Bence");
        printName.run();

        //supplier: nincs bemenet, van kimenet
        Supplier<Integer> sqrt = () -> number*number;
        System.out.println(sqrt.get());

        //function: van bemenet, van kimenet
        Function<Integer, Integer> timesTwo = x -> x * 2;
        System.out.println(timesTwo.apply(number));

        //consumer: van bemenet, nincs kimenet
        //Consumer<Integer> evenOrOdd =
    }
}