
import java.util.*;
class LastIndexOne
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the array element");
            int n = sc.nextInt();
            String s[] = new String[n];
            for(int i=0;i<n;i++)
         {
            System.out.println("s["+i+"]=");
                   s[i]=sc.next();
         }
            for(int i=n-1;i>=0;i--){
             
            char ch=s[i].charAt(0);
           if(ch=='1'){
             System.out.println(i);
           }
       }
           System.out.println("-1");
     
}
}
