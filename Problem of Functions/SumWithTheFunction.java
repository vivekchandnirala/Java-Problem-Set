import java.util.Scanner;

//Question:-
//Make a Function to ADD 2 Number and Return the Sum
public class SumWithTheFunction {
    public static void main(String[] args){
        //Taking The Input from User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value of A : ");
        int a = sc.nextInt();
        System.out.print("Enter The Value of B : ");
        int b = sc.nextInt();

        // Calling The Function
        int add=sum(a,b);
        System.out.print("Sum of 2 Number is : "+add);

    }
    // Dusra Function jo Show Karega ki Inka Sum Kitna Hua hai
    public static int sum(int a, int b){
        int sum=a+b;
        return sum;
    }
}