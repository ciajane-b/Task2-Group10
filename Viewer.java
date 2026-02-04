public class Viewer {
    public int viewerId;
    public String name;

    public Viewer(int viewerId, String name) {
        this.viewerId = viewerId;
        this.name = name;
    }
    
   public String identify() {
        return "I am the Viewer Class. I hold information about the person watching the movie.";
    }
    
    public String getDetails() {
        return "Viewer ID: " + viewerId + ", Name: " + name;
    }
    
}
