package Basic;
import java.util.Scanner;

public class  SimpleInterest {
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);
        int p,r,t;
        System.out.println("enter principle:");
        p = input.nextInt();
        System.out.println("enter rate:");
        r = input.nextInt();
        System.out.println("enter time:");
        t = input.nextInt();
        int si=p*r*t;
        System.out.println("Simple interest is:" +si);

    }
    
}
