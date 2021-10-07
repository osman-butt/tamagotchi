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

        String name = "";
        if(petChoice==1){
            System.out.println("Ahh you would like to create a dog, what should the name of the dog be?");
            // Enter name
            name = scannerString.nextLine();
            Dog pet = new Dog(name);

            // The pet can be maximum 5 years old
            while(pet.getAge()<=5){
                System.out.println(pet.toString());
                System.out.println("What would you now like to do?");
                System.out.println("1 - Play");
                System.out.println("2 - Feed");
                System.out.println("3 - Sleep");
                int actionChoice = scannerInt.nextInt();
                if(actionChoice==1){
                    pet.play();
                }else if(actionChoice==2){
                    pet.feed();
                }else{
                    pet.sleep();
                }
                if (pet.getEnergy()==0){
                    System.out.println("your pet died - because the energy became too low :(");
                    pet.setAge(666);
                }
            }
        }
        if(petChoice==2){
            System.out.println("Ahh you would like to create a cat, what should the name of the cat be?");
            // Enter name
            name = scannerString.nextLine();
            Cat pet = new Cat(name);
            System.out.println(pet.toString());
        }
    }
}
