package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {

  Review testReview;
  @Before
  public void setUp() throws Exception {
    Restaurant restaurant = new Restaurant("Little Uncle", 5, "$");
    testReview = new Review("So good!", "Nhu", 5, restaurant);
  }
  @Test public void testToString() {
    assertEquals("Restaurant: Little Uncle, Price: $, Stars: 5 \n" +
        "Author: Nhu, Body: So good!", testReview.toString());
  }



}
