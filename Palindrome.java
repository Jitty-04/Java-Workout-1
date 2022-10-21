import java.util.Scanner;
public class Palindrome {
    public static void main(String a[])
    {
        String r="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s= sc.next();
        System.out.println("Given string is " +s);
        char c[]=s.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            r = r + c[i];

        }
        System.out.println("Reversed string is " +r );
        if(r.equals(s))
        {
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not palindrome");
        }
    }

}
