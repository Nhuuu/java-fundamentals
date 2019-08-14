package inheritance;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

  Shop testShop;
  @Before
  public void setUp() throws Exception {
    testShop = new Shop("Shop", 5, 1, "We sell things");
  }

  @Test
  public void testToString(){
    assertEquals("Should print out a string", "Shop: Shop \n Description: We sell things \n Price: 5 \n Stars: 1",
        testShop.toString());
  }

  @Test public void testAddReview(){
    Review testReview = new Review("I like it here!", "Nhu", 3, testShop);
    assertEquals("Should update the stars from 5 to 3", 3, testShop.stars);
  }

  @Test public void testAddReview_avg_stars(){
    Review testReview = new Review("I like it here!", "Nhu", 3, testShop);
    Review testReview2 = new Review("It's okayyy", "Doug", 1, testShop);
    assertEquals("Should update the stars from 2 to 3", 2, testShop.stars);
  }

}
