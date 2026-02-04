public class Ticket {
    public int ticketId;
    public Viewer viewer; // Aggregation
    public Movie movie;   // Composition

    public Ticket(int ticketId, Viewer viewer, Movie movie) {
        this.ticketId = ticketId;
        this.viewer = viewer;
        this.movie = movie;
    }
    
    public String identify() {
        return "I am the Ticket Class. I coordinate the viewer and movie data to process the sale.";
    }
    
    public double calculateTotal() {
        return movie.getPrice();
    }
    
    public String fullDetails() {
        return viewer.identify() + "\n" +
                movie.identify() + "\n" +
                this.identify() + "\n\n" +
                "--- Transaction Summary ---\n" +
                viewer.getDetails() + "\n" +
                "Movie: " + movie.title + " (P" + calculateTotal() + ")\n" +
                "Ticket ID: " + ticketId;
    }
}
