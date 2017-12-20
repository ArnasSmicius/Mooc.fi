package reference;

import reference.comparator.FilmComparator;
import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Arnas on 2017.03.25.
 */
public class Reference {
    private RatingRegister ratingRegister;

    public Reference(RatingRegister ratingRegister){
        this.ratingRegister = ratingRegister;
    }

    public Film recommendFilm(Person person){
                FilmComparator filmComparator = new FilmComparator(ratingRegister.filmRatings());
                List<Film> films = new ArrayList<Film>();
                for(Film film : ratingRegister.filmRatings().keySet()){
                    films.add(film);
                }
                Collections.sort(films, filmComparator);
                for(Film film : ratingRegister.getPersonalRatings(person).keySet()){
                    if(ratingRegister.getPersonalRatings(person).get(film) != Rating.NOT_WATCHED){
                        films.remove(film);
                    }
                }
                if(films.size() == 0){
                    return null;
                }
                else {
                    return films.get(0);
                }
    }
}
