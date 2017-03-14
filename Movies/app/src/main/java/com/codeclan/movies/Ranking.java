package com.codeclan.movies;

import java.util.ArrayList;

/**
 * Created by user on 14/03/2017.
 */

public class Ranking {

    private ArrayList<Movie> movies;

    public Ranking(){
        movies = new ArrayList<Movie>();
        setupMovies();

    }

    public void setupMovies(){
        Movie[]addMovies = {
                new Movie("Wedding Crashers", "comedy",1),
                new Movie("Jaws", "horror", 2),
                new Movie("Jaws2","Horror",3),
                new Movie("Jaws3","Horror",4),
                new Movie("Animal house","Comedy", 5),
                new Movie("Anchorman","comdey", 6),
                new Movie("Anchorman 2", "comedy", 7),
                new Movie("Tomb Raider", "Action", 8),
                new Movie("The Accountant", "Action", 9),
                new Movie("Land before time", "childrens", 10)
        };

        for(Movie movie: addMovies)
            movies.add(movie);

    }


        public String getMovieAtIndex(int index){
            Movie result = movies.get(index);
            return result.getTitle() ;
        }

        public String getMovieRank(int currentRanking){
            for(Movie movie : movies)
                if(movie.getCurrentRanking() ==(currentRanking)){
                    return movie.getTitle();
                }
                return null;
        }

        public String lastMovie(){
            int listSize = getLength();
            String selectedMovie = getMovieAtIndex(listSize -1);
            return selectedMovie;
        }

        public int getLength(){
            return movies.size();
        }

        public void removeLastMovie(){
            int listSize = getLength();
            movies.remove(listSize -1);
        }

        public void replaceMovie(){
            removeLastMovie();
            Movie anotherMovie = new Movie("The Avengers", "Action",10);
            movies.add(anotherMovie);
        }

//        public String getMovieByTitle(String title){
//            for(Movie movie : movies)
//                if(movie.getTitle() == (title));
//            return movie.getGenre();
//        }

    }






