package main.java.movie;

import java.util.List;

public interface MovieSearcher {
    List<String> searchMovieByCategory(Genres category);
    List<String> searchMovieByRating(Double rating);

}
