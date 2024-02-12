import java.util.*;
class RemainderOnDividingBy11
{
       public static void main(String[] args)
   {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the String value ");
             String x = sc.nextLine();
             int y = 0;

        for(int i=0;i<x.length();i++)

        {

            int temp = x.charAt(i)-'0';

            y = y*10 + temp;

            y = y%11;

        }

        System.out.println( y);
    }
}