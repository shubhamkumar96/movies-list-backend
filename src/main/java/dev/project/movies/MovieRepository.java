package dev.project.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//  "Repository Layer" is kind of a Data-Access-Layer for our API, that talks to the database & gets the data.
@Repository     //  This annotation lets the Framework know that this is a Repository class.
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    //  Although the Repository comes with In-Built methods for searching with 'Id' (ObjectId), it doesn't have methods
    //  to search with other property names. So we will need to implement those methods our-self. And this is easy,
    //  because there is 'Automatic Queries', which we can use to dynamically form Queries based on property names.
    Optional<Movie> findMovieByImdbId(String imdbId);
    //  Just by naming above method "findMovieByImdbId", Spring data MongoDB will understand what we are trying to do.
}
