package main.java.movie;

import main.java.cinema.CinemaChoicer;

import java.util.List;
import java.util.stream.Collectors;


public class MovieSearch implements MovieSearcher {
    private CinemaChoicer cinemaChoicer = new CinemaChoicer();
    private Genres category;
    private double rating;


    @Override
    public List<String> searchMovieByCategory(Genres category) {
        this.category = category;
        List<Movie> movies = cinemaChoicer.moviesOfSelectedCinema();
        return movies.stream()
                .filter(movie -> movie.getMovieCategory().equals(category))
                .map(Movie::getName)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> searchMovieByRating (Double rating) {
        this.rating =rating;
        List<Movie> movies = cinemaChoicer.moviesOfSelectedCinema();
        return movies.stream()
                .filter(movie -> movie.getMovieRating() >= rating)
                .map(Movie::getName)
                .collect(Collectors.toList());
        }





}

//Map<Genre, Double> averagePrice = movies.stream()
//                .filter(movie -> movie.getGenre().equals(genre))
//                .collect(Collectors.groupingBy(Film::getGenre, Collectors.averagingDouble(Film::getPrice)));