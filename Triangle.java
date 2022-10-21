import java.util.Scanner;
public class Triangle {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=s.nextInt();
        int l,m;
        for(l=1;l<=n;l++)
        {
            for(m=1;m<=l;m++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
