package Basic;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number:");
        num = input.nextInt();
        if(num%2==0)
        System.out.println(num+ " is even number");
        else
        System.out.println(num+ " is odd number");

        
    }


    
}
