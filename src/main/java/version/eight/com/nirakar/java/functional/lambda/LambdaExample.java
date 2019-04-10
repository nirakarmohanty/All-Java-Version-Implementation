package com.nirakar.java.functional.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.nirakar.java.util.CsvFileReader;
import com.nirakar.java.util.Movie;

public class LambdaExample {

	public static void main(String[] args) {
		List<Movie> listOfMovie = new ArrayList<>();
		getFileList(listOfMovie);

		printMovieName(listOfMovie);

		printMovieNamesStartWithLetter(listOfMovie, "A");
	}

	private static void printMovieNamesStartWithLetter(List<Movie> listOfMovie,
			String string) {
		List<Movie> list = listOfMovie.stream().filter(movie -> {
			return movie.getTitle().startsWith(string);
		}).collect(Collectors.toList());

		list.forEach(action -> {
			System.out.println(action.getTitle());
		});
	}

	private static void printMovieName(List<Movie> listOfMovie) {

		listOfMovie.forEach(movie -> {
			System.out.print(movie.getTitle() + "\n");
		});

	}

	public static void getFileList(List<Movie> listOfMoviesObject) {
		CsvFileReader csvFileReader = new CsvFileReader();
		csvFileReader.parseCsvFile(listOfMoviesObject);
	}
}
