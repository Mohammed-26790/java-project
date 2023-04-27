package inheritance.taskOne;

import java.util.Scanner;

class Person {
    String surname, firstName, street, zipCode, city;

    public void initialize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter surname: ");
        surname = scanner.nextLine();
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter street: ");
        street = scanner.nextLine();
        System.out.print("Enter zip code: ");
        zipCode = scanner.nextLine();
        System.out.print("Enter city: ");
        city = scanner.nextLine();
    }

    public void print() {
        System.out.println("Name: " + firstName + " " + surname);
        System.out.println("Address: " + street + ", " + zipCode + " " + city);
    }
}


