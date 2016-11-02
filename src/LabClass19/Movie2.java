/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabClass19;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author linhdo
 */
public class Movie2 implements Comparable<Movie2>{
    private String title;
    private String director;
    private String movieID;

    public Movie2() {
    }

    public Movie2(String title, String director, String movieID) {
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
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.movieID);
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
        final Movie2 other = (Movie2) obj;
        if (!Objects.equals(this.movieID, other.movieID)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Movie2{" + "title=" + title + ", director=" + director + ", movieID=" + movieID + '}';
    }

    @Override
    public int compareTo(Movie2 o) {
        return new CompareToBuilder()
               .append(this.movieID, o.movieID)
               .toComparison();
    }

    
    
    

}
