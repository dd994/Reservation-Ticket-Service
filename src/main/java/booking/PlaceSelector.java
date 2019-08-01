package main.java.booking;

import main.java.cinema.Cinema;
import main.java.cinema.CinemaChoicer;
import main.java.hall.HallType;
import main.java.hall.PlaceType;

public class PlaceSelector {
    private String interplay = "First - enter the number of  you place, second -  enter  number , the type of place: 1 - NORMAL, 2 - PREMIUM, 3 - VIP";

    public void interplay() {
        System.out.println(interplay);
    }


    public void takeThePlace(int place, PlaceType type) {
        System.out.println("You selected place " + place + " type " + type);

    }


    public PlaceType typeSwitcher(int number) {
        PlaceType type = null;
        if (number > 0 && number <= 3) {
            switch (number) {
                case (1):
                    type = PlaceType.NORMAL;
                    break;
                case (2):
                    type = PlaceType.PREMIUM;
                    break;
                case (3):
                    type = PlaceType.VIP;
                    break;
            }
        } else System.out.println("You enter wrong number");
            return type;
    }
}
