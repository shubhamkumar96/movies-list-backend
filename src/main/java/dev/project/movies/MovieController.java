package dev.project.movies;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                     //  Annotation to map this class as Rest Controller
@RequestMapping("/api/v1/movies")   //  Annotation to map this Rest Controller to a particular End-point.
public class MovieController {

    @GetMapping
    public ResponseEntity<String> allMovies() {
        return new ResponseEntity<>("All Movies", HttpStatus.OK);
    }
}
