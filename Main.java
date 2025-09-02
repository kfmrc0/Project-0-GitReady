import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--------------------");
        System.out.println("Project 0: Git Ready");
        System.out.println("--------------------");
            System.out.println("\nThis is a simple Java program that multiplies two given numbers.");
        System.out.println("\n----------------------");

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("\nEnter the second number: ");
        int secondNumber = scanner.nextInt();

        int ans = firstNumber * secondNumber;
        System.out.println("\nThe answer is: " + ans);
        System.out.println();

        scanner.close();

        // changed


        
    }
}
