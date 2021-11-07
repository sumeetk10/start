package Basic;

import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int num1,num2;
        System.out.println("Enter two numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        if( num1>num2)
         System.out.println(num1+ " is greater");
        else if (num2>num1) {
            System.out.println(num2+ " is greater");
        }
        else if (num1==num2) {
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Invalid");
        }
           
    }
    
}
