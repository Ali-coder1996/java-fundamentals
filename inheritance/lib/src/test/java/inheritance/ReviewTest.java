package inheritance;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void reviewTestToString(){
        Review review = new Review("I love burger","Ali",5);
        assertEquals("Review{body='I love burger', author='Ali', starsNumberFromAuthor=5}",review.toString());
        assertEquals("I love burger",review.getBody());
        assertEquals("Ali",review.getAuthor());
        assertEquals(5,review.getStarsNumberFromAuthor());
    }
}
