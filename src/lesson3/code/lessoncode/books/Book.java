package books;

public class Book {
public String author;
public String title;
public String pages;
public String catalogNumber;
public Boolean atStock;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title, String pages, String catalogNumber, Boolean atStock) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.catalogNumber = catalogNumber;
        this.atStock = atStock;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", pages='" + pages + '\'' +
                ", catalogNumber='" + catalogNumber + '\'' +
                ", atStock=" + atStock +
                '}';
    }






    public void dossier(){
    System.out.println(author + title + pages + catalogNumber + atStock);

}
    public void limited(){
    System.out.println(author + title + " внесите недостающую информацию ");
    }

    public void additional(String pages, String catalogNumber, Boolean atStock){
    this.pages = pages;
    this.catalogNumber = catalogNumber;
    this.atStock = atStock;

    }

    public Book copyBook(Book book){
        Book copyBook = new Book(book.author + "(copy)", book.title, book.pages, book.catalogNumber, book.atStock);
        return copyBook;

    }



}
