package books;

public class BookProgram {
    public static void main(String[] args) {

    Book myBook1 = new Book("Jack London ", " The Sea Wolf ", " 567 pages ", "12 catalog number ", true);
    myBook1.dossier();

    Book myBook2 = new Book("Shekspear ", " Hamlet ", " 303 pages ", "42 catalog number ", false);
    myBook2.dossier();

    Book myBook3 = new Book("Tolstoy ", " Voina i mir ");
    myBook3.limited();

    Book myBook4 = new Book(" Pelevin ", " Generation P ");
    myBook4.limited();

    myBook3.additional("1245 pages ", " 23 catalog number ", true);

    myBook3.dossier();

    Book mybook1 = myBook1.copyBook(myBook1);
        System.out.println(mybook1);

        System.out.println(mybook1.catalogNumber);



      BookUtil util = new BookUtil();

      util.editBookCatalogNumber("4444", myBook3);
        System.out.println(myBook3);









    }


}
