package main.java.cinema;

import main.java.movie.MoviesList;

import java.util.ArrayList;
import java.util.List;


public class CinemaList {
    private Cinema cinemaOne = new Cinema("MostKino", "Dnipro, Glinky 2", new MoviesList().cinemaOneMovieList(), 4);
    private Cinema cinemaTwo = new Cinema("Multiplex", "Dnipro, bul. Zorianiy 1", new MoviesList().cinemaTwoMovieList(), 5);
    private Cinema cinemaThree = new Cinema("Karavan", "Dnipro, Donetske sh., 10", new MoviesList().cinemaThreeMovieList(), 4);

    public Cinema getCinemaOne() {
        return cinemaOne;
    }

    public Cinema getCinemaTwo() {
        return cinemaTwo;
    }

    public Cinema getCinemaThree() {
        return cinemaThree;
    }

    public List<Cinema> getCinemaList() {
        List<Cinema> cinemaList = new ArrayList<>();
        cinemaList.add(cinemaOne);
        cinemaList.add(cinemaTwo);
        cinemaList.add(cinemaThree);
        return cinemaList;
    }
}
