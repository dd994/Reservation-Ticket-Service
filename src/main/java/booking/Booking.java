package main.java.booking;

import java.time.LocalDate;

public class Booking {
    private LocalDate date;
    private String status;
    private String bookedMovies;
    private  double amount;

    public Booking(LocalDate date, String status, String bookedMovies, double amount) {
        this.date = date;
        this.status = status;
        this.bookedMovies = bookedMovies;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBookedMovies() {
        return bookedMovies;
    }

    public void setBookedMovies(String bookedMovies) {
        this.bookedMovies = bookedMovies;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public Booking booking(){


        return  booking();
    }
}

//5.	Booking - booked date, payment status (paid, unpaid), booked movies, amount,
