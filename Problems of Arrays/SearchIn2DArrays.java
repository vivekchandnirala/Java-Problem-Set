import java.util.Scanner;

//Question:- Take a matrix as input from the user. Search for a
//given number x and print the indices at which it occurs.
public class SearchIn2DArrays {
    public static void main(String[] args){

        // Command for taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter the Number of Columns : ");
        int cols = sc.nextInt();

        // Declaration of the 2D Array
        int number[][] = new int[row][cols];

        //Taking Input Values from the User
        for (int i=0;i<row;i++){
            for (int j=0; j<cols; j++){
                System.out.print("Enter the Values ");
                number[i][j] = sc.nextInt();
            }
        }

        //Taking The Value for Finding
        System.out.print("Enter the Number Which you want to Find : ");
        int x = sc.nextInt();

        //Displaying the Indexing
        for (int i=0;i<row;i++){
            for (int j=0; j<cols; j++){
                if(number[i][j] == x){
                    System.out.print("Location of "+x+" at index No. Row - "+ i +" column - "+j);
                }
            }
            System.out.println();
        }

    }
}
