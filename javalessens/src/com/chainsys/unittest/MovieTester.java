package com.chainsys.unittest;

import com.chainsys.variables.Movie;

public class MovieTester {
	public static void testMovie() {
		Movie firstMovie = new Movie();
		firstMovie.setMovieName("Beast");
		firstMovie.setYearOfReleaseDate(2022);
		firstMovie.setHeroName("Thalapathy Vijay");
		firstMovie.setHeroinName("Sree Dhivya");
		System.out.println(firstMovie.getMovieName());
		System.out.println(firstMovie.getYearOfReleaseDate());
		System.out.println(firstMovie.getHeroName());
		System.out.println(firstMovie.getHeroinName());
	}
}
