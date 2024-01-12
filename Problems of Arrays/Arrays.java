import java.util.Scanner;

//Question : Take an array of names as input from the user and print them on the screen.
public class Arrays {
    public static void main(String[] args){

        //Taking input From the User
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of Arrays : ");
        int size = sc.nextInt();

        //Declaring Arrays
        String name[] = new String[size];

        //Taking No. of Times for names
        for (int i=0; i<size;i++){
            System.out.print("Enter the Name : ");
            name[i]=sc.next();
        }

        //Display the Arrays
        for (int i=0; i<size; i++){
            System.out.println("name " + (i+1) +" is : " + name[i]);        }
    }
}
