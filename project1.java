import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = input.nextDouble();
        System.out.print("Enter width: ");
        width = input.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void displayResult() {
        System.out.println("Area of rectangle: " + area);
    }

    public static void main(String[] args) {
        RectangleArea rectangle = new RectangleArea();
        rectangle.getData();
        rectangle.computeField();
        rectangle.displayResult();
    }
}