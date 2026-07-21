import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {

        Pair<String, Integer> pair1 = new Pair<>("Bence", 21);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());


        Container<Integer> container1 = new Container<>(1);
        Container<String> container2 = new Container<>("Hello");

        System.out.println(container1.getValue());
        System.out.println(container2.getValue());

        /*
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
        Consumer<Integer> evenOrOdd = num -> {
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        };
        evenOrOdd.accept(number);
         */
    }
}