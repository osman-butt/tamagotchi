public class Cat extends Tamagotchi{
    public Cat(String name) {
        super(name);
    }

    public void miaw(){
        System.out.println("Miaw");
    }

    @Override
    public void sleep() {
        // Access private variable from parent class
        int energy = getEnergy();
        int mood = getMood();
        int age = getAge();
        String name = getName();
        System.out.println(name+" is sleeping!!!");
        energy += 40;
        mood -= 30;
        age +=1;
        // set private variable from parent class
        setEnergy(energy);
        setMood(mood);
        setAge(age);
        // Truncate mood to 0
        if(mood<=0){
            setMood(0);
        }
        // Truncate energy to 0
        if(energy>=100){
            setEnergy(100);
        }
    }
}
