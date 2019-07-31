import java.util.Scanner;
public class Precision 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press pi");
        String str=sc.nextLine();
        str=str.toLowerCase();
        if(str.equals("pi"))
        {
        System.out.println("Press P");
        String str2=sc.nextLine();
        str2=str2.toUpperCase();
        System.out.println("Select the precision");
        String num=sc.nextLine();
        int n=Integer.parseInt(num);
        double result=0;
        if(n==1)
        {
            System.out.println("3.1");
            result=3.1;
        }
        else if(n==2)
        {
            System.out.println("3.14");
            result=3.14;
        }
        else if(n==3)
        {
            System.out.println("3.141");
            result=3.141;
        }
        else if(n==4)
        {
            System.out.println("3.1415");
            result=3.1415;
        }
        else if(n==5)
        {
            System.out.println("3.14159");
            result=3.14159;
        }
        else if(n==6)
        {
            System.out.println("3.141592");
            result=3.141592;
        }
        else if(n==7)
        {
            System.out.println("3.1415926");
            result=3.1415926;
        }
        else if(n==8)
        {
            System.out.println("3.14159265");
            result=3.14159265;
        }
        else if(n==9)
        {
            System.out.println("3.141592653");
            result=3.141592653;
        }
        else if(n==10)
        {
            System.out.println("3.1415926535");
            result=3.1415926535;
        }
        System.out.println("Enter the radius");
        String radius=sc.nextLine();
        double r=Double.parseDouble(radius);
        if(r>0)
        {
        double area=result*r*r;
        System.out.println(area);
        }
        else
        {
            System.out.println("Invalid input");
        }
        }
        
   }
}
