package dev.project.movies;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//  "Repository Layer" is kind of a Data-Access-Layer for our API, that talks to the database & gets the data.
@Repository     //  This annotation lets the Framework know that this is a Repository class.
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
}
