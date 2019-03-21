package animals;
import java.util.Scanner;

public class createAnimal {

    public static void main(String[] args){

        createAnimal myAnimal= new createAnimal();
        myAnimal.getAnimalType();
    }

    Scanner myScanner = new Scanner(System.in);

    private void getAnimalType(){
        System.out.println("What animal would you like to create?");
        String animal = myScanner.nextLine();

        if(animal.equalsIgnoreCase("dog")){
            createDog();
        }
        else if (animal.equalsIgnoreCase("cat")){
            createCat();
        }
        else{
            System.out.println(animal + "is not an animal we can currently create, please try again");
        }
    }

    private void createDog(){
        System.out.println("What is the dogs name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = Integer.parseInt(myScanner.nextLine());   //because nextline() alone doesnt read integer so need to use parse
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();

        dog myDog = new dog(name, size, age, breed);
        System.out.println("\n" +myDog.bark(size));
        System.out.println("\n" +myDog.play(breed));
        System.out.println("\n" +myDog.beHuman(name, age, breed));
    }

    private void createCat(){
        System.out.println("What is the cats name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the cat? (small/big)");
        String size = myScanner.nextLine();
        System.out.println("What's the nature of your cat?(shy/naughty)");
        String nature = myScanner.nextLine();


        cat myCat = new cat(name, size, nature);
        myCat.hide(nature);
        myCat.jump(size);
        System.out.println(myCat.tellTheHuman(name, size, nature));
    }
}


