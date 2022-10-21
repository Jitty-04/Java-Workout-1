import java.util.Scanner;
public class Fahren_Celsius
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature value");
        double f = sc.nextDouble();
        double c =(f - 32) * 5 /9;
        System.out.println("Given Temperature value= " +f+ " \u2109");
        System.out.println("Converted Temperature value=" +String.format("%.5f",c)+ " \u2103");
    }
}
