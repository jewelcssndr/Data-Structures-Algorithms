class Book {
    private String title;
    private String author;
    private String publisher;
    private String ISBN;
    private static int bookCount = 0;

    public Book(String title, String author, String publisher, String ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public static int getBookCount() {
        return bookCount;
    }
}
