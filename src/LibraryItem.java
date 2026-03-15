
public class LibraryItem {
    private String id;
    private String title;
    private boolean available;
    
    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }

    // Getters and setters
    public String getId() { 
        return id;
    }
    public String getTitle() { 
        return title; 
    }
    public boolean isAvailable() { 
        return available; 
    }
    
    public void setAvailable(boolean available) {
        this.available = available; 
    }
    
    public void display() {
        System.out.println("ID: " + id + ", Title: " + title +  " , Available: " + available);
    }
}