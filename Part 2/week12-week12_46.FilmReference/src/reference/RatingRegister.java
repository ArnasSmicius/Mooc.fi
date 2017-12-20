package reference;

import reference.domain.Film;
import reference.domain.Person;
import reference.domain.Rating;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Arnas on 2017.03.25.
 */
public class RatingRegister {
    private Map<Film, List<Rating>> filmRatings;
    private Map<Person, Map<Film, Rating>> peopleRatings;

    public RatingRegister(){
        this.filmRatings = new HashMap<Film, List<Rating>>();
        this.peopleRatings = new HashMap<Person, Map<Film, Rating>>();
    }

    public void addRating(Film film, Rating rating){
        if(this.filmRatings.containsKey(film)){
            List<Rating> ratings = filmRatings.get(film);
            ratings.add(rating);
            this.filmRatings.replace(film, ratings);
        }
        else {
            List<Rating> ratings = new ArrayList<Rating>();
            ratings.add(rating);
            this.filmRatings.put(film, ratings);
        }
    }

    public List<Rating> getRatings(Film film){
        return this.filmRatings.get(film);
    }

    public Map<Film, List<Rating>> filmRatings(){
        return this.filmRatings;
    }

    public void addRating(Person person, Film film, Rating rating){
        if(!this.peopleRatings.containsKey(person)){
            Map<Film, Rating> map = new HashMap<Film, Rating>();
            map.put(film, rating);
            this.peopleRatings.put(person, map);
        }
        else {
            Map<Film, Rating> map = this.peopleRatings.get(person);
            map.put(film, rating);
        }
        addRating(film, rating);
    }

    public Rating getRating(Person person, Film film){
        Map<Film, Rating> map = this.peopleRatings.get(person);
        if(map.get(film) == null){
            return Rating.NOT_WATCHED;
        }
        else {
            return map.get(film);
        }
    }

    public Map<Film, Rating> getPersonalRatings(Person person){
        if(!this.peopleRatings.containsKey(person)){
            Map<Film, Rating> map = new HashMap<Film, Rating>();
            return map;
        }
        return this.peopleRatings.get(person);
    }

    public List<Person> reviewers(){
        List<Person> reviewers = new ArrayList<Person>();
        for(Person person : this.peopleRatings.keySet()){
            reviewers.add(person);
        }
        return reviewers;
    }
}
