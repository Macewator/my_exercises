package exercises.sorting;

import java.util.Comparator;

public class CompareAll implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        int result = 0;
        if (o1.getScore() < o2.getScore()) {
            result = 1;
        } else if (o1.getScore() == o2.getScore()) {
            return o1.getNickName().compareTo(o2.getNickName());
        } else if (o1.getScore() > o2.getScore()) {
            result = -1;
        }

        return result;
    }
}
