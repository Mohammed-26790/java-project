package inheritance.taskTwo;

public abstract class Fish extends Animal {
    private String finColor;

    public Fish(String name, double weight) {
        super();
        finColor = "";
    }

    public Fish(String name, int age, double weight, String finColor) {
        super(name, age, weight);
        this.finColor = finColor;
    }

    public Fish(String finColor) {
        super();
        this.finColor = finColor;
    }

    public Fish() {

    }

    public String getFinColor() {
        return finColor;
    }

    public void setFinColor(String finColor) {
        this.finColor = finColor;
    }

    public  void swim(){
        System.out.println("All fishes can swim");
    }

    @Override
    public String toString() {
        return super.toString() + ", finColor: " + finColor;
    }
}
