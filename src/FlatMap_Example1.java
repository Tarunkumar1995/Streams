import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Example1 {
    public static void main(String[] args) {
        List<Student> student1 = new ArrayList<>();
        student1.add(new Student(1, "Sai", 'A'));
        student1.add(new Student(2, "Arjun", 'B'));
        student1.add(new Student(3, "Kai", 'C'));


        List<Student> student2 = new ArrayList<>();
        student2.add(new Student(4, "Mike", 'A'));
        student2.add(new Student(5, "Arun", 'B'));
        student2.add(new Student(6, "Tom", 'F'));

        List<List<Student>> Tot_Student = new ArrayList<List<Student>>();
        Tot_Student.add(student1);
        Tot_Student.add(student2);

        List<String> Com_Students = Tot_Student.stream().
                                 flatMap(n ->n.stream())
                                .map( n ->n.name).collect(Collectors.toList());

        System.out.println(Com_Students);
    }
}
