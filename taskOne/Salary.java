package inheritance.taskOne;

public interface Salary {
    double salaryToPay(int hours, double rate);


    default double salaryForOvertime(int hours, double rate) {
        if (hours > 40) {
            return (hours - 40) * rate * 1.5;
        }
        return 0;
    }


    static boolean shouldReceiveBonus(int yearsOfExperience) {
        return yearsOfExperience > 5;
    }
}
