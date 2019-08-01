package main.java.cinema;

import main.java.movie.Movie;
import java.util.ArrayList;
import java.util.List;

public class CinemaChoicer implements CinemaOperations {
    private Cinema cinema;
    private CinemaList cinemaList = new CinemaList();
    private List<Cinema> cinemas = new ArrayList<>();

    public int choice;

    private int getChoice() {
        return choice;
    }

    @Override
    public Cinema choiceTheCinema() {
        cinemas.addAll(cinemaList.getCinemaList());
        cinema = cinemas.get(getChoice());
        return cinema;
    }

    public List<Movie> moviesOfSelectedCinema() {
        choiceTheCinema();
        List<Movie> movies = cinema.getMovieList();
        return movies;
    }


}
