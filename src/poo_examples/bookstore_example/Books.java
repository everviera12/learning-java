package poo_examples.bookstore_example;

public class Books {
    private String book_name;
    private String autor;
    private Boolean status;
    private Double price;
    private String release_date;


    public Books() {
        // info from main class
    }

    public Books(String book_name, String autor, Boolean status, Double price, String release_date) {
        this.book_name = book_name;
        this.autor = autor;
        this.status = status;
        this.price = price;
        this.release_date = release_date;
    }

    // book name
    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    // autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // status
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    // price
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // release date
    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    // output
    @Override
    public String toString() {
        return "Books {\n" +
                "  book_name='" + book_name + '\'' + ",\n" +
                "  autor='" + autor + '\'' + ",\n" +
                "  status=" + (status ? "Available" : "Unavailable") + ",\n" +
                "  price=" + price + ",\n" +
                "  release_date='" + release_date + '\'' + "\n" +
                '}';
    }

}