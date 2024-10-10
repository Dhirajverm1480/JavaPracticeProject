public class Book {
    private int bookId;
    private String bookName;
    private String genre;
    private double price;
    private String author;

    public Book(int bookId, String bookName, String genre, double price, String author){
        this.bookId = bookId;
        this.bookName = bookName;
        this.genre = genre;
        this.price = price;
        this.author = author;
    }

    public int getBookId(){
        return bookId;
    }

    public String getBookName(){
        return bookName;
    }

    public String getGenre(){
        return genre;
    }

    public double getPrice(){
        return price;
    }
    
    public String getAuthor(){
        return author;
    }
}
