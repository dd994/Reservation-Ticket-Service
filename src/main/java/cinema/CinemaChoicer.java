package main.java.cinema;

import main.java.movie.Movie;

import java.util.ArrayList;
import java.util.List;


public class CinemaChoicer implements CinemaOperations {
    private CinemaChoicer cinemaChoicer;
    private Cinema cinema;
    private CinemaList cinemaList = new CinemaList();
    private List<Cinema> cinemas = new ArrayList<>();



    public Cinema getCinema() {
        return cinema;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }


    int choice;
    public int choiser(){
        return this.choice;
    }

    @Override
    public Cinema choiceTheCinema() {
        cinemas.addAll(cinemaList.getCinemaList());
        cinema = cinemas.get(1);
        return cinema;
    }

    public List<Movie> moviesOfSelectedCinema(){
        choiceTheCinema();
        System.out.println("Your choice is a cinema: " + cinema.getName() + " by adress " + cinema.getAdress());
        List<Movie> movies = cinema.getMovieList();
        return movies;
    }


}
