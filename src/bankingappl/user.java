package bankingappl;
import java.util.Scanner;

public class user {

    private String name;
    private short pin;
    Scanner myScanner = new Scanner(System.in);

    public user(){  //constructor: everytime user object is created, automatically assign this pin&name, it'll stay same unless specifically changed
        pin=2314;
        name="Mereen";
    }

    public boolean login(){
        System.out.println("Please enter your name");
        String username = myScanner.nextLine();
        System.out.println("Please enter your 4-digit pin"); //TODO handle if user enters string instead of int
        int userpin= Integer.parseInt(myScanner.nextLine());//comparing user entered password with hard coded pin 2314
        if(userpin==pin && username.equalsIgnoreCase(name)){
            System.out.println("\nYou have succesfully logged in " + name+ ".");
            return true;
        }
        else{
            System.out.println("Sorry the password entered was incorrect, lets try again.");
            return false;
        }
    }

    public void logout(){
        System.out.println("You have successfully logged out " + name);
        return;
    }

}
