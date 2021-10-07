public class Dog extends Tamagotchi {
    public Dog(String name) {
        super(name);
    }

    public void bark(){
        System.out.println("VUFF VUFF");
    }

    @Override
    public void play() {
        // Access private variable from parent class
        int energy = getEnergy();
        int mood = getMood();
        String name = getName();

        System.out.println(name+" is playing!!!");

        // Give new values
        energy -= 25;
        mood +=35;
        // set private variable from parent class
        setEnergy(energy);
        setMood(mood);
        // Truncate to 0
        if (energy<=0){
            setEnergy(0);
        }
        // Truncate to 100
        if(mood>100){
            setMood(100);
        }
    }
}
