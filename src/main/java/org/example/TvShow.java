package org.example;

public class TvShow {
    private String showName;
    private int numberOfEpisodes;
    private String genre;

    // Constructor
    public TvShow(String showName, int numberOfEpisodes, String genre) {
        this.showName = showName;
        this.numberOfEpisodes = numberOfEpisodes;
        this.genre = genre;
    }

    // Getter for show name
    public String getShowName() {
        return showName;
    }

    // Getter for number of episodes
    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    // Getter for genre
    public String getGenre() {
        return genre;
    }

    // toString method
    @Override
    public String toString() {
        return "The name of the show is " + showName + " with " + numberOfEpisodes + " number of episodes. The genre is " + genre;
    }
}

