import java.util.*;
class ProductOfArrayElement
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            long arr[]=new long[n];
            for(int i=0;i<n;i++)
          {
            System.out.println("arr["+i+"] = " );
             arr[i] = sc.nextLong();
          }
            long mod=sc.nextLong();
            long pro=1;
        for(int i=0;i<n;i++){
            pro = (pro * arr[i]) % mod;
        }
        System.out.println( pro);
     }
}