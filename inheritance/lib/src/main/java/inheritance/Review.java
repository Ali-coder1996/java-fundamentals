package inheritance;


/**
 * Review class
 */
public class Review {
    private String body;
    private String author;
    private int starsNumberFromAuthor;
    private String movieName;

    public Review(String body, String author, int starsNumberFromAuthor) {
        this.body = body;
        this.author = author;
        this.starsNumberFromAuthor = starsNumberFromAuthor;

    }

    public Review(String body, String author, int starsNumberFromAuthor, String movieName) {
        this.body = body;
        this.author = author;
        this.starsNumberFromAuthor = starsNumberFromAuthor;
        this.movieName = movieName;
    }

    @Override
    public String toString() {
        return "Review{" +
                "body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", starsNumberFromAuthor=" + starsNumberFromAuthor +
                '}';
    }

    public int getStarsNumberFromAuthor() {
        return starsNumberFromAuthor;
    }

    public void setStarsNumberFromAuthor(int starsNumberFromAuthor) {
        this.starsNumberFromAuthor = starsNumberFromAuthor;
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


    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
