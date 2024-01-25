import java.util.*;
class MultiplyArray
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size");
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
             System.out.println("arr["+i+"] = " );
             arr[i] = sc.nextInt();
          }
          int mul =1;
          for(int i=0;i<n;i++){
            mul = mul * arr[i];
        }
        System.out.println( mul);
    }
}