import java.util.*;
class ConvertListIntegerToString
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a number");
            int N = sc.nextInt();
            char ch[]=new char[N];
             for(int i=0;i<N;i++)
        {
             System.out.println("Enetr the char");
                 ch[i] = sc.next().charAt(0);
        }
            String ans ="";
            for(int i=0;i<N;i++)
        {
            ans = ans+ch[i];
            
        }
           System.out.println(ans);
     }
}