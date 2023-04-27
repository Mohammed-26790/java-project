package inheritance.taskOne;

public class Main {
    public static void main(String[] args) {
        Staff staff1 = new Staff();
        staff1.initialize1();
        staff1.print1();


        double salary = staff1.salaryToPay(40, 20);
        System.out.println("Salary to pay: " + salary);


        double overtimeSalary = staff1.salaryForOvertime(10, 25);
        System.out.println("Overtime salary: " + overtimeSalary);


        boolean eligibleForBonus = Salary.shouldReceiveBonus(5);
        System.out.println("Eligible for bonus: " + eligibleForBonus);
    }
}