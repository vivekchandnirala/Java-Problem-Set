import java.util.Scanner;

//Question
//Take an array as input from the user.
// Search for a given number x and print the index at which it occurs.
public class ArraySearch {
    public static void main(String[] args){

        //Taking Input from the User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of Arrays : ");
        int size = sc.nextInt();
        //Declaring Arrays
        int num[] = new int[size];

        //Taking the Values from the User
        for (int i=0;i<size;i++){
            System.out.print("Enter The Values : ");
            num[i]=sc.nextInt();
        }


        // Taking the value to find
        System.out.print("Which Number You Want to Find : ");
        int x = sc.nextInt();

        // Printing the Index No. where X is Find
        // This is Linear Search in Array
        for (int i=0;i< num.length;i++){
            if (num[i]==x){
                System.out.println("The Index value of X is : "+i);
            }
        }

//        Display the Values of Arrays

//        for (int i=0;i<size;i++){
//            System.out.println(num[i]);
//        }
    }
}
