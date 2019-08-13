package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

  Restaurant testRestaurant;
  @Before
  public void setUp() throws Exception {
    testRestaurant = new Restaurant("Little Uncle", 5, "$");
  }
  @Test public void testToString() {
    assertEquals("Restaurant: Little Uncle, price: $", testRestaurant.toString());
  }
}
