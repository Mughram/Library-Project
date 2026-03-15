
import java.util.*;
public class Member extends Person {
    private List<LibraryItem> borrowedItems;

    public Member(String id, String name) {
        super(id, name);
        this.borrowedItems = new ArrayList<>();
    }

    public void borrowItem(LibraryItem item) {
        if (item.isAvailable()) {
            borrowedItems.add(item);
            item.setAvailable(false);
            System.out.println(getName() + " borrowed " + item.getTitle());
        }
        else{
            System.out.println(getName() + " trying to borrow " + item.getTitle());
            System.out.println("Sorry this item not available right now");
        }
    }

    public void returnItem(LibraryItem item) {
        if (borrowedItems.remove(item)) {
            item.setAvailable(true);
            System.out.println(getName() + " returned " + item.getTitle());
        }
    }
}