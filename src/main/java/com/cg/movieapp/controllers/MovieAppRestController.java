package com.cg.movieapp.controllers;

import com.cg.movieapp.entities.Movie;
import com.cg.movieapp.services.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieAppRestController {
    @Autowired
    private IMovieService movieService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(
            value = "/movies",
            headers = "Accept=application/json",
            produces = "application/json")
    @ResponseBody
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(
            value= "/movies/{genre}",
            headers = "Accept=application/json",
            produces = "application/json"
    )
    @ResponseBody
    public List<Movie> getMovieInGenre(@PathVariable("genre") String genre){
        return movieService.getMovieOfGenre(genre);
    }
    @CrossOrigin("http://localhost:4200")
    @PostMapping(
            value="/movies/new",
            headers = "Accept=application/json",
            produces = "application/json"
    )
    @ResponseBody
    public Movie addNewMovie(@RequestBody() Movie newMovie){
        return movieService.addNewMovie(newMovie);
    }
}
