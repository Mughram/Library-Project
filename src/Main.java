public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add items
        Book book1 = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("B002", "1984", "George Orwell");
        library.addItem(book1);
        library.addItem(book2);

        // Add members
        Member member1 = new Member("M001", "Alice");
        Member member2 = new Member("M002", "Bob");
        library.addMember(member1);
        library.addMember(member2);

        // Display initial state
        library.displayItems();
        library.displayMembers();

        // Borrow and return
        member1.borrowItem(book1);
        member2.borrowItem(book1); // Should not be available

        library.displayItems();

        member1.returnItem(book1);
        member2.borrowItem(book1); // Now available

        library.displayItems();
    }
}
