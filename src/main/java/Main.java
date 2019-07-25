package main.java;

import main.java.cinema.CinemaChoicer;
import main.java.movie.Genres;
import main.java.movie.Movie;
import main.java.movie.MovieSearch;
import main.java.ordering.OrderProcess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Movie> movie  = new ArrayList<>();

        CinemaChoicer cinemaChoicer = new CinemaChoicer(movie);
        MovieSearch movieSearch = new MovieSearch();
         movie = cinemaChoicer.getMovies();



//        System.out.println("Welcome to reservation ticket service");
//        System.out.println("Please choice you cinema by number");
//        System.out.println("1 - MostKino, Glinky 2 ; 2 - Multiplex, bul. Zorianiy 1; 3 - Karavan, Donetske sh., 10");
//        cinemaChoicer.choiceTheCinema(scan.nextInt()-1);
        cinemaChoicer.choiceTheCinema(2-1);
//        System.out.println("If you want to see this  list  of movies - press any key");

        movieSearch.searchMovieByCategory(Genres.ACTION);


//        System.out.println(cinemaChoicer.getMovies());

    }
}
