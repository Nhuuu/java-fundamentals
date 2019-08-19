package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieReviewTest {

    Theater testTheater;
    @Before
    public void setUp() throws Exception {
      testTheater = new Theater("AMC", 2);
    }
    @Test
    public void testToString() {
      MovieReview testMovieReview = new MovieReview("So good!", "Nhu", 5, testTheater, "a movie");
      assertEquals("A review of Theater: AMC \n" +
          " Stars: 5 \n Movie: 'a movie' by Nhu: 'So good!'", testMovieReview.toString());
    }

    @Test
    public void testMovieReview_no_movie() {
      MovieReview testMovieReview = new MovieReview("So good!", "Nhu", 5, testTheater);
      assertEquals("A review of Theater: AMC \n" +
          " Stars: 5 \n Movie: 'N/A' by Nhu: 'So good!'", testMovieReview.toString());
    }
}
