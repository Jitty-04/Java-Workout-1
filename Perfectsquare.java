import java.util.Scanner;
public class Perfectsquare
{
    static void psquares(int l,int m)
    {

        for(int i=l+1;i<m;i++)
        {
            double p = Math.sqrt(i);
            {
                    if (p - Math.floor(p) == 0) {
                        System.out.println(i + " ");
                    }
            }


        }

    }

    public static void main(String[] a)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting and ending limit");
        int l=s.nextInt();
        int m =s.nextInt();
        System.out.println("Perfect Squares between " +l+ " and " +m+ " is");
        psquares(l,m);



    }
}
