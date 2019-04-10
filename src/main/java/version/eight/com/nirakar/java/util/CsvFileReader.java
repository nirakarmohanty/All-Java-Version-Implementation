package com.nirakar.java.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


public class CsvFileReader {
	public static void main(String[] args) {
		List<Movie> listofMovies = new ArrayList<Movie>();
		CsvFileReader obj = new CsvFileReader();
		obj.parseCsvFile(listofMovies);
		System.out.println(listofMovies.size());

	}

	public void parseCsvFile(List<Movie> listofMovie) {
		String csvFile = "/src/main/resources/lambda/TheMovieExcelList.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {
			ClassLoader classLoader = getClass().getClassLoader();
			// Getting resource(File) from class loader
			File configFile = new File(classLoader.getResource("TheMovieExcelList.csv").getFile());
			SimpleDateFormat sDateFormat = new SimpleDateFormat("dd/MM/YYYY");
			br = new BufferedReader(new FileReader(configFile));
			while ((line = br.readLine()) != null) {
				Movie movie = new Movie();
				// use comma as separator
				String[] movieArray = line.split(cvsSplitBy);

				movie.setRank(Integer.parseInt(movieArray[0]));
				movie.setYear(Integer.parseInt(movieArray[1]));
				movie.setTitle(movieArray[2]);
				movie.setDirectors(movieArray[3]);
				movie.setGenrs(movieArray[4]);
				movie.setNo_of_votes(Integer.parseInt(movieArray[5]));
				movie.setRuntime_duration(Integer.parseInt(movieArray[6]));
				movie.setRelease_date(sDateFormat.parse(movieArray[7]));
				movie.setImdb_rating(new BigDecimal(movieArray[9]).intValue());
				movie.setTitle_type(movieArray[8]);
				movie.setUrl_const(movieArray[10]);
				movie.setUrl(movieArray[11]);

				// System.out.println(movieArray);
				listofMovie.add(movie);
				//System.out.println(listofMovie.size());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
}
