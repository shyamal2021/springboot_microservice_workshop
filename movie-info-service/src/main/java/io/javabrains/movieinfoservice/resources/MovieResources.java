package io.javabrains.movieinfoservice.resources;

import io.javabrains.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieResources {

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo( @PathVariable("movieId") String movieId) {
        if (movieId == "1234")
            return new Movie(movieId ,"masan");
        else
            return new Movie(movieId ,"Three Idiot");

    }



}
