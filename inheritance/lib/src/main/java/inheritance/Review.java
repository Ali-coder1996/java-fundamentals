package inheritance;

public class Review {
    private String body;
    private String author;
    private int numberOfStarsFromAuthor;

    public Review(String body, String author, int numberOfStarsFromAuthor) {
        this.body = body;
        this.author = author;
        this.numberOfStarsFromAuthor = numberOfStarsFromAuthor;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", numberOfStars=" + numberOfStarsFromAuthor +
                '}';
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfStars() {
        return numberOfStarsFromAuthor;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStarsFromAuthor = numberOfStars;
    }
}
