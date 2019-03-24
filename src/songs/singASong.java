package songs;
import java.util.Scanner;

public class singASong {

    public static void main(String[] args) {

        singASong songObject = new singASong(); //calling the default constructor
        songObject.sing();
    }

    private void sing() {

        Scanner scannerObject = new Scanner(System.in);
        System.out.println("How many bottles of soda are hanging on the wall");
        int bottles = scannerObject.nextInt();
        String word = "bottles";

        for (int i = bottles; i > 0; i--) {

            System.out.println(i + " " + word + " of soda on the wall.");
            System.out.println(i + " " + word + " of soda");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            if (i == 1) {
                System.out.println("No more bottles of soda on the wall.");
            } else {
                int newNum = i - 1;
                if (newNum == 1) {
                    word = "bottle";
                }
                System.out.println(newNum + " " + word + " of soda on the wall.");
                System.out.println();
            }
        }
    }
}
