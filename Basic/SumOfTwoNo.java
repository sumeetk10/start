package Basic;

import java.util.Scanner;

public class SumOfTwoNo {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1,num2,sum=0;
        System.out.println("Sum of two Numbers");
        System.out.println("Enter 1st number: ");
        num1 = input.nextInt();
        System.out.println("Enter 2nd Number: ");
        num2 = input.nextInt();
        sum=num1+num2;
        System.out.println("Sum : " +sum);

    }
}
    

