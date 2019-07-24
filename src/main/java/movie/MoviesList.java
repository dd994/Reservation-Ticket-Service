package main.java.movie;

import java.util.ArrayList;
import java.util.List;

import static main.java.hall.Halls.*;

public class MoviesList {
    private List<Movie> movies = new ArrayList();

    public List cinemaOneList() {
        movies.add(new Movie("Batman", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(10.00, 12.00), 100));
        movies.add(new Movie("Ironman", hallTwo, "Translated", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 100));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 100));
        movies.add(new Movie("The Godfather", hallOne, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(12.00, 14.00), 80));
        movies.add(new Movie("Gravity", hallTwo, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(12.00, 14.00), 80));
        movies.add(new Movie("Ratatouille", hallThree, "Original", MovieStatus.AVAILABLE, Genres.FAMILY, new Movie.Duration(12.00, 14.00), 80));
        movies.add(new Movie("Manchester by the Sea", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(14.00, 16.00), 75));
        movies.add(new Movie("Toy Story", hallTwo, "Original", MovieStatus.PREMIER, Genres.FAMILY, new Movie.Duration(14.00, 16.00), 75));
        movies.add(new Movie("Dunkirk", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(14.00, 16.00), 75));
        movies.add(new Movie("Taxi Driver", hallOne, "Original", MovieStatus.AVAILABLE, Genres.COMEDY, new Movie.Duration(16.00, 18.00), 95));
        movies.add(new Movie("Batman 2", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(16.00, 18.00), 95));
        movies.add(new Movie("Star Wars: Episode VIII - The Last Jedi", hallThree, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(16.00, 18.00), 95));
        movies.add(new Movie("Street Fight", hallOne, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(18.00, 20.00), 80));
        movies.add(new Movie("El Dorado", hallTwo, "Original", MovieStatus.AVAILABLE, Genres.STORY, new Movie.Duration(18.00, 20.00), 80));
        movies.add(new Movie("The Godfather 2", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(18.00, 20.00), 80));
        movies.add(new Movie("Batman", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(20.00, 22.00), 100));
        movies.add(new Movie("Ironman", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 100));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 100));
        movies.add(new Movie("Girlhood", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(22.00, 00.00), 90));
        movies.add(new Movie("The Bourne Ultimatum", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(22.00, 00.00), 90));
        movies.add(new Movie("Schindler's List", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(22.00, 00.00), 90));
        return movies;
    }

    public List cinemaTwoList() {
        movies.add(new Movie("Mad Max: Fury Road", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(10.00, 12.00), 100));
        movies.add(new Movie("The Truman Show", hallTwo, "Translated", MovieStatus.PREMIER, Genres.COMEDY, new Movie.Duration(10.00, 12.00), 100));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 95));
        movies.add(new Movie("The Godfather", hallOne, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(12.00, 14.00), 85));
        movies.add(new Movie("Gravity", hallTwo, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(12.00, 14.00), 85));
        movies.add(new Movie("Ratatouille", hallThree, "Original", MovieStatus.AVAILABLE, Genres.FAMILY, new Movie.Duration(12.00, 14.00), 120));
        movies.add(new Movie("Manchester by the Sea", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(14.00, 16.00), 90));
        movies.add(new Movie("Toy Story", hallTwo, "Original", MovieStatus.PREMIER, Genres.FAMILY, new Movie.Duration(14.00, 16.00), 100));
        movies.add(new Movie("Dunkirk", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(14.00, 16.00), 110));
        movies.add(new Movie("Taxi Driver", hallOne, "Original", MovieStatus.AVAILABLE, Genres.COMEDY, new Movie.Duration(16.00, 18.00), 50));
        movies.add(new Movie("Batman 2", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(16.00, 18.00), 90));
        movies.add(new Movie("Star Wars: Episode VIII - The Last Jedi", hallThree, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(16.00, 18.00), 100));
        movies.add(new Movie("Street Fight", hallOne, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(18.00, 20.00), 85));
        movies.add(new Movie("El Dorado", hallTwo, "Original", MovieStatus.AVAILABLE, Genres.STORY, new Movie.Duration(18.00, 20.00), 70));
        movies.add(new Movie("The Godfather 2", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(18.00, 20.00), 105));
        movies.add(new Movie("Dunkirk", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(20.00, 22.00), 100));
        movies.add(new Movie("Ironman", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 60));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 120));
        movies.add(new Movie("Girlhood", hallOne, "Translated", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(22.00, 00.00), 95));
        movies.add(new Movie("The Bourne Ultimatum", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(22.00, 00.00), 80));
        movies.add(new Movie("Schindler's List", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(22.00, 00.00), 90));
        return movies;

    }

    public List cinemaThreeList() {
        movies.add(new Movie("Batman", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(10.00, 12.00), 90));
        movies.add(new Movie("Ironman", hallTwo, "Translated", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 95));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(10.00, 12.00), 1200));
        movies.add(new Movie("The Godfather", hallOne, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(12.00, 14.00), 85));
        movies.add(new Movie("Gravity", hallTwo, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(12.00, 14.00), 90));
        movies.add(new Movie("Ratatouille", hallThree, "Original", MovieStatus.AVAILABLE, Genres.FAMILY, new Movie.Duration(12.00, 14.00), 110));
        movies.add(new Movie("Manchester by the Sea", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(14.00, 16.00), 80));
        movies.add(new Movie("Toy Story", hallTwo, "Original", MovieStatus.PREMIER, Genres.FAMILY, new Movie.Duration(14.00, 16.00), 80));
        movies.add(new Movie("Dunkirk", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(14.00, 16.00), 110));
        movies.add(new Movie("Taxi Driver", hallOne, "Original", MovieStatus.AVAILABLE, Genres.COMEDY, new Movie.Duration(16.00, 18.00), 70));
        movies.add(new Movie("Batman 2", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(16.00, 18.00), 85));
        movies.add(new Movie("Star Wars: Episode VIII - The Last Jedi", hallThree, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(16.00, 18.00), 115));
        movies.add(new Movie("Street Fight", hallOne, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(18.00, 20.00), 50));
        movies.add(new Movie("El Dorado", hallTwo, "Original", MovieStatus.AVAILABLE, Genres.STORY, new Movie.Duration(18.00, 20.00), 60));
        movies.add(new Movie("The Godfather 2", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(18.00, 20.00), 90));
        movies.add(new Movie("Batman", hallOne, "Original", MovieStatus.AVAILABLE, Genres.ACTION, new Movie.Duration(20.00, 22.00), 50));
        movies.add(new Movie("Ironman", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 70));
        movies.add(new Movie("Spiderman", hallThree, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(20.00, 22.00), 95));
        movies.add(new Movie("Girlhood", hallOne, "Original", MovieStatus.PRE_PREMIER, Genres.STORY, new Movie.Duration(22.00, 00.00), 60));
        movies.add(new Movie("The Bourne Ultimatum", hallTwo, "Original", MovieStatus.PREMIER, Genres.ACTION, new Movie.Duration(22.00, 00.00), 85));
        movies.add(new Movie("Schindler's List", hallThree, "Original", MovieStatus.AVAILABLE, Genres.THRILLER, new Movie.Duration(22.00, 00.00), 95));
        return movies;
    }


}
