package library;

public class book {

    public int bookID;
    public String bookTitle;
    public String bookAuthor;
    public String bookYear;
    public boolean availability;

    public book(int ID, String title, String author, String year){
        bookID = ID;
        bookTitle = title;
        bookAuthor = author;
        bookYear = year;
        availability=true;
    }


}
