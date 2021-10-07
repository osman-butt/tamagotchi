import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        final int petMaxYears = 5;
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
            while(pet.getAge()<=petMaxYears){
                System.out.println(pet.toString());
                System.out.println("What would you now like to do?");
                System.out.println("1 - Play");
                System.out.println("2 - Feed");
                System.out.println("3 - Sleep");
                System.out.println("4 - Bark");
                int actionChoice = scannerInt.nextInt();
                if(actionChoice==1){
                    pet.play();
                }else if(actionChoice==2){
                    pet.feed();
                }else if (actionChoice==3){
                    pet.sleep();
                }else{
                    pet.bark();
                }
                if (pet.getEnergy()==0){
                    System.out.println("your pet died - because the energy became too low :(");
                    pet.setAge(666);
                }
            }
            if(pet.getAge()==(petMaxYears+1)){
                System.out.println(pet.getName()+" died of natural causes :(");
            }
        }
        if(petChoice==2){
            System.out.println("Ahh you would like to create a cat, what should the name of the cat be?");
            // Enter name
            name = scannerString.nextLine();
            Cat pet = new Cat(name);

            // The pet can be maximum 5 years old
            while(pet.getAge()<=petMaxYears){
                System.out.println(pet.toString());
                System.out.println("What would you now like to do?");
                System.out.println("1 - Play");
                System.out.println("2 - Feed");
                System.out.println("3 - Sleep");
                System.out.println("4 - Miaw");
                int actionChoice = scannerInt.nextInt();
                if(actionChoice==1){
                    pet.play();
                }else if(actionChoice==2){
                    pet.feed();
                }else if (actionChoice==3){
                    pet.sleep();
                }else{
                    pet.miaw();
                }
                if (pet.getEnergy()==0){
                    System.out.println("your pet died - because the energy became too low :(");
                    pet.setAge(666);
                }
            }
            if(pet.getAge()==(petMaxYears+1)){
                System.out.println(pet.getName()+" died of natural causes :(");
            }
        }
    }
}
