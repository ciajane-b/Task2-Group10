public class Movie {
    public int movieId;
    public String title;
    public double price;

     public Movie(int movieId, String title, double price) {
        this.movieId = movieId;
        this.title = title;
        this.price = price;
    }
    
    public String identify() {
        return "I am the Movie Class. I hold information about the film title and its ticket price.";
    }
    
    public double getPrice() {
        return price;
    }
}
