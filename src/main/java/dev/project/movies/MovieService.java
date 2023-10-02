package dev.project.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//  This is the "Service-Layer" for our API, this is where most of our Business logic goes.
//  "Service Class" uses the "Repository Class", and talks to the Database, and do the required operations, like Getting or Posting the data.
@Service
public class MovieService {
    @Autowired                                  //  This Annotation tells the framework to Instantiate the mentioned class.
    private MovieRepository movieRepository;    //  We will need reference of this repository, inside this Service class.
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    //  "findMovieByImdbId()" method can also return 'null' in case when there is no any movie with that 'imdbId'. So
    //  to handle that case, we use "Optional<Movie>" as the return type for below method.
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
