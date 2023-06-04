import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flat_map_Example {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> U_numbers = numbers.stream().map(n -> n+10).collect(Collectors.toList());
        System.out.println(U_numbers);

        List<Integer> C_numbers = Arrays.asList(1,2);
        List<Integer> C_numbers1 = Arrays.asList(3,4);
        List<Integer> C_numbers2 = Arrays.asList(5,6);

        List<List<Integer>> array_list = Arrays.asList(C_numbers,C_numbers1,C_numbers2);

        List<Integer> final_Numbers = array_list.stream().flatMap( n-> n.stream())
                                     .map(n -> n+ 10)
                                     .collect(Collectors.toList());

        System.out.println(final_Numbers);
    }
}
