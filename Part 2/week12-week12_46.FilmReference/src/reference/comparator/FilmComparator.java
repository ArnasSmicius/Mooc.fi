package reference.comparator;

import reference.domain.Film;
import reference.domain.Rating;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by Arnas on 2017.03.25.
 */
public class FilmComparator implements Comparator<Film> {
    private Map<Film, List<Rating>> ratings;

    public FilmComparator(Map<Film, List<Rating>> ratings){
        this.ratings = ratings;
    }

    private int getTotalRating(Film film){
        int totalPoints = 0;
        for(Rating rating : ratings.get(film)){
            totalPoints += rating.getValue();
        }
        return totalPoints;
    }

    @Override
    public int compare(Film o1, Film o2) {
        if(getTotalRating(o1) < getTotalRating(o2)){
            return 1;
        }
        else {
            return -1;
        }
    }
}
