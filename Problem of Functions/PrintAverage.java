import java.util.Scanner;

//Question 1>
// Enter 3 Number from the User And make a Function to print their Average
public class PrintAverage {

    // Main Class Which is Called First from All the Classes
    public static void main(String[] args){
        //Taking Input from the User
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter the Value of B : ");
        int b = sc.nextInt();
        System.out.print("Enter the Value of C : ");
        int c = sc.nextInt();

        //Calling the Function
        avg(a,b,c);
    }

    //Created Another function for Print The Average of Given Input
    public static int avg(int a, int b, int c){
        int average = (a + b + c)/3;
        System.out.println("The average of "+a+","+b+"and "+c+" = "+average);
        return average;
    }

}
