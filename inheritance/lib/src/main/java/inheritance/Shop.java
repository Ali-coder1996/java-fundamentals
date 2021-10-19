package inheritance;

import java.util.ArrayList;

public class Shop {
    private String shopName;
    private String description;
    private double numberOfDollarSigns;
    private ArrayList<Review> reviews = new ArrayList<>();


    public Shop(String shopName, String description, double numberOfDollarSigns) {
        this.shopName = shopName;
        this.description = description;
        this.numberOfDollarSigns = numberOfDollarSigns;
    }
    public void addReview(Review review) {
            Review newReview = new Review(review.getBody(), review.getAuthor(), review.getStarsNumberFromAuthor());
            reviews.add(newReview);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopName='" + shopName + '\'' +
                ", description='" + description + '\'' +
                ", numberOfDollarSigns=" + numberOfDollarSigns +
                ", reviews=" + reviews +
                '}';
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNumberOfDollarSigns() {
        return numberOfDollarSigns;
    }

    public void setNumberOfDollarSigns(double numberOfDollarSigns) {
        this.numberOfDollarSigns = numberOfDollarSigns;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
}


