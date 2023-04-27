package inheritance.taskTwo;

import inheritance.taskTwo.Fish;

public class Blowfish extends Fish implements AnimalMove, AnimalBehavior{
    private boolean isPoisonous;

    public Blowfish(String porcupinefish, int i, double v, String saltwater) {
        super();
    }

    @Override
    public void swim() {
        System.out.println("A blowFish has a unique way of swimming");
    }

    public Blowfish(String name, int age, double weight, boolean isSaltwater, boolean isPoisonous) {
        super(name, age, weight, String.valueOf(isSaltwater));
        this.isPoisonous = isPoisonous;
    }

    public Blowfish(String name, double weight, boolean isPoisonous) {
        super(name, weight);
        this.isPoisonous = isPoisonous;
    }

    public boolean getIsPoisonous() {
        return isPoisonous;
    }

    public void setIsPoisonous(boolean isPoisonous) {
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void eat() {
        System.out.println("The blowfish is eating small fish and algae.");
    }

    @Override
    public String getVoice() {
        return "The blowfish doesn't make any sounds.";
    }

    public void puffUp() {
        System.out.println("The blowfish can puff up to intimidate predators.");
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                ", isPoisonous=" + isPoisonous +
                '}';
    }
    @Override
    public void move() {
        System.out.println("Blowfish move by swimming.");
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish sleeps at the bottom of the sea.");
    }
}
