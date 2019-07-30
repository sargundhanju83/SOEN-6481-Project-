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
        String num1=sc.nextLine();
        String num2=sc.nextLine();
        double n1=Double.parseDouble(num1);
        double n2=Double.parseDouble(num2);
        String op=sc.nextLine();
        double result;
        if(op.equals("+"))
        {
            result=n1+n2;
            System.out.println(result);
            al.add(result);
        }
        else if(op.equals("-"))
        {
            result=n1-n2;
            System.out.println(result);
            al.add(result);
        }
        else if(op.equals("*"))
        {
            result=n1*n2;
            System.out.println(result);
            al.add(result);
        }
        else if(op.equals("/"))
        {
            result=n1/n2;
            System.out.println(result);
            al.add(result);
        }
        String input=sc.nextLine();
        if(input.equals("R"))
        {
            System.out.println(al);
            String input2=sc.nextLine();
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
