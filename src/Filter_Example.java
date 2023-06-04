import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter_Example {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tarun","Sagar Joseph","Apuroop","Nikhil Mama");

        List<String> filter_names = new ArrayList<>();

        names.stream().filter(str -> str.length() >=5 && str.length() <=8).forEach(System.out::println);
    }
}
