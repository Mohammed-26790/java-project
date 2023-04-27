package inheritance.taskTwo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Burek", 2, 5.2, "brown");
        animals[1] = new Pigeon("Rock Dove", 1, 0.3, "gray");
        animals[2] = new Blowfish("Porcupinefish", 3, 0.5, "saltwater");
        animals[3] = new Dog("Azor", 4, 7.1, "black");
    }
}
