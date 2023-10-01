package dev.project.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

//  "Document" annotation let the Spring framework know that the given class represents each Documents in the Collection of MongoDB Database.
//  If the denoted(like, "movies" here) collection is not present in the given MongoDB database, then the Spring framework will automatically create the collection.
@Document(collection = "movies")
@Data                               //  This is lombok annotation to generate the Getters & Setters for each field in the Given Class.
@NoArgsConstructor                  //  This is lombok annotation to generate Constructor with No Argument.
@AllArgsConstructor                 //  This is lombok annotation to generate Constructor with All fields as Argument.
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    //  Below annotation will make the Database to store only the Ids of the Review Object in the Movie Object, and keep the Review Object in separate Collection.
    //  This is called 'Manual Reference Relationship'. There are also some other ways to create relationships in MongoDB.
    //  If we don't use this annotation, then there will be an 'Embedded Relationship', and so all the related Reviews will be added in the list of reviews.
    //  which is fine in case of modelling one-to-many relationship.
    @DocumentReference
    private List<Review> reviewIds;
}
