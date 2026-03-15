
public class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    // Getters and setters
    public String getId() { 
        return id; 
    }
    public String getName() { 
        return name; 
    }
    
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}