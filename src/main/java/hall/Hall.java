package main.java.hall;

public class Hall  {
private int hallNumber;
private int placesAmount;
private HallType level;

public Hall(int hallNumber, int placesAmount, HallType level) {
        this.hallNumber = hallNumber;
        this.placesAmount = placesAmount;
        this.level = level;
        }

public int getHallNumber() {
        return hallNumber;
        }

public void setHallNumber(int hallNumber) {
        this.hallNumber = hallNumber;
        }

public int getPlacesAmount() {
        return placesAmount;
        }

public void setPlacesAmount(int placesAmount) {
        this.placesAmount = placesAmount;
        }

public HallType getLevel() {
        return level;
        }

public void setLevel(HallType level) {
        this.level = level;
        }



//        }


}

//3.	Hall: number, amount of places, type of place(normal, premium, vip),