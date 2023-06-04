import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class map_Example {
    public static void main(String[] args) {
        List<Employee> emp = Arrays.asList(new Employee(1,"Sai",10000),
                                             new Employee(2, "Arjun",20000),
                                           new Employee(3,"Tarun",30000),
                new Employee(4,"Ravi",40000));
        List<Double> emp_list = emp.stream().filter(sal -> sal.salary >20000)
                                 .map(e -> e.salary).
                                 collect(Collectors.toList());

        System.out.println(emp_list);
    }
}
