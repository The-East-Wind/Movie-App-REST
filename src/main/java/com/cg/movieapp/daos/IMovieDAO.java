package com.cg.movieapp.daos;

import com.cg.movieapp.entities.Movie;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IMovieDAO extends CrudRepository<Movie,String> {
    List<Movie> findMovieByGenre(String genre);
}
