public class Ticket {
    public int ticketId;
    public Viewer viewer; // Aggregation
    public Movie movie;   // Composition

    public Ticket(int ticketId, Viewer viewer, Movie movie) {
        this.ticketId = ticketId;
        this.viewer = viewer;
        this.movie = movie;
    }
}
