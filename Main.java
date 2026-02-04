public class Main {
    public static void main(String args []) {

         Viewer viewer = new Viewer(1, "Aldrian");
        Movie movie = new Movie(123, "Hello Love Goodbye", 400.00);
        Ticket ticket = new Ticket(1001, viewer, movie);

        System.out.println(ticket.fullDetails());
    }
}
