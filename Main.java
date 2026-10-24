import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Issue Book\n2. Return Book\n3. Exit");
            int choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.print("Enter Member ID: ");
                int mid = sc.nextInt();
                System.out.print("Enter Book ID: ");
                int bid = sc.nextInt();
                lib.issueBook(mid, bid);
            } else if (choice == 2) {
                System.out.print("Enter Member ID: ");
                int mid = sc.nextInt();
                lib.returnBook(mid);
            } else {
                break;
            }
        }
        sc.close();
    }
}