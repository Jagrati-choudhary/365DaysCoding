import java.util.*;
class RemainderWith7
{
       public static void main(String[] args)
   {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the String");
             String num = sc.nextLine();
             int x = 0;
            for(int i=0;i<num.length();i++)
          {
             int temp = num.charAt(i)-'0';
             x = x*10 + temp;
             x = x%7;
        }

        System.out.println( x);
    }
}