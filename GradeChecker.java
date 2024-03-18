import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avgscore;

        System.out.print("Enter your score: ");
        avgscore = scanner.nextDouble();

        if (avgscore >= 0 && avgscore <= 29) {
            System.out.println("Grade: Fail");
        } else if (avgscore >= 30 && avgscore <= 39) {
            System.out.println("Grade: E");
        } else if (avgscore >= 40 && avgscore <= 49) {
            System.out.println("Grade: D");
        } else if (avgscore >= 50 && avgscore <= 59) {
            System.out.println("Grade: C");
        } else if (avgscore >= 60 && avgscore <= 69) {
            System.out.println("Grade: B");
        } else if (avgscore >= 70 && avgscore <= 90s) {
            System.out.println("Grade: A");
        } else {
            System.out.println("Grade: Does not Exist??");
        }

        scanner.close();
    }
}
