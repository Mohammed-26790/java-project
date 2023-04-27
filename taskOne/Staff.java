package inheritance.taskOne;

import java.util.Scanner;

class Staff extends Person implements Salary {
    String education, position;

    // implementation of the "normal" interface method
    public double salaryToPay(int hours, double rate) {
        double salary = hours * rate;
        salary += salaryForOvertime(hours, rate); // calling default method
        return salary;
    }

    public void initialize1() {
        initialize();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }

    public void print1() {
        print();
        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}