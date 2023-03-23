public class Main {
    public static void main(String[] args) {
        Car car = new Car("Model Y", "Tesla", 2022, 30000.0, "Black", 10);
        System.out.println(car.toString());

        car.sell(3);
        System.out.println("Quantity after selling: " + car.getQuantity());

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("Red");
        car.setPrice(35000.0);
        System.out.println(car.toString());
    }
}
