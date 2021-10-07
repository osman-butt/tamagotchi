public class Tamagotchi {
    private String name;
    private int age;
    private int mood;
    private int energy;

    // Constructor
    public Tamagotchi(String name){
        this.name = name;
        this.age = 0;
        this.mood = 50;
        this.energy = 50;
    }

    public void play(){
        System.out.println(this.name+" is playing!!!");
        this.energy -= 40;
        this.mood +=30;
        // Truncate to 0
        if (this.energy<=0){
            this.energy = 0;
            System.out.println(this.name+" died because it reached energy level 0 :(");
        }
        // Truncate to 100
        if(this.mood>100){
            this.mood = 100;
            System.out.println(this.name+" is now happy :)");
        }
    }

    public void feed(){
        this.mood += 15;
        this.energy -= 20;
        // Truncate mood to 100
        if(this.mood>=100){
            this.mood = 100;
        }
        // Truncate energy to 0
        if(this.energy<=0){
            this.energy = 0;
        }
    }

    public void sleep(){
        this.energy += 40;
        this.mood -= 30;
        // Truncate mood to 0
        if(this.mood<=0){
            this.mood = 0;
        }
        // Truncate energy to 0
        if(this.energy>=100){
            this.energy = 100;
        }
    }

    // Getters
    public String getName(){
        return this.name;
    }
    public int getMood(){
        return this.mood;
    }
    public int getEnergy(){
        return this.energy;
    }

    // Setters
    public void setMood(int mood){
        this.mood = mood;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }



}
