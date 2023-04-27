package inheritance.taskTwo;

public class Pigeon extends Bird implements AnimalBehavior, AnimalMove {
    private String species;

    public Pigeon(String rockDove, int i, double v, String gray) {}

    @Override
    public void eat() {

    }

    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }



    @Override
    public void fly() {

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String getVoice() {
        return "coo";
    }

    @Override
    public void sleep() {
        System.out.println("I am a pigeon and I am sleeping");
    }

    @Override
    public void move() {
        System.out.println("Pigeon fly");
    }
}