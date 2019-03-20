package games;

//commenting exercise

import java.util.Random; //importing Random
import java.util.Scanner; //importing Scanner library

public class rockPaperScissors {  //creating a public class named rockpaperscissors

    String playerName;  //creating of 3 string variables
    String playerMove;
    String computerMove;
    int score;    //creating an integer to hold score
    Scanner myScanner = new Scanner(System.in);     // creation of scanner object

    public static void main(String[] args){ //main method
        rockPaperScissors rps = new rockPaperScissors();    //creating object of class rockpaperscissors
        rps.initialiseGame();       //calling the method of rockpaperscissors using the object we created
    }


    private void initialiseGame(){  //defining the method initialize game
        System.out.println("Enter your name: "); //asks user to enter name
        playerName = myScanner.nextLine(); //whatever name is entered by user is stored in playerName
        playGame(); //calling the method playGame()
    }

    private void playGame(){  //defining the playGame() method
        System.out.println("Enter your move: "); //asking user to enter move
        playerMove = myScanner.nextLine(); //user's move is stored in playerMove
        System.out.println(playerName + " has selected " + playerMove + " as their move"); //showing user the move they have selected
        computerMove = generateComputerMove();  //calling the method generateComputerMove(), it returns a value which is stored in Computermove
        String result = getWinner(playerMove, computerMove); //calling method getwinner() and what it returns is stored in string result
        if(result.equalsIgnoreCase("Win")){ //if value returned by getwinner() is win, ignoring all upper/lower cases then show user he won
            System.out.println("Congratulations, you won this round!");
            score++;  //increment user's score
        }
        else if(result.equalsIgnoreCase("Lose")){ //if method returns lose, then decrement user score
            System.out.println("You lost this round!");
            score--;
        }
        else {   //if situation is outside above if conditions, then just display it is draw to user
            System.out.println("This round was a draw!");
        }

        if(score < 3 && score > -3){    //check score, if it is between 3 and -3 then keep playing by calling play() method
            playGame();
        }
        else if(score == 3){  //if score becomes 3, dispplay winner
            System.out.println("Winner Winner!!");
        }
        else if(score == -3){ //if score equals -3, display loser
            System.out.println("You Looooooosssseeeee!");
        }

    }

    private String generateComputerMove() { //method definition for CoomputerMove method
        Random r = new Random();  //creating instance of random class
        String move = "";  //creating a string called move and assigning empty value to it
        int i = r.nextInt(3);  //using method of random class called nextInt(), giving it a parameter of 3 so that it generates random number b/w 0-2 only
        switch(i){  //using switch loop which has 3 cases
            case 0: // if random number generator gives 0 then set move to rock
                move = "Rock";
                break;  //break will take us out of the switch loop

            case 1: // if random number generator gives 1 then set move to paper
                move = "Paper";
                break;

            case 2:  // if random number generator gives 2 then set move to scissors
                move = "Scissors";
                break;
        }
        return move;   //return whatever is in the move variable
    }

    private String getWinner(String playerMove, String computerMove){ //getwinner method takes 2 parameters and returns a string
        String outcome = "";   //creating a string called outcome and assigning empty value
        if(playerMove.equalsIgnoreCase("rock")){  //if user selects rock and computermove is rock then set outcome to draw
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Draw";
            }
            else if(computerMove.equalsIgnoreCase("paper")){  //if user selects rock and computermove is paper then set outcome to lose
                outcome = "Lose";
            }
            else{
                outcome = "Win";   //if user selects rock and computermove is not rock or paper then set outcome to win
            }
        }
        if(playerMove.equalsIgnoreCase("paper")){   //if user selects paper and computermove is rock then set outcome to win
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Win";
            }
            else if(computerMove.equalsIgnoreCase("paper")){  //if user selects paper and computermove is paper then set outcome to draw
                outcome = "Draw";
            }
            else{
                outcome = "Lose"; //if user selects rock and computermove is not rock or paper then set outcome to win
            }
        }
        if(playerMove.equalsIgnoreCase("scissors")){   //if user selects scissors and computermove is rock then set outcome to lose
            if(computerMove.equalsIgnoreCase("rock")){
                outcome = "Lose";
            }
            else if(computerMove.equalsIgnoreCase("paper")){ //if user selects scissors and computermove is paper then set outcome to win
                outcome = "Win";
            }
            else{
                outcome = "Draw";   //if user selects scissors and computermove is not rock or paper then set outcome to draw
            }
        }
        return outcome;  //return whatever is stored in outcome variable
    }
}
