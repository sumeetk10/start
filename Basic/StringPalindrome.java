package Basic;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String str,rev="";
        System.out.println("Enter a string: ");
        str = input.nextLine();
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev + str.charAt(i);
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("string is palindrome");
        } else {
            System.out.println("string is not palindrome");
        }

    }
    
}
