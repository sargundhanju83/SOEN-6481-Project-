import java.util.Scanner;
public class CircumferenceCalculation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toUpperCase();
        if(s.equals("CRF"))
        {
            String radius=sc.nextLine();
            double r=Double.parseDouble(radius);
            double result=2*3.14*r;
            System.out.println(result);
        }
    }
}
