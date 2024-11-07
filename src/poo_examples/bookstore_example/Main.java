package poo_examples.bookstore_example;

public class Main {
    public static void main(String[] args) {

        // set
        Books book = new Books();

        book.setBook_name("Libro 1");
        book.setAutor("User 1");
        book.setPrice(99.99);
        book.setStatus(true);
        book.setRelease_date("1 Enero 2000");

        System.out.println("book = " + book);

        System.out.println("---------------------------------");

        // get
        Books book_2 = new Books("Libro 2", "User 2", false, 19.99, "2 Enero 2001");
        System.out.println("book_2 = " + book_2);

        System.out.println("---------------------------------");

        // test
        System.out.println(book_2.getBook_name());
        System.out.println(book.getAutor());
    }
}
