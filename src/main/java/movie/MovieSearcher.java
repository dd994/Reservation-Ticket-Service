package main.java.movie;

import java.util.Map;

public interface MovieSearcher {
    Map<Integer, String> searchMovieByCategory(Genres category);
    Object searchMovieByRating(double rating);

}
