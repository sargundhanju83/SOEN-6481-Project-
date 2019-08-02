import java.util.Scanner;
public class CircumferenceCalculation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press CRF to calculate circumference");
        String s=sc.nextLine();
        s=s.toUpperCase();
        if(s.equals("CRF"))
        {
            System.out.println("Enter the radius");
            String radius=sc.nextLine();
            double r=Double.parseDouble(radius);
            if(r>0)
            {
            System.out.println("Press =");
            String s2=sc.nextLine();
            double result=2*3.14*r;
            System.out.println(result);
            }
            else
            {
                System.out.println("Invalid input");
            }
        }
    }
}
