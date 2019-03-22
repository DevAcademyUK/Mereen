package bankingappl;

import java.util.Random;
import java.util.Scanner;


public class bankAccount {

    private float currentBalance;
    private float savingBalance;
    private float jointBalance;
    private String accountType = "none";
    private static Scanner myScanner = new Scanner(System.in);  //if you want to use scanner in main() then you need to define it as static

    private bankAccount() {  //constructor- everytime a new object of Bank Account class is created assign these values so they stay the same always unless specifically changed
        Random rand = new Random();
        currentBalance = rand.nextInt(48548745);
        savingBalance = rand.nextInt(31231);
        jointBalance = rand.nextInt(7842);
    }

    public static void main(String[] args) {

        bankAccount myObj = new bankAccount();
        user userObject = new user();
        String userExit;
        System.out.print("Please login to begin. ");
        boolean loginstatus = userObject.login();
             if (loginstatus) {
                         myObj.menu();
        }   else {
                        userObject.login();
        }
             do{ //to keep iterating menu
                 myObj.menu();
                 System.out.println("Would you like to continue? Please enter (Y/N)");
                 userExit = myScanner.nextLine();

             }
            while (userExit.equalsIgnoreCase("Y"));
    }


    private void menu() {
        System.out.println("\n***** Please choose from the following options***** \n1. Check balance\n2.Make a deposit\n3.Withdraw money\n4.Transfer Funds\n5.SwitchAccount\n");
        int choice = Integer.parseInt(myScanner.nextLine());
        switch (choice) {
            case 1:
                if (accountType.equalsIgnoreCase("none")) { //only calling switch account if user hasnt selected an account yet
                    switchAccount();
                }
                System.out.println("Your balance for this account is:  " + (checkBalance(accountType)));
                break;
            case 2:
                System.out.println("How much would you like to deposit today?");
                float depositAmount = Integer.parseInt(myScanner.nextLine());
                makeDeposit(depositAmount, accountType);
                break;
            case 3:
                makeWithdrawal();
                break;
            case 4:
                transferFunds();
                break;
            case 5:
                switchAccount();
                break;
        }
    }

    private void switchAccount() {
        System.out.println("Which account would you like to use today?\n1.Current Account\n2.Savings Account\n3.Joint Account\n");
        int option = Integer.parseInt(myScanner.nextLine());
        switch (option) {
            case 1:
                accountType = "current";
                System.out.println("You are now in your Current account");
                break;
            case 2:
                accountType = "savings";
                System.out.println("You are now in your Savings account");
                break;
            case 3:
                accountType = "joint";
                System.out.println("You are now in your Joint account");
                break;
            default:
                System.out.println("You entered invalid response, please try again");
                break;
        }
    }

    private float checkBalance(String accountType) {

        if (accountType.equalsIgnoreCase("current")) {
            return currentBalance;
        } else if (accountType.equalsIgnoreCase("savings")) {
            return savingBalance;
        } else {
            return jointBalance;
        }
    }

    private void makeDeposit(float depositAmount, String accountType) {
        float balance = checkBalance(accountType);
        if (this.accountType.equalsIgnoreCase("current")) {
            currentBalance = currentBalance + depositAmount;
            System.out.println("Congratulations! your transaction was successful, your balance for " + accountType + " account is: " + currentBalance);
        } else if (this.accountType.equalsIgnoreCase("savings")) {
            savingBalance = savingBalance + depositAmount;
            System.out.println("Congratulations! your transaction was successful, your balance for " + accountType + " account is: " + savingBalance);
        } else {
            jointBalance = jointBalance + depositAmount;
            System.out.println("Congratulations! your transaction was successful, your balance for " + accountType + " account is: " + jointBalance);
        }
    }

    private void makeWithdrawal() {

        System.out.println("How much would you like to withdraw today?");
        float withdrawalAmount = Integer.parseInt(myScanner.nextLine());
        float balance = checkBalance(accountType);
        if (this.accountType.equalsIgnoreCase("current")) {
            currentBalance = currentBalance - withdrawalAmount;
            System.out.println("Congratulations! your withdrawal was successful, your balance for " + accountType + " account is: " + currentBalance);
        } else if (this.accountType.equalsIgnoreCase("savings")) {
            savingBalance = savingBalance - withdrawalAmount;
            System.out.println("Congratulations! your deposit was successful, your balance for " + accountType + " account is: " + savingBalance);
        } else {
            jointBalance = jointBalance + withdrawalAmount;
            System.out.println("Congratulations! your deposit was successful, your balance for " + accountType + " account is: " + jointBalance);
        }
    }

    public void transferFunds() {
        System.out.println("How much would you like to transfer today?");
        float transferAmount = Integer.parseInt(myScanner.nextLine());
        makeDeposit(transferAmount, accountType);
    }
}
