package books;

public class Book {
String author;
String title;
String pages;
String catalogNumber;
Boolean atStock;

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








    public void dossier(){
    System.out.println(author + title + pages + catalogNumber + atStock);

}
    public void limited(){
    System.out.println(author + title + " внесите недостающую информацию ");
    }

    public void additional(String pages, String catalogNumber, Boolean atStock){

    System.out.println(pages + catalogNumber + atStock);
    }








}
