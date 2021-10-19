package inheritance;

import java.util.ArrayList;

public class Theater {
    private String name;
    private ArrayList<String> allMovies = new ArrayList<>();
    private ArrayList<Review> reviews = new ArrayList<>();

    public Theater(String name, int rate) {
        this.name = name;
    }

    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movieName) {
        allMovies.add(movieName);
    }

    public void removeMovie(String movieName) {
        allMovies.remove(movieName);
    }

    public void addReview(Review review) {
        int total = 0;
        if (review.getStarsNumberFromAuthor() < 0 || review.getStarsNumberFromAuthor() > 5) {
            System.out.println("Sorry (*_*) " + review.getStarsNumberFromAuthor() + " Invalid Stars Rate Number --> it's should be between 0 and 5, So it ");
        } else {
            Review newReview = new Review(review.getBody(), review.getAuthor(), review.getStarsNumberFromAuthor(), review.getMovieName());
            reviews.add(newReview);
        }
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", allMovies=" + allMovies +
                ", reviews=" + reviews +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getAllMovies() {
        return allMovies;
    }

    public void setAllMovies(ArrayList<String> allMovies) {
        this.allMovies = allMovies;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
}
