package inheritance.taskTwo;

public interface AnimalMove {
    default void move() {
        System.out.println(getClass().getSimpleName() + " moves");
    }
}
