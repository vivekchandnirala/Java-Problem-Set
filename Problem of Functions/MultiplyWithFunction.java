import java.util.Scanner;

//Question:-
//Make a function to multiply 2 Number and return the product
public class MultiplyWithFunction {

    //Main Wala Class Likh rahe hai
    public static void main(String[] args){

        //Taking Input From The User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter The Value of B : ");
        int b = sc.nextInt();

        //Calling The Function
        int z= multiply(a,b);
        System.out.println("The Multiplication of 2 Number is : "+z);
    }

    //Yeh Function ko Call kiya jayega
    public static int multiply(int a, int b){
        int multi = a*b;
        return multi;
    }
}
