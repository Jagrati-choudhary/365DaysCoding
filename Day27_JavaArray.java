import java.util.*;
class JavaArray
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
          {
            System.out.println("arr["+i+"] = " );
             arr[i] = sc.nextInt();

          }
            int sum =0;
       for(int i=0;i<n;i++){
           sum = sum + arr[i];
       } 
         double d=(double)sum/n;
        System.out.println( String.format("%.2f",d));
     }
}