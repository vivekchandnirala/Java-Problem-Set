import java.util.Scanner;

//Question : Find The Factorial of the Number
public class Factorial {
    public static void main(String[] args){
        //Taking Input from the User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int a = sc.nextInt();
        // Calling The Function to get The Factorial
        factorial(a);
/*
                       factorial of the Number (Ek Function ke andar hi ase likhte hai)

                                         int factorial=1;
                                         for (int i=a; i>=1;i--){
                                             factorial=factorial*i;
                                         }
                                         System.out.println(factorial);
*/
    }

    // Factorial Nikalne ke liye  , Dusra Function bana kar nikalna
    public static void factorial(int a){

        // If the user give Negative Number then
        if(a<0){
            System.out.println("Invalid");
            return;
        }
        int factorial = 1;
//Using for Loop because here we have to repetively multiply
        for (int i=a;i>=1;i--){
            factorial = factorial *i;
        }
        System.out.print("Factorial of "+a+" is "+factorial);
    }
}
