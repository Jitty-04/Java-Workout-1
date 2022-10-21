import java.util.Scanner;
public class Fibonacci
{
    static int fibo(int l) {
        if (l <= 1) {
            return l;
        }
        else

        {
            return fibo(l - 1) + fibo(l - 2);

        }
    }
    public static void main(String[] a)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the limit");
        int l=s.nextInt();
        int i;
        System.out.println(("The fibanocci series upto "+l+ " are"));
        for (i=0;i<=l;i++)
        {
            System.out.println(fibo(i));

        }



    }
}
