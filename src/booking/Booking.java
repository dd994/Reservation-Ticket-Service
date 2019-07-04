package booking;

import java.time.LocalDate;

public class Booking {
    private LocalDate date;
    private String status;
    private String bookedMovies;
    private  double amount;

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
}

//5.	Booking - booked date, payment status (paid, unpaid), booked movies, amount,
