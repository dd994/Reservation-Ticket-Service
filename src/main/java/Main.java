package main.java;

import main.java.booking.Booking;
import main.java.booking.PlaceSelector;
import main.java.cinema.CinemaChoicer;
import main.java.cinema.CinemaOperations;
import main.java.hall.HallPlaces;
import main.java.hall.HallType;
import main.java.hall.PlaceType;
import main.java.movie.Genres;
import main.java.movie.Movie;
import main.java.movie.MovieSearch;
import main.java.ordering.OrderInfo;


import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Thread thread = new Thread();
        OrderInfo orderInfo = new OrderInfo(0, null);
        //instances
        Scanner scan = new Scanner(System.in);
        Booking booking;

        // ===========logic========= //

        //start
        System.out.println("Welcome to reservation ticket service");
        System.out.println("Please choice you cinema by number");
        System.out.println("1 - MostCinema; 2 - Multiplex; 3 - 21th Century Cinema");


        //choice the cinema
        CinemaChoicer cinemaChoicer = new CinemaChoicer();
        cinemaChoicer.choice = scan.nextInt() - 1;
        cinemaChoicer.choiceTheCinema();
        System.out.println("Your choice is a cinema: " + cinemaChoicer.choiceTheCinema().getName() + ", by address: " + cinemaChoicer.choiceTheCinema().getAdress());


        //print the movie list
        System.out.println("If you want to see this  list  of movies - press any key");
        System.in.read();
        cinemaChoicer.moviesOfSelectedCinema();


        // choice the way of movie searching
        MovieSearch movieSearch = new MovieSearch();
        System.out.println(movieSearch.searchMovieByCategory(Genres.COMEDY));
//        System.out.println(movieSearch.searchMovieByRating(4.7));


        //places visualisation
        HallPlaces hallPlaces = new HallPlaces();
        System.out.println("Please, check your places");
        hallPlaces.printPlaces(hallPlaces.getPlaces100());


        // selecting the place
        PlaceSelector placeSelector = new PlaceSelector();
        placeSelector.interplay();


        int place = scan.nextInt();
        PlaceType type = placeSelector.typeSwitcher(scan.nextInt());
        placeSelector.takeThePlace(place, type);

        System.out.println("You can choice one more ticket");
        orderInfo.setPlace(place);
        orderInfo.setType(type);
        hallPlaces.printAfterOrder(hallPlaces.getPlaces100(), place);
        System.out.println("To continue booking - press q");
        String q = scan.nextLine();


        //booking
//        booking = new Booking(LocalDate.now(),"Unpaid",)
    }

    // =============END============ //
}

