package com.einfo.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Movie {

	@Id
	@GeneratedValue
	private int movieId;
	private String movieName;
	private String director;
	private String lanuage;
	
	public Movie()
	{
		
	}
	public Movie(int movieId,  String director,String lanuage,String movieName ) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.director = director;
		this.lanuage = lanuage;
	}
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanuage() {
		return lanuage;
	}
	public void setLanuage(String lanuage) {
		this.lanuage = lanuage;
	}
	
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", director=" + director + ", lanuage="
				+ lanuage + "]";
	}
	
}
