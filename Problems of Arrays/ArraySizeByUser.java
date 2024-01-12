import java.util.Scanner;

public class ArraySizeByUser {
    public static void main(String[] args){

        //Taking Input from the User
        Scanner sc = new Scanner(System.in);
        System.out.print("Size Of Array : ");
        int size = sc.nextInt();
        int marks[] = new int[size];

        //
        for (int i=0; i<size; i++){
            System.out.print("Enter The Marks : ");
            marks[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
