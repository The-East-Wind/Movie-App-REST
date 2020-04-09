package com.cg.movieapp.services;

import com.cg.movieapp.daos.IMovieDAO;
import com.cg.movieapp.entities.Movie;
import com.cg.movieapp.exceptions.MovieNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements IMovieService {
    @Autowired
    private IMovieDAO movieDAO;
    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>)movieDAO.findAll();
    }

    @Override
    public Movie getMovieWithName(String movieName) throws MovieNotFoundException {
        Optional<Movie> movieWithName = movieDAO.findById(movieName);
        if(!movieWithName.isPresent()){
            throw new MovieNotFoundException("No movie exists with name "+movieName+".");
        }
        return movieWithName.get();
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @Override
    public Movie addNewMovie(Movie newMovie){
        newMovie = movieDAO.save(newMovie);
        return newMovie;
    }

    @Override
    public List<Movie> getMovieOfGenre(String genre) {
        return movieDAO.findMovieByGenre(genre);
    }
}
