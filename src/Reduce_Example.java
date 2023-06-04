import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_Example {
    public static void main(String[] args) {
        List<String> javaTpointStudents = Arrays.asList("Emma Watson", "Paul Walker", "Leesa",
                "James", "Lilly");

        Optional<String> name = javaTpointStudents.stream()
                             .reduce((fName,lName) -> fName.length() >= lName.length() ? fName:lName);

        System.out.println(name);
    }
}
