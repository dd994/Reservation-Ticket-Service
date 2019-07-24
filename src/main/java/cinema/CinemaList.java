package main.java.cinema;

import main.java.movie.MoviesList;

import java.util.ArrayList;
import java.util.List;

public class CinemaList {
    private List<Cinema> cinemaList = new ArrayList<>();
    private Cinema cinemaOne = new Cinema("MostKino", "Dnipro, Glinky 2", new MoviesList().cinemaOneList(), 4);
    private Cinema cinemaTwo = new Cinema("Multiplex", "Dnipro, bul. Zorianiy 1", new MoviesList().cinemaTwoList(), 5);
    private Cinema cinemaThree = new Cinema("Karavan", "Dnipro, Donetske sh., 10", new MoviesList().cinemaThreeList(), 4);

    public CinemaList() {
        cinemaList.add(cinemaOne);
        cinemaList.add(cinemaTwo);
        cinemaList.add(cinemaThree);
    }
}
