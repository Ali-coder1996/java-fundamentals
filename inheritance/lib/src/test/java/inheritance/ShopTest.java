package inheritance;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {
    @Test public void testShop(){
        Shop shop=new Shop("Lucky", "toys store", 50);
        assertEquals("Shop{shopName='Lucky', description='toys store', numberOfDollarSigns=50.0, reviews=[]}",shop.toString());
        Review review=new Review("good toys", "Ali", 2);
        shop.addReview(review);
        assertEquals("good toys",shop.getReviews().get(0).getBody());
        assertEquals("Ali",shop.getReviews().get(0).getAuthor());
        assertEquals(2,shop.getReviews().get(0).getStarsNumberFromAuthor());

    }
}
