package main.java.cinema;

import main.java.movie.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<String> moviesNamesOfSelectedCinema(){
        return moviesOfSelectedCinema().stream()
                .map(Movie::getName)
                .collect(Collectors.toList());
    }


}
