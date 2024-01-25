import java.util.*;
class PlayWithArray
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
          {
            System.out.println("a["+i+"] = " );
             a[i] = sc.nextInt();

          }
            int temp;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0 && i < n-1){
                if(a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;   
                }
            }
        }
         for(int i=0;i<n;i++){
         System.out.println( a[i]);
       }
    }
}