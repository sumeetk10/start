package Basic;

import java.util.Scanner;

public class SimpleCalci {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float num1,num2,res;
        char op;
        System.out.println("Enter two numbers:");
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        System.out.println("Enter operator(+,-,*,/): ");
        op = input.next().charAt(0);
        if (op=='+') {
            res = num1+num2;
            System.out.println("Sum is "+res);
        }
        else if (op=='-') {
              res = num1-num2; 
              System.out.println("Difference is "+res);
        }
        else if (op=='*') {
            res = num1*num2;
            System.out.println("Multiplicatio is "+res);
        }
        else if (op=='/') {
            res = num1/num2;
            System.out.println("Division is "+res);
        }
        else {
            System.out.println("Invalid");
        }

    

    }
    
}
