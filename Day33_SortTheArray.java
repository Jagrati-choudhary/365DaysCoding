import java.util.*;
class SortTheArray
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
             Arrays.sort(arr);
          for(int i=0;i<n;i++){
         System.out.println(arr[i]);
        }
    }
}