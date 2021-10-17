package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {
    @Test public void toStringTestRestaurant(){
        Restaurant restaurant =new Restaurant("Kabab",5,20);
        assertEquals("Restaurant{name='Kabab', stars=5, price=$20, reviews=[]}",restaurant.toString());
        assertEquals("Kabab",restaurant.getName());
        assertEquals(5,restaurant.getStars());
        assertEquals(20,restaurant.getPrice());
    }

    @Test public  void  RestaurantTestAddReview(){
        Restaurant restaurant = new Restaurant("KFC", 5,15);
        //Adding review to the restaurant
        Review review=new Review("I love burger","Ali",1);
        restaurant.addReview(review);
        assertEquals("Ali", restaurant.getReviews().get(0).getAuthor());
        assertEquals("I love burger", restaurant.getReviews().get(0).getBody());
        assertEquals(3, restaurant.getStars());
    }

}
