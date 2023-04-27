package inheritance.taskTwo;

public class Mammal extends Animal {
    public Mammal() {
    }

    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Mammal(String name) {
        super(name, 0, 0);
    }

    @Override
    public void eat() {
        System.out.println("Mammal eats");
    }

    @Override
    public String getVoice() {
        return "Mammal voice";
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", weight=" + getWeight() +
                '}';
    }
}