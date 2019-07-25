package main.java.cinema;

import main.java.movie.Movie;

import java.util.ArrayList;
import java.util.List;


public class CinemaChoicer implements CinemaOperations {

    private Cinema cinema;
    private CinemaList cinemaList = new CinemaList();
    private List<Cinema> cinemas = new ArrayList<>();
    private List movies;

    public List getMovies() {
        return movies;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    @Override
    public List<Movie> choiceTheCinema(int choice) {
        movies = new ArrayList<>();
        cinemas.addAll(cinemaList.getCinemaList()); //take all cinemas , which we created
        cinema = cinemas.get(choice);  // take one cinema, which chosen client
        System.out.println("Your choice is a cinema: " + cinema.getName() + " by adress " + cinema.getAdress());
        movies = cinemas.get(choice).getMovieList(); // take the list of movies, in the chosen cinema
        return movies;
    }


}
