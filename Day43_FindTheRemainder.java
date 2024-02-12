import java.util.*;
class FindTheRemainder
{
       public static void main(String[] args)
   {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the String value ");
             String N = sc.nextLine();
             int x = 0;
       
        for(int i=0;i<N.length();i++)

        {
           int  temp = N.charAt(i)-'0';
            x = x*10 + temp;
            x = x%7;
        }
        System.out.println( x);
    }
}