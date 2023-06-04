import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, -4, 16, 0, 1, -6, 3);

        int add_Num = numbers.stream().reduce(0, (a,b) -> (a+b));
        System.out.println(add_Num);
    }
}
