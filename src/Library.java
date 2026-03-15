
import java.util.*;

public class Library {
    private List<LibraryItem> items = new ArrayList<>();
    private List<Member> members = new ArrayList<>();
    
    public void addItem(LibraryItem item) {
        items.add(item);
    }
    
    public void addMember(Member member) {
        members.add(member);
    }
    
    public void displayItems() {
        System.out.println("\nLibrary Items: ");
        items.forEach(LibraryItem::display);
    }
    
    public void displayMembers() {
        System.out.println("\nLibrary Members: ");
        members.forEach(Member::display);
    }
}