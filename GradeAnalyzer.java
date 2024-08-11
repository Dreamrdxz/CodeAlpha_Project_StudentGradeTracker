import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store grades
        int[] grades = new int[numStudents];

        // Prompt for entering grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Calculate average, highest, and lowest grades
        double average = calculateAverage(grades);
        int highest = findHighest(grades);
        int lowest = findLowest(grades);

        // Display results
        System.out.println("\nGrade Analysis:");
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }

    // Method to calculate average grade
    public static double calculateAverage(int[] grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Method to find the highest grade
    public static int findHighest(int[] grades) {
        int highest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highest) {
                highest = grades[i];
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static int findLowest(int[] grades) {
        int lowest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }
        return lowest;
    }
}
