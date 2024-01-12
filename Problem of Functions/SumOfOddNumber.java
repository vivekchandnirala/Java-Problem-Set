import java.util.Scanner;

//Question 2>
// Write a function to print the sum of all odd numbers from 1 to n.
public class SumOfOddNumber {

    // Main Function Which Excute First among all
    public static void main(String[] args){

        //Taking Input from The User
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Calling The Function
        sum(n);
    }

    // Another Function Where we Sum the odd Number
    public static int sum(int n){
        //Formula for sum of N natural Number is n^*n
        int sum = n*n;
        System.out.println("Sum of First "+n+" Odd Number is "+sum);
        return sum;
    }
}
