import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scannerInt = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);
        boolean validPet = false;
        int petChoice = 0;

        // Choose between dog and cat
        while (!validPet){
            System.out.println("Hello :)");
            System.out.println("would you like to create a dog or a cat? Press 1 for dog and 2 for cat");
            petChoice = scannerInt.nextInt();
            if(petChoice>0 && petChoice<3){
                validPet = true;
            }else{
                System.out.println("Incorrect choice!!!");
            }
        }

        // Enter name
        System.out.println("Please enter the pets name:");
        String name = scannerString.nextLine();
        if(petChoice==1){
            System.out.println("You have chosen a dog");
            Dog pet = new Dog(name);
        }
        if(petChoice==2){
            System.out.println("You have chosen a cat");
            Cat pet = new Cat(name);
        }
    }
}
