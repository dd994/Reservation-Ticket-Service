package main.java.movie;

import java.util.List;

public interface MovieSearcher {
    List<Movie> searchMovieByCategory(Genres category);
    void searchMovieByRating();
    void searchMovieByPrice();
}
