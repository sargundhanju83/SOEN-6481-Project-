import java.util.ArrayList;
import java.util.Scanner;
public class RecordKeeping 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double> al=new ArrayList<Double>();
        System.out.println("Turn ON the calculator");
        String value=sc.nextLine();
        value=value.toUpperCase();
        while(value.equals("ON"))
        {
        System.out.println("Enter the first number");
        String num1=sc.nextLine();
        System.out.println("Enter the second number");
        String num2=sc.nextLine();
        double n1=Double.parseDouble(num1);
        double n2=Double.parseDouble(num2);
        System.out.println("Enter your choice of operation from +,-,*,/");
        String op=sc.nextLine();
        double result;
        if(op.equals("+"))
        {
            result=n1+n2;
            System.out.println("Press =");
            String s2=sc.nextLine();
            System.out.println(result);
            al.add(result);
        }
        else if(op.equals("-"))
        {
            result=n1-n2;
            System.out.println("Press =");
            String s2=sc.nextLine();
            System.out.println(result);
            al.add(result);
        }
        else if(op.equals("*"))
        {
            result=n1*n2;
            System.out.println("Press =");
            String s2=sc.nextLine();
            System.out.println(result);
            al.add(result);
        }
        else if(op.equals("/"))
        {
            result=n1/n2;
            System.out.println("Press =");
            String s2=sc.nextLine();
            System.out.println(result);
            al.add(result);
        }
        System.out.println("Press R to see the record or C to continue or OFF to turn off the calculator");
        String input=sc.nextLine();
        input=input.toUpperCase();
        if(input.equals("R"))
        {
            System.out.println(al);
            System.out.println("Press C to continue or OFF to turn off the calculator");
            String input2=sc.nextLine();
            input2=input2.toUpperCase();
            if(input2.equals("C"))
            {
                value="ON";
            }
            else if(input2.equals("OFF"))
            {
                value="OFF";
            }
        }
        else if(input.equals("C"))
        {
            value="ON";
        }
        else if(input.equals("OFF"))
        {
            value="OFF";
            break;
        }
        }
        
           
        
        
    }
}
