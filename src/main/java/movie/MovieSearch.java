package main.java.movie;

import main.java.cinema.Cinema;
import main.java.cinema.CinemaChoicer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class MovieSearch implements MovieSearcher {


    private CinemaChoicer cinemaChoicer = new CinemaChoicer();

    List<Movie>  movies = cinemaChoicer.getMovies();
    @Override
    public List<Movie> searchMovieByCategory(Genres category) {
        movies = cinemaChoicer.getMovies();
        return movies.stream()
                .filter(movie -> movie.getMovieCategory().equals(category))
                .collect(Collectors.toList());
    }

    @Override
    public void searchMovieByRating() {

    }

    @Override
    public void searchMovieByPrice() {

    }
}

//Map<Genre, Double> averagePrice = movies.stream()
//                .filter(movie -> movie.getGenre().equals(genre))
//                .collect(Collectors.groupingBy(Film::getGenre, Collectors.averagingDouble(Film::getPrice)));