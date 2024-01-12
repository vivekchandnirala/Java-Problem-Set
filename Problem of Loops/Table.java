import java.util.*;

public class Table {
    public static void main(String[] args) {

        //Question :- Print The Table of a Number Input by The User

        System.out.print("Enter The Number : ");
        //Taking Input From The User
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Now Print The Table With the Help of For Loop

        for(int i=1;i<11;i++){
            System.out.println(n+" * "+i+" = "+i*n);
        }
    }
}