import java.util.Scanner;

//Question 7>
// Write a program to enter the number till the user want
// and at the end it should display the count of positive negative and zeros entered
public class UserWantNoOfInputs {
    public static void main(String[] args){

        // Initializing the Variables
        int positive = 0, negative = 0, zeros = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("How Many Numbers You Want to Enter: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter The Number: ");
            int number = sc.nextInt(); // Read the entered number

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

// Printing The Output
        System.out.println("Positives: " + positive);
        System.out.println("Negatives: " + negative);
        System.out.println("Zeros: " + zeros);
    }
}