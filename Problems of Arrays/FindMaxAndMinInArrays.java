import java.util.Scanner;

//Question : Find the maximum & minimum number in an array of integers.
public class FindMaxAndMinInArrays {
    public static void main(String[] args){

        //[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

        //Input Command
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int size = sc.nextInt();

        //Declaring Arrays
        int number[] = new int[size];

        //Taking Input Values for Arrays
        for (int i=0; i<number.length;i++){
            System.out.print("Enter the Values : ");
            number[i]=sc.nextInt();
        }

        //Concept of MIN and MAX
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //Checking for Minimum and Maximum
        for (int i=0; i<number.length;i++){
            // for Minimun
            if(number[i]<min){
                min=number[i];
            }
            //for Maximum
            if (number[i]>max){
                max=number[i];
            }
        }

        // Printing The Max And Min
            System.out.println("The Largest Number is "+max);
            System.out.println("The Smallest Number is "+min);
    }
}
