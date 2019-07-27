package main.java.movie;

import java.util.ArrayList;
import java.util.List;

import static main.java.hall.Halls.*;

public class MoviesList {
    private List<Movie> movies = new ArrayList();

    public List<Movie> getMovies() {
        return movies;
    }

    @Override
    public String toString() {
        return "MoviesList{" +
                "movies=" + movies +
                '}';
    }

    public List cinemaOneMovieList() {
        movies.add(new Movie("Batman", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(10.00, 12.00), 100,4.5));
        movies.add(new Movie("Ironman", hallTwo, "Translated", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 100,4.5));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 100,4.5));
        movies.add(new Movie("The Godfather", hallOne, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(12.00, 14.00), 80,4.5));
        movies.add(new Movie("Gravity", hallTwo, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(12.00, 14.00), 80,4.7));
        movies.add(new Movie("Ratatouille", hallThree, "Original", MovieStatus.AVAILABLE, Genres.FAMILY, new Movie.Duration(12.00, 14.00), 80,4.7));
        movies.add(new Movie("Manchester by the Sea", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(14.00, 16.00), 75,4.7));
        movies.add(new Movie("Toy Story", hallTwo, "Original", MovieStatus.PREMIER, Genres.FAMILY, new Movie.Duration(14.00, 16.00), 75,4.7));
        movies.add(new Movie("Dunkirk", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(14.00, 16.00), 75,4.7));
        movies.add(new Movie("Taxi Driver", hallOne, "Original", MovieStatus.AVAILABLE, Genres.COMEDY, new Movie.Duration(16.00, 18.00), 95,4.7));
        movies.add(new Movie("Batman 2", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(16.00, 18.00), 95,4.7));
        movies.add(new Movie("Star Wars: Episode VIII - The Last Jedi", hallThree, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(16.00, 18.00), 95,4.7));
        movies.add(new Movie("Street Fight", hallOne, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(18.00, 20.00), 80,4.7));
        movies.add(new Movie("El Dorado", hallTwo, "Original", MovieStatus.AVAILABLE, Genres.STORY, new Movie.Duration(18.00, 20.00), 80,4.7));
        movies.add(new Movie("The Godfather 2", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(18.00, 20.00), 80,4.7));
        movies.add(new Movie("Batman", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(20.00, 22.00), 100,4.7));
        movies.add(new Movie("Ironman", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 100,4.7));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 100,4.7));
        movies.add(new Movie("Girlhood", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(22.00, 00.00), 90,4.7));
        movies.add(new Movie("The Bourne Ultimatum", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(22.00, 00.00), 90,4.7));
        movies.add(new Movie("Schindler's List", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(22.00, 00.00), 90,4.7));
        return movies;
    }

    public List cinemaTwoMovieList() {
        movies.add(new Movie("Mad Max: Fury Road", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(10.00, 12.00), 100,4.7));
        movies.add(new Movie("The Truman Show", hallTwo, "Translated", MovieStatus.PREMIER, Genres.COMEDY, new Movie.Duration(10.00, 12.00), 100,4.7));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 95,4.7));
        movies.add(new Movie("The Godfather", hallOne, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(12.00, 14.00), 85,4.7));
        movies.add(new Movie("Gravity", hallTwo, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(12.00, 14.00), 85,4.7));
        movies.add(new Movie("Ratatouille", hallThree, "Original", MovieStatus.AVAILABLE, Genres.FAMILY, new Movie.Duration(12.00, 14.00), 120,4.7));
        movies.add(new Movie("Manchester by the Sea", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(14.00, 16.00), 90,4.7));
        movies.add(new Movie("Toy Story", hallTwo, "Original", MovieStatus.PREMIER, Genres.FAMILY, new Movie.Duration(14.00, 16.00), 100,4.7));
        movies.add(new Movie("Dunkirk", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(14.00, 16.00), 110,4.7));
        movies.add(new Movie("Taxi Driver", hallOne, "Original", MovieStatus.AVAILABLE, Genres.COMEDY, new Movie.Duration(16.00, 18.00), 50,4.7));
        movies.add(new Movie("Batman 2", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(16.00, 18.00), 90,4.6));
        movies.add(new Movie("Star Wars: Episode VIII - The Last Jedi", hallThree, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(16.00, 18.00), 100,4.7));
        movies.add(new Movie("Street Fight", hallOne, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(18.00, 20.00), 85,4.7));
        movies.add(new Movie("El Dorado", hallTwo, "Original", MovieStatus.AVAILABLE, Genres.STORY, new Movie.Duration(18.00, 20.00), 70,4.7));
        movies.add(new Movie("The Godfather 2", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(18.00, 20.00), 105,4.7));
        movies.add(new Movie("Dunkirk", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(20.00, 22.00), 100,4.7));
        movies.add(new Movie("Ironman", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 60,4.7));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 120,4.7));
        movies.add(new Movie("Girlhood", hallOne, "Translated", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(22.00, 00.00), 95,4.7));
        movies.add(new Movie("The Bourne Ultimatum", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(22.00, 00.00), 80,4.7));
        movies.add(new Movie("Schindler's List", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(22.00, 00.00), 90,4.7));
        return movies;

    }

    public List cinemaThreeMovieList() {
        movies.add(new Movie("Batman", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(10.00, 12.00), 90,4.7));
        movies.add(new Movie("Ironman", hallTwo, "Translated", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 95,4.7));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 1200,4.7));
        movies.add(new Movie("The Godfather", hallOne, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(12.00, 14.00), 85,4.7));
        movies.add(new Movie("Gravity", hallTwo, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(12.00, 14.00), 90,4.7));
        movies.add(new Movie("Ratatouille", hallThree, "Original", MovieStatus.AVAILABLE, Genres.FAMILY, new Movie.Duration(12.00, 14.00), 110,4.7));
        movies.add(new Movie("Manchester by the Sea", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(14.00, 16.00), 80,4.7));
        movies.add(new Movie("Toy Story", hallTwo, "Original", MovieStatus.PREMIER, Genres.FAMILY, new Movie.Duration(14.00, 16.00), 80,4.7));
        movies.add(new Movie("Dunkirk", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(14.00, 16.00), 110,4.7));
        movies.add(new Movie("Taxi Driver", hallOne, "Original", MovieStatus.AVAILABLE, Genres.COMEDY, new Movie.Duration(16.00, 18.00), 70,4.7));
        movies.add(new Movie("Batman 2", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(16.00, 18.00), 85,4.7));
        movies.add(new Movie("Star Wars: Episode VIII - The Last Jedi", hallThree, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(16.00, 18.00), 115,4.7));
        movies.add(new Movie("Street Fight", hallOne, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(18.00, 20.00), 50,4.7));
        movies.add(new Movie("El Dorado", hallTwo, "Original", MovieStatus.AVAILABLE, Genres.STORY, new Movie.Duration(18.00, 20.00), 60,4.7));
        movies.add(new Movie("The Godfather 2", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(18.00, 20.00), 90,4.7));
        movies.add(new Movie("Batman", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(20.00, 22.00), 50,4.7));
        movies.add(new Movie("Ironman", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 70,4.7));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 95,4.7));
        movies.add(new Movie("Girlhood", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(22.00, 00.00), 60,4.7));
        movies.add(new Movie("The Bourne Ultimatum", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(22.00, 00.00), 85,4.7));
        movies.add(new Movie("Schindler's List", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(22.00, 00.00), 95,4.7));
        return movies;
    }


}
