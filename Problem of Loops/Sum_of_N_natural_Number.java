import java.util.Scanner;

public class Sum_of_N_natural_Number {
    public static void main(String[] args){

        //Question :-  Print The Sum of N natural Number

        //Taking The Value Of n From The User
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Formula of Finding Sum of N natural Number is : n*(n+1)/2
        //int sum = (n)*(n+1)/2;
        //System.out.println(sum);


        //With the Help of For Loop
        int sum = 0;
        for(int i = 0; i<=n;i++){
            sum = sum+i;
        }

        System.out.println(sum);


    }
}
