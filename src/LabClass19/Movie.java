package LabClass19;

import common.*;
import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie  implements Comparable{
    private String title;
    private String director;
    private String movieID;

    public Movie() {
    }

    public Movie(String title, String director, String movieID) {
        this.title = title;
        this.director = director;
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMovieID() {
        return movieID;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.movieID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.movieID, other.movieID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie{" + "title=" + title + ", director=" + director + ", movieID=" + movieID + '}';
    }

    @Override
    public int compareTo(Object other) {
       Movie o = (Movie)other;
        
        // Using a utility from Apache Commons
        return new CompareToBuilder()
               .append(this.movieID, o.movieID)
               .toComparison();
    }

   
    

}
