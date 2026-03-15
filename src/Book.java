
public class Book extends LibraryItem {
    private String author;
    
    public Book(String id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    // Book specific methods
    public String getAuthor() { 
        return author; 
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Author: " + author);
    }
}