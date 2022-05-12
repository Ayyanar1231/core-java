package com.chainsys.variables;

public class Movie {
	private String movieName;
    private int yearOfReleaseDate;
    private String heroName;
    private String heroinName;
   
    
    public String getMovieName() 
    {
            return movieName;
    }
    public void setMovieName(String movieName) 
    {
            this.movieName = movieName;
    }
    public int getYearOfReleaseDate() 
    {
            return yearOfReleaseDate;
    }
    public void setYearOfReleaseDate(int yearOfReleaseDate) 
    {
            this.yearOfReleaseDate = yearOfReleaseDate;
    }
    public String getHeroName() {
            return heroName;
    }
    public void setHeroName(String heroName) {
            this.heroName = heroName;
    }
    
    public String getHeroinName() {
            return heroinName;
    }
    public void setHeroinName(String heroinName) {
            this.heroinName = heroinName;
    }
}
