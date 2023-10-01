package dev.project.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//  This is the "Service-Layer" for our API, this is where most of our Business logic goes.
//  "Service Class" uses the "Repository Class", and talks to the Database, and do the required operations, like Getting or Posting the data.
@Service
public class MovieService {
    @Autowired                                  //  This Annotation tells the framework to Instantiate the mentioned class.
    private MovieRepository movieRepository;    //  We will need reference of this repository, inside this Service class.
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
}
