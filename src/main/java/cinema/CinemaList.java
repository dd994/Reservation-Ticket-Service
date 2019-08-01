package main.java.cinema;

import main.java.movie.MoviesList;

import java.util.ArrayList;
import java.util.List;


public class CinemaList {
    private Cinema cinemaOne = new Cinema("MostCinema", "Dnipro, Glinky st., b.2", new MoviesList().cinemaOneMovieList(), 4);
    private Cinema cinemaTwo = new Cinema("Multiplex", "Dnipro, bul. Zorianiy, b.1", new MoviesList().cinemaTwoMovieList(), 5);
    private Cinema cinemaThree = new Cinema("21th Century Cinema", "Dnipro, Donetske sh., b.10", new MoviesList().cinemaThreeMovieList(), 4);

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
