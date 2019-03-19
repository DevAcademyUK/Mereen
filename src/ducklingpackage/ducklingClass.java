package ducklingpackage;
import java.util.Scanner;

public class ducklingClass {

    public static void main(String[] args){
 ducklingClass duckObject = new ducklingClass();
 duckObject.singSong();

    }

    public static void singSong(){

        Scanner scanObject = new Scanner(System.in);
        System.out.println("How many ducks are there?");
        int numberOfDucks= scanObject.nextInt();

        for (int i=numberOfDucks; i>=2; i--) {
            System.out.println(i + " " + "little ducks went swimming one day");
            System.out.println("Over the hill and far away");
            System.out.println("Mother duck said Quack Quack Quack");

            int y=i-1;

            if(y==1){
                System.out.println("and only " + y + " duck came back"+ "\n");
                System.out.println("1 little duck went swimming one day");
                System.out.println("Over the hill and far away");
                System.out.println("Mother duck said Quack Quack Quack");
                System.out.println("and all her "+ " " +y+" " +"ducks came back");
            }
            else{
                System.out.println("and only " + i + "ducks came back" + "\n");
            }
        }
    }

}
