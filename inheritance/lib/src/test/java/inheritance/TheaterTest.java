package inheritance;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test public void testTheater(){
        Theater theater=new Theater("Castro Theatre");
        assertEquals("Castro Theatre",theater.getName());
        assertEquals("Theater{name='Castro Theatre', allMovies=[], reviews=[]}",theater.toString());

        //add review
        Review review =new Review("nice movie","ALi",5,"The exam 2009");
        theater.addReview(review);
        assertEquals("Theater{name='Castro Theatre', allMovies=[], reviews=[Review{body='nice movie', author='ALi', starsNumberFromAuthor=5}]}",theater.toString());

        //add movies
        theater.addMovie("mad max");
        theater.addMovie("super man");
        assertEquals("Theater{name='Castro Theatre', allMovies=[mad max, super man], reviews=[Review{body='nice movie', author='ALi', starsNumberFromAuthor=5}]}",theater.toString());

        //remove movies
        theater.removeMovie("mad max");
        assertEquals("Theater{name='Castro Theatre', allMovies=[super man], reviews=[Review{body='nice movie', author='ALi', starsNumberFromAuthor=5}]}",theater.toString());

    }
}
