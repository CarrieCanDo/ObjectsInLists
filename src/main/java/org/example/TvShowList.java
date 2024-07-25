package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TvShowList {

    public static void main(String[] args) {
        // Create a list to store TvShow objects
        List<TvShow> tvShows = new ArrayList<>();

        // Instantiate Scanner to scan text from the user
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name of the show: ");
            String showName = scanner.nextLine();

            // Break the loop if the user enters nothing
            if (showName.isEmpty()) {
                break;
            }

            System.out.println("How many episodes? ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("What is the genre? ");
            String genre = scanner.nextLine();

            // Create TvShow object and add to the list
            TvShow tvShow = new TvShow(showName, numberOfEpisodes, genre);
            tvShows.add(tvShow);
        }

        System.out.println();
        // Print the list of TV shows using the toString method
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        // Close the scanner
        scanner.close();
    }
}

