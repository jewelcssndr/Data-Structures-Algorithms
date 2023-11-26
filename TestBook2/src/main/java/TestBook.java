
import java.util.Scanner;

public class TestBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[10];
        int bookIndex = 0;

        while (true) {
            System.out.println("Total number of books: " + Book.getBookCount());
            System.out.println("Select an operation:");
            System.out.println("1.Search");
            System.out.println("2.Add");
            System.out.println("3.Delete");
            System.out.println("4.Sort");
            System.out.println("5.Quit Program");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a book title or ISBN to search: ");
                    String searchBook = scanner.nextLine();
                    boolean found = false;
                    for (Book book : books) {
                        if (book != null && (book.getTitle().equals(searchBook) || book.getISBN().equals(searchBook))) {
                            System.out.println("Book found!:");
                            System.out.println("Title: " + book.getTitle());
                            System.out.println("Author: " + book.getAuthor());
                            System.out.println("Publisher: " + book.getPublisher());
                            System.out.println("ISBN: " + book.getISBN());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                     System.out.println("Book not found.");
                    }
                    break;

                case 2:
                    if (bookIndex < books.length) {
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter publisher: ");
                        String publisher = scanner.nextLine();
                        System.out.print("Enter ISBN: ");
                        String ISBN = scanner.nextLine();
                        books[bookIndex] = new Book(title, author, publisher, ISBN);
                        bookIndex++;
                        System.out.println("Book added!");
                    } else {
                        System.out.println("Cannot add more books.");
                    }
                    break;

                case 3:
                    System.out.print("Enter a book title to delete: ");
                    String deleteBook = scanner.nextLine();
                    boolean deleted = false;
                    for (int i = 0; i < bookIndex; i++) {
                        if (books[i] != null && (books[i].getTitle().equals(deleteBook) || books[i].getISBN().equals(deleteBook))) {
                            System.out.println("Book deleted:");
                            System.out.println("Title: " + books[i].getTitle());
                            System.out.println("Author: " + books[i].getAuthor());
                            System.out.println("Publisher: " + books[i].getPublisher());
                            System.out.println("ISBN: " + books[i].getISBN());
                            books[i] = null;
                            for (int j = i; j < bookIndex - 1; j++) {
                                books[j] = books[j + 1];
                            }
                            bookIndex--;
                            deleted = true;
                            break;
                        }
                    }
                    if (!deleted) {
                        System.out.println("Not found.");
                    }
                    break;

                case 4:
                    System.out.println("Sort by:");
                    System.out.println("1.Title");
                    System.out.println("2.Author");
                    System.out.println("3.Publisher");
                    System.out.println("4.ISBN");
                    System.out.print("Enter your choice: ");
                    int sortChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (sortChoice >= 1 && sortChoice <= 4) {
                        switch (sortChoice) {
                            case 1:
                        
                                break;
                                
                            case 2:
                              
                                break;
                                
                            case 3:
                          
                                break;
                                
                            case 4:
                             
                                break;
                        }
                        System.out.println("Books sorted.");
                    } else {
                        System.out.println("Invalid");
                    }
                    break;

                case 5:
                    System.out.println("Bye");
                    System.exit(0);

                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}