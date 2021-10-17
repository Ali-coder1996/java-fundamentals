package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private int price;
    private ArrayList<Review> reviews = new ArrayList<>();

    public Restaurant(String name, int stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
    }

    public void addReview(Review review) {
        if (review.getNumberOfStars() < 0 || review.getNumberOfStars() > 5) {
            System.out.println("Sorry "+review.getNumberOfStars() + " Stars Number Not valid --> it's should be between 0 and 5, So it ");
        }else {
            Review newReview = new Review(review.getBody(), review.getAuthor(), review.getNumberOfStars());
            reviews.add(newReview);
            this.stars = (review.getNumberOfStars() + this.stars) / 2;
        }
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", price=$" + price +
                ", reviews=" + reviews +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
