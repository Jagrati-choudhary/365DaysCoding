
import java.util.*;
class ThirdLargest
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the array element");
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++)
         {
            System.out.println("a["+i+"]=");
                   a[i]=sc.nextInt();
         }

       int max= Integer.MIN_VALUE;
        int prev= Integer.MIN_VALUE;
        int third= Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
        {
            if(max<a[i]){
                third=prev;
                prev=max;
                max=a[i];
            }else if(prev<a[i])
             {
                 third =prev;
                 prev=a[i];
             } 
             else if(third<a[i]){
                 third = a[i];
             }
             
        }
       System.out.println(third);
}
}