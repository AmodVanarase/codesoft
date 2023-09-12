package Task1;
import java.util.Scanner;
public class task1GradeCalcy {
    public static void main(String[] args) {
        String[] grades = {"A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D", "F"};
        int[] boundaries = {90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's score: ");
        double score;
        try{
            score = scanner.nextDouble();
            if (score >= 0 && score <= 100) {
                String grade = Calculate(score, grades, boundaries);
                System.out.println("The student's grade is: " + grade);
            } else {
                System.out.println("Invalid input. Please enter a score between 0 and 100.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid numeric score.");
        } finally {
            scanner.close();
        }
    }
    public static String Calculate(double score, String[] grades, int[] boundaries) {
        for (int i = 0; i < grades.length; i++) {
            if (score >= boundaries[i]) {
                return grades[i];
            }
        }
        return "F";  
    }
}
