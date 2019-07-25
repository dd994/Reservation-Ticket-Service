package main.java.cinema;

import java.util.List;

public class Cinema {
    private String name;
    private String adress;
    private List movieList;
    private double rating;

    public Cinema(String name, String adress, List movieList, double rating) {
        this.name = name;
        this.adress = adress;
        this.movieList = movieList;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public List getMovieList() {
        return movieList;
    }

    public void setMovieList(List movieList) {
        this.movieList = movieList;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", movieList=" + movieList +
                ", rating=" + rating +
                '}';
    }
}
//2.	Cinema - name, Address, rating, list of movies