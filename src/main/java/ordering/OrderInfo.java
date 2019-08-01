package main.java.ordering;

import main.java.hall.PlaceType;

public class OrderInfo {
    private int place;
    private PlaceType type;

    public OrderInfo(int place, PlaceType type) {
        this.place = place;
        this.type = type;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public PlaceType getType() {
        return type;
    }

    public void setType(PlaceType type) {
        this.type = type;
    }
}
