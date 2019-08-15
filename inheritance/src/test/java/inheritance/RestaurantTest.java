package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

  Restaurant testRestaurant;
  @Before
  public void setUp() throws Exception {
    testRestaurant = new Restaurant("Little Uncle", 5, 1);
  }

  @Test public void testToString() {
    assertEquals("Restaurant: Little Uncle, Price: 5", testRestaurant.toString());
  }

  @Test public void testAddReview(){
    Review testReview = new Review("So good!", "Nhu", 2, testRestaurant);
    assertEquals("Should update the stars from 5 to 2", 2, testRestaurant.stars);
  }

  @Test public void testAddReview_avg_stars(){
    Review testReview = new Review("So good!", "Nhu", 2, testRestaurant);
    Review testReview2 = new Review("Yum!", "Doug", 4, testRestaurant);
    assertEquals("Should update the stars from 2 to 3", 3, testRestaurant.stars);
  }
}
