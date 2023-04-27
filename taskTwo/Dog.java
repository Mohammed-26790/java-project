package inheritance.taskTwo;

public class Dog extends Mammal implements AnimalBehavior, AnimalMove {
    public Dog() {}

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    public Dog(String name) {
        super(name, 0, 0.0);
    }

    public Dog(String burek, int i, double v, String brown) {
    }

    @Override
    public void eat() {
        System.out.println("I am a dog and I am eating");
    }

    @Override
    public String getVoice() {
        return "woof";
    }

    @Override
    public void sleep() {
        System.out.println("I am a dog and I am sleeping");
    }

    @Override
    public void move() {
        System.out.println("Dog run");
    }
}