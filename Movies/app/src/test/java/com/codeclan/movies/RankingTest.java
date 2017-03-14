package com.codeclan.movies;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class RankingTest {

    @Test
    public void testForMovies(){
        Ranking movies = new Ranking();
        assertEquals(10, movies.getLength());
    }

    @Test
    public void testGetMovieAtIndex(){
            Ranking movies = new Ranking();
            assertEquals("Wedding Crashers", movies.getMovieAtIndex(0));
        }

    @Test

    public void getLastMovie(){
        Ranking movies = new Ranking();
        assertEquals("Land before time", movies.lastMovie());
    }



    @Test
    public void testRemoveLastMovie() {
        Ranking movies = new Ranking();
        movies.removeLastMovie();
        assertEquals("The Accountant", movies.lastMovie());
    }

}