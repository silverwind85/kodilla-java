package com.kodilla.good.patterns.challenges;

public class MoviesStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        movieStore.displayMovies(movieStore.getMovies());
    }
}
