package com.codeclan.movies;

/**
 * Created by user on 14/03/2017.
 */

public class Movie {

        private String title;
        private String genre;
        private int currentRanking;

        public Movie(String title, String genre, int currentRanking) {
            this.title = title;
            this.genre = genre;
            this.currentRanking = currentRanking;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getCurrentRanking() {
            return currentRanking;
        }

        public void setCurrentRanking(int currentRanking) {
            this.currentRanking = currentRanking;
        }

        @Override
        public String toString(){
            return  "Title: " + this.title + ", Genre: " + this.genre + ", Ranking: " + this.currentRanking;
        }




    }




