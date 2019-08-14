package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

  Restaurant testRestaurant;
  Review testReview;
  @Before
  public void setUp() throws Exception {
    testRestaurant = new Restaurant("Little Uncle", 5, 1);
    testReview = new Review("So good!", "Nhu", 2, testRestaurant);
  }

  @Test public void testToString() {
    assertEquals("Restaurant: Little Uncle, price: $", testRestaurant.toString());
  }

  @Test public void testAddReview(){
    testRestaurant.addReview(testReview);
    assertEquals("Should update the stars from 5 to 2", 2, testRestaurant.stars);
  }

}
