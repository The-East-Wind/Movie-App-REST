package com.cg.movieapp.services;

import com.cg.movieapp.entities.Movie;
import com.cg.movieapp.exceptions.MovieNotFoundException;

import java.util.List;

public interface IMovieService {
    List<Movie> getAllMovies();
    Movie getMovieWithName(String movieName) throws MovieNotFoundException;
    Movie addNewMovie(Movie newMovie);
    List<Movie> getMovieOfGenre(String genre);
}
