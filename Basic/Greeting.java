package Basic;
import java.util.Scanner;

public class Greeting {
    public static void main (String[ ] args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Hello, What is your name:");
        name = input.next();
        System.out.println("Have a great day " +name);
    }
    
}
