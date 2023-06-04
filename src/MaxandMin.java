import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxandMin {
    public static void main(String[] args) {
        List<Integer> Numbers = Arrays.asList(1,5,3,2,6,8,4);

        Optional<Integer> asc_Num = Numbers.stream().min((val1 , val2) ->{return val1.compareTo(val2);});

        System.out.println(asc_Num);

        Optional<Integer> desc_Number = Numbers.stream().max((val1, val2) ->{
            return val1.compareTo(val2);
        });

        System.out.println(desc_Number);
    }
}
