public class TestBook {
    public static void main(String[] args) {
        
        Book myBook = new Book("It Ends With Us", "Colleen Hoover", "Atria Books", "928481387");

        myBook.setTitle("It Ends With Us");
        myBook.setAuthor("Colleen Hoover");
        myBook.setPublisher("Atria Books");
        myBook.setISBN("928481387");
        myBook.displayBookInfo();

        System.out.println("Number of book objects created: " + Book.getBookCount());
    }
}