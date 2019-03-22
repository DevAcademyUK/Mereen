package switches;
import java.util.Scanner;

public class parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        parking p = new parking();
        p.getInput();
    }

    private void getInput(){
        System.out.println("What day is it?");
        String day = myScanner.nextLine();
        System.out.println("How long will you be staying");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What position do you hold within the college? (Staff/ Student/Visitor)");
        String position = myScanner.nextLine();
        calculateFees(day, duration, position);
    }

    private void calculateFees(String day, int duration, String position){  //if functions are not being used by any other class, always make them private
        int cost;
        int hourlyrate=0;
        int multiplier=0;

        switch (position.toLowerCase()){   //in case user enters capital letters, convert them before comparing
            case "staff":
                multiplier =2;
                break;
            case "student":
                multiplier=1;
            case "visitor":
                multiplier = 3;
                break;
            default:
                System.out.println("Your input was invalid, please try again");
                return; //will return back to main  methodas we dont want it to display thanks for parking at gateshead
        }

        switch(day.toLowerCase()){
            case "monday":
                hourlyrate = 2;
                break;
            case "tuesday":
                hourlyrate = 2;
                break;
            case "wednesday":
                hourlyrate = 3;
                break;
            case "thursday":
                hourlyrate = 2;
                break;
            case "friday":
                hourlyrate = 3;
                break;
            case "saturday":
                hourlyrate = 4;
                break;
            case "sunday":
                hourlyrate = 5;
                break;
            default:
                System.out.println("Invalid input, please try again");
                return;
        }

        cost = (hourlyrate * multiplier) * duration;
        System.out.println("Thanks for parking at Gateshead College, Please Pay: " + cost);
    }
}