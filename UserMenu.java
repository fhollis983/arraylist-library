import java.util.Scanner;

public class UserMenu {

    public static void startMenu(ArrayList<Book> data) {
        System.out.println(data);

        int choice = 0;
        String title;
        String subject;
        int year;
        int pages;
        double rating;
        Book book;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu");
            System.out.println("1. List all books");
            System.out.println("2. Sort by year (ascending)");
            System.out.println("3. Sort by length (ascending)");
            System.out.println("4. Sort by rating (descending)");
            System.out.println("5. Filter by subject");
            System.out.println("6. Search for a book");
            System.out.println("7. Add a book");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(scanner.nextLine());

            if(choice == 1) { // List all books
                System.out.println(data);
            }
            else if(choice == 2) { // Sort by year (ascending)
                System.out.println(Library.sortYear(data));
            }
            else if(choice == 3) { // Sort by length (ascending)
                System.out.println(Library.sortLength(data));
            }
            else if(choice == 4) { // Sort by rating (descending)
                System.out.println(Library.sortRating(data));
            }
            else if(choice == 5) { // Filter by subject
                System.out.print("Enter subject: ");
                subject = scanner.nextLine();
                System.out.println(Library.filterSubject(data, subject).getSize() + " books found with subject " + subject + ":");
                System.out.println(Library.filterSubject(data, subject));
            }
            else if(choice == 6) { // Search for a book
                System.out.print("Enter title: ");
                title = scanner.nextLine();
                System.out.println(Library.search(data, title));
            }
            else if(choice == 7) { // Add a book
                System.out.print("Enter title: ");
                title = scanner.nextLine();
                System.out.print("Enter subject: ");
                subject = scanner.nextLine();
                System.out.print("Enter year: ");
                year = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter pages: ");
                pages = Integer.valueOf(scanner.nextLine());
                System.out.print("Enter rating (double): ");
                rating = Double.valueOf(scanner.nextLine());
                book = new Book(title, subject, year, pages, rating);
                data.add(book);
                System.out.println("Book added: " + book + "\n");
            }
            else if(choice == 8) { // Exit
                System.out.println("Exit code received.");
            }
            else System.out.println("Invalid choice. Enter an integer.");

        } while (choice != 8);

        scanner.close();

    }

}