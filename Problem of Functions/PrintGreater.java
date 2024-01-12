import java.util.Scanner;

//Question 3>
//Write a function which takes in 2 numbers and returns the greater of those two.
public class PrintGreater {

    // Main Function
    public static void main(String[] args){

        //Taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter The Value of B : ");
        int b = sc.nextInt();

        //Calling The Function
        num(a,b);
    }

    //Another Function which Tell Which number is Greater
    public static void num(int a, int b){
        if(a>b){
            System.out.println(a+" is Greater than "+b);
        }
        else {
            System.out.println(b+" is Greater than "+a);
        }
    }
}
