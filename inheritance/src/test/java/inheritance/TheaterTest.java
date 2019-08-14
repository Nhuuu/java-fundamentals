package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {

  Theater testTheater;
  @Before
  public void setUp() throws Exception {
    Theater testTheater = new Theater("AMC", 3);
  }
  @Test public void testToString() {
    assertEquals("Should print out a string match.", "Theater: AMC \n Price: 5 \n Stars: 3",
        testTheater.toString());
  }

  @Test public void testAddMovie() {
    assertEquals("a movie", testTheater.getMovies());
  }

//
//  @Test public void testRemoveMovie() {
//
//  }

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
