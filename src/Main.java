import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        IntStream.rangeClosed(1, 100).mapToObj(v -> v % 15 == 0 ? "FizzBuzz" : v % 5 == 0 ? "Buzz" : v % 3 == 0 ? "Fizz" : v).forEach(System.out::println);

    }
}
