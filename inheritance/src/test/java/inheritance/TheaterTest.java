package inheritance;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TheaterTest {

  Theater testTheater;
  @Before
  public void setUp() {
    testTheater = new Theater("AMC", 3);
  }
  @Test public void testToString() {
    assertEquals("Should print out a string match.", "Theater: AMC \n Stars: 3",
        testTheater.toString());
  }

  @Test public void testAddMovie() {
    testTheater.addMovie("a movie");
    assertEquals("Should add a movie", "[a movie]", testTheater.getMovies().toString());
  }

  @Test public void testRemoveMovie() {
    testTheater.addMovie("a movie");
    testTheater.removeMovie("a movie");
    assertFalse("Should remove a movie", testTheater.movies.contains("a movie"));
  }

  @Test public void testAddReview(){
    Review testReview = new Review("Movie sucks!", "Nhu", 3, testTheater);
    assertEquals("Should update the stars from 5 to 3", 3, testTheater.stars);
  }

  @Test public void testAddReview_avg_stars() {
    Review testReview = new Review("Movie sucks!", "Nhu", 3, testTheater);
    Review testReview2 = new Review("It's okayyy", "Doug", 1, testTheater);
    assertEquals("Should update the stars from 2 to 3", 2, testTheater.stars);
  }
}
