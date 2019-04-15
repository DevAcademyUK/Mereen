package library;
import java.util.Scanner;

public class library {

    Scanner myScanner = new Scanner(System.in);

    book[] books = new book[6];
    member[] members = new member[5];
    loan[] loans = new loan[2];


    public static void main(String[] args){
        library lib = new library();
        lib.init();
    }

    public void menu(){
        System.out.println("Welcome to Dean's library");
        System.out.println("Select an option from the menu below:");
        System.out.println("1- Search for a book");
        System.out.println("2- Check if a book is available");
        System.out.println("3- Search for an author");
        int choice= Integer.parseInt(myScanner.nextLine());

        switch(choice){
            case 1:
                boolean b= searchBook();
                menu();
            case 2:
                checkBook();
                break;
            case 3:
                searchAuthor();
                break;
            default:
                System.out.println("Invalid input provided, please try again");
                menu();
        }
    }

    public boolean searchBook(){
        System.out.println("What is the name of the book you would like to search for");
        String title = myScanner.nextLine();
        boolean result=false;

        for(int i=0; i<books.length; i++){  //length will be 5 as 0-4
                if(books[i].bookTitle.equalsIgnoreCase(title)){
                System.out.println("We have this book in the library!");
                System.out.println();
                result=true;
            }
            else if(i==books.length-1){//if title wasnt found in array then check if its last index
                System.out.println("Sorry, we do not currently have that book in stack");
                System.out.println();
                result=false;
            }
        }
        return result;
    }

    public void checkBook(){
        System.out.println("Let's see if we have your book!");
        boolean bookPresent= searchBook();
        if(bookPresent){
            for(int i=0; i<books.length; i++){  //length will be 5 as 0-4
                if(books[i].availability==true){
                    System.out.println("The book is Available!");
                    System.out.println();
                }
                else{
                    System.out.println("Sorry book is not available");
                    menu();
                }
            }
        }
        else {
            menu();
        }
    }

    public void searchAuthor(){
        System.out.println("What is the name of the author you would like to search for");
        String author = myScanner.nextLine();
        int counter=0;

        for(int i=0; i<books.length; i++){
            if(books[i].bookAuthor.equalsIgnoreCase(author)){//only go in if author name matches
                System.out.println("We have " + books[i].bookTitle+" by" + " " +books[i].bookAuthor);
                System.out.println();
                counter++;
            }
            else if(i==books.length-1 && counter>0){//if title wasnt found in array then check if its last index
                System.out.println("That is all we could find!");
                System.out.println();
            }
        }
        menu();

    }

    public void init(){
        books[0]= new book(1 ,"In Search of Lost Time", "Marcel Proust","1913");
        books[1]= new book(2, "Ulysses", "James Joyce", "1922");
        books[2]= new book(3, "Moby Dick", "Herman Melville", "1851");
        books[3]= new book(4, "Pride and prejudice", "Jane Austen", "1813");
        books[4]= new book(5, "The Canterbury tale", "Geoffrey Chaucer", "1387");
        books[5]= new book(5, "Sense and Sensibility", "Jane Austen", "1811");


        members[0] = new member(1, "Dean", "Lewis", (byte)30);
        members[1] = new member(2, "Steve", "Beckwith", (byte)55);
        members[2] = new member(3, "Lisa", "Crow", (byte)39);
        members[3] = new member(4, "Vicky", "Cross", (byte)37);
        members[4] = new member(5, "Rachel", "Alsop", (byte)25);

        loans[0] = new loan(2, 4);
        loans[1] = new loan(5, 2);

        menu();
    }
}
