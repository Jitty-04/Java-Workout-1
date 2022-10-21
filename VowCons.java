import java.util.Scanner;
public class VowCons {
    public static void main(String a[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = s.next().charAt(0);
        switch(c)
        {
            case 'a' : case 'A' :
            case 'e' : case 'E' :
            case 'i' : case 'I' :
            case 'o' : case 'O' :
            case 'u' : case 'U' :
                System.out.println("It is a vowel ");
                break;
            default:System.out.println(" It is a consonent");

        }
    }
}
