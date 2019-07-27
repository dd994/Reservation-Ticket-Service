package main.java.movie;

import main.java.hall.Hall;

public class Movie {
    private String name;
    private Hall roomNumber;
    private String movieType;
    private MovieStatus movieStatus;
    private Genres movieCategory;
    private Duration movieDuration;
    private double ticketPrice;
    private double movieRating;



    Movie(String movie, Hall roomNumber, String movieType, MovieStatus movieStatus, Genres movieCategory, Duration movieDuration, double ticketPrice, double movieRating) {
        this.name = movie;
        this.roomNumber = roomNumber;
        this.movieType = movieType;
        this.movieStatus = movieStatus;
        this.movieCategory = movieCategory;
        this.movieDuration = movieDuration;
        this.ticketPrice = ticketPrice;
        this.movieRating = movieRating;
    }

    public String getName() {
        return name;
    }

    public void setMovie(String movie) {
        this.name = movie;
    }

    public Hall getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Hall roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }

    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
    }

    public Duration getMovieDuration() {
        return movieDuration;
    }

    public void setMovieDuration(Duration movieDuration) {
        this.movieDuration = movieDuration;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Genres getMovieCategory() {
        return movieCategory;
    }

    public void setMovieCategory(Genres movieCategory) {
        this.movieCategory = movieCategory;
    }


    public double getMovieRating() {
        return movieRating;
    }


    static class Duration {
        private double from;
        private double to;

        Duration(double from, double to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            return "Duration{" +
                    "from=" + from +
                    ", to=" + to +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie='" + name + '\'' +
                ", roomNumber=" + roomNumber +
                ", movieType='" + movieType + '\'' +
                ", movieStatus=" + movieStatus +
                ", movieCategory=" + movieCategory +
                ", movieDuration=" + movieDuration +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}


//4.	Movie - name, number of room, type of main.java.movie(original, translated), status of main.java.movie(pre-premiere, premiere,  available), duration of main.java.movie show( from, to), price of ticket, category