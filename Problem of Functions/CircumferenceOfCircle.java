import java.util.*;

//Question 4>
// Write a function that takes in the radius as input and return the Circumference of a circle
public class CircumferenceOfCircle {

    // Main Function
    public static void main(String[] args){
        //Taking Input from the User
        //As per the Question we have to take Radius as Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        int n = sc.nextInt();

        //Calling The Function
        float x=circumference(n);
        System.out.println("Circumference of the Circle is "+x);
    }

    // Another Function For Calculating the Circumference of the Circle
    public static <pi> float circumference(int n){
        float pi = 3.14F;
        float cir = 2 * pi *n;
        return cir;
    }
}
