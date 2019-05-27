package exercises.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class PlayerManagment {
    public static void main(String[] args) {
        Player[] players = {new Player("Szybki", 345), new Player("Fuzzy", 219),
                new Player("Itzy", 345), new Player("Cohh", 438)};


        Arrays.sort(players, new CompareAll());
        Arrays.stream(players).forEach(System.out::println);
    }
}
