public class Book {

    private static int BOOK_COUNT = 0;

    private String title;
    private String author;
    private String publisher;
    private String ISBN;
    
    public Book(String title, String author, String publisher, String ISBN) {
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.ISBN=ISBN;
        
        BOOK_COUNT++;
    } 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("ISBN: " + ISBN);
    }
    public static int getBookCount() {
        return BOOK_COUNT;
}
    }
