import java.util.Scanner;

//Question: Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//       {3, 4, 6, 2} is not sorted in ascending order.
public class ArrayInAscendingOrder {
    public static void main(String[] args){

        //Command for taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size Of Arrays : ");
            int size = sc.nextInt();

        //Declaring Arrays
        int num[] = new int[size];

        //TAKING VALUE OF ARRAYS FROM THE USER Through for Loop
        for (int i=0; i<size; i++){
            System.out.print("Enter the Values : ");
            num[i]= sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i< num.length-1;i++){
            if (num[i]>num[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("Array is in Ascending Order");
        }else {
            System.out.println("Array is not in Ascending Order");
        }

    }
}
