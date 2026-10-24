import java.util.Date;

public class Library {
    private Book[] books = new Book[5]; // Simplified for 5 books
    private Member[] members = new Member[2];

    public Library() {
        books[0] = new Book(101, "Java Programming");
        books[1] = new Book(102, "OOPS Concepts");
        // Initialize other books and members...
        members[0] = new Member(1, "Alice");
    }

    public void issueBook(int memberId, int bookId) {
        for (Book b : books) {
            if (b != null && b.getBookId() == bookId && !b.isIssued()) {
                for (Member m : members) {
                    if (m != null && m.getMemberId() == memberId && m.getIssuedBookId() == -1) {
                        b.setIssued(true);
                        m.setIssuedBookId(bookId);
                        m.setIssueDate(new Date());
                        System.out.println("Book issued successfully!");
                        return;
                    }
                }
            }
        }
        System.out.println("Cannot issue book (Check availability/Member status).");
    }

    public void returnBook(int memberId) {
        for (Member m : members) {
            if (m != null && m.getMemberId() == memberId && m.getIssuedBookId() != -1) {
                // Fine Calculation: 2 per day
                // (Simplified: assuming 5 days late for demo)
                int daysLate = 5; 
                int fine = daysLate * 2;
                
                System.out.println("Book returned. Fine to pay: " + fine);
                
                // Reset states
                for (Book b : books) {
                    if (b != null && b.getBookId() == m.getIssuedBookId()) {
                        b.setIssued(false);
                    }
                }
                m.setIssuedBookId(-1);
                return;
            }
        }
    }
}