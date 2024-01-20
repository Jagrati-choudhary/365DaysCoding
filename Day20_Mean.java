import java.util.*;
class Mean
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int N = sc.nextInt();
            int a[]=new int[N];
            for(int i=0;i<N;i++)
          {
            System.out.println("a["+i+"] = " );
             a[i] = sc.nextInt();

          }
          int sum = 0;
        for(int i=0;i<N;i++){
            sum = sum + a[i];
        }
         System.out.println (sum/N);
     }
}