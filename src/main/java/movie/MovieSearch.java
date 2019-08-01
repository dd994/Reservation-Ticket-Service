package main.java.movie;

import main.java.cinema.CinemaChoicer;

import java.util.*;
import java.util.stream.Collectors;


public class MovieSearch implements MovieSearcher {
    private CinemaChoicer cinemaChoicer = new CinemaChoicer();
    private Genres category;
    private double rating;

    public void searchScript(int way) {
        MovieSearch movieSearch = new MovieSearch();
        Scanner scanner = new Scanner(System.in);
        if (way == 1) {
            System.out.println("You selected search by category");
            System.out.println("Please, select number of category:\n " +
                    "    1 - COMEDY,\n" +
                    "    2 - STORY,\n" +
                    "    3- THRILLER,\n" +
                    "    4 - FAMILY,\n" +
                    "    5 - HORROR,\n" +
                    "    6 - HISTORICAL,\n" +
                    "    7 - ACTION");
            System.out.println(movieSearch.searchMovieByCategory(movieSearch.categoryTypeSwitcher(scanner.nextInt())));
        } else if (way == 2) {
            System.out.println("Enter a minimum rating in format 'x,xx'");
            System.out.println(movieSearch.searchMovieByRating(scanner.nextDouble()));
        } else System.out.println("Wrong number");

    }

    public Genres categoryTypeSwitcher(int number) {
        Genres category = null;
        switch (number) {
            case (1):
                category = Genres.COMEDY;
                break;
            case (2):
                category = Genres.STORY;
                break;
            case (3):
                category = Genres.THRILLER;
                break;
            case (4):
                category = Genres.FAMILY;
                break;
            case (5):
                category = Genres.HORROR;
                break;
            case (6):
                category = Genres.HISTORICAL;
                break;
            case (7):
                category = Genres.ACTION;
                break;
        }
        return category;
    }


    @Override
    public Map<Integer, String> searchMovieByCategory(Genres category) {
        List<String> movies = cinemaChoicer.moviesOfSelectedCinema().stream()
                .filter(movie -> movie.getMovieCategory().equals(category))
                .map(Movie::getName)
                .collect(Collectors.toList());
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < movies.size(); i++) {
            result.put(i + 1, movies.get(i) );
        }
        return result;

    }

    @Override
    public Map<Integer, String> searchMovieByRating(double rating) {
        List<String> movies = cinemaChoicer.moviesOfSelectedCinema().stream()
                .filter(movie -> movie.getMovieRating() >= rating)
                .map(Movie::getName)
                .collect(Collectors.toList());
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < movies.size(); i++) {
            result.put(i + 1, movies.get(i) );
        }
        return result;
    }


}
