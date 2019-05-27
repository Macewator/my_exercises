package exercises.sortingTwo;

import java.util.Comparator;

public enum MovieComparator {
    TITLE("Title", Comparator.comparing(Movie::getTitle)),
    RATING("Rating", Comparator.comparing(Movie::getRating).reversed()),
    YEAR("Year", Comparator.comparing(Movie::getYear).reversed());

    private final String criteria;
    private final Comparator<Movie> comparator;

    MovieComparator(String criteria, Comparator<Movie> comparator) {
        this.criteria = criteria;
        this.comparator = comparator;
    }

    public String getCriteria() {
        return criteria;
    }

    public Comparator<Movie> getComparator() {
        return comparator;
    }

    public static MovieComparator convert(String criteria) {
        MovieComparator[] values = MovieComparator.values();
        for (MovieComparator value : values) {
            if(value.getCriteria().toLowerCase().equals(criteria.toLowerCase()))
                return value;
        }
        throw new IllegalArgumentException("Nieprawidłowe kryterium sortowania " + criteria);
    }
}
