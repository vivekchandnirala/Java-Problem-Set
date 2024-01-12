import java.util.Scanner;

//Question 5>
// Write a function that takes in age as input and return if that percent is eligible to vote or not.
// A person of age > 18 Eligible to vote
public class EligibleToVote {

    //Main Function where we take input
    public static void main(String[] args){

        //Taking Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int n = sc.nextInt();

        //Calling that function
        vote(n);
    }

    // This Function Tells Wheather a Person is Eligible to vote or not
    public static void vote(int n){
        //Using if and else for checking the age of a person
        if(n>18){
            System.out.println("You are Eligible to vote");
        }else{
            System.out.println("You're not Eligible to vote");
        }
    }
}
