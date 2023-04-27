package inheritance.taskTwo;

public abstract class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        featherColor = "";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String featherColor) {
        super();
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return super.toString() + ", featherColor: " + featherColor;
    }
}