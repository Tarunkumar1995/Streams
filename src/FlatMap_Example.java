import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap_Example {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("Virat","Rohith", "SKY");
        List<String> teamB = Arrays.asList("Smith","Warner", "Starc");
        List<String> teamC = Arrays.asList("Stokes","Root", "Anderson");

        List<List<String>> playersInTeam = Arrays.asList(teamA, teamB, teamC);

        List<String> players = playersInTeam.stream()
                              .flatMap(pl -> pl.stream()).collect(Collectors.toList());
        System.out.println(players);
    }
}
