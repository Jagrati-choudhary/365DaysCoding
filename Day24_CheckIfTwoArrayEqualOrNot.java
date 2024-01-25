import java.util.*;
class CheckIfTwoArrayEqualOrNot
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[n];
            for(int i=0;i<n;i++)
          {
            System.out.println("arr["+i+"] = " );
             arr[i] = sc.nextInt();

          }
            for(int i=0;i<n;i++)
          {
            System.out.println("brr["+i+"] = " );
             brr[i] = sc.nextInt();

          }
           Arrays.sort(arr);
          Arrays.sort(brr);
          for(int i=0;i<n;i++){
            if(arr[i]!=brr[i]){
               System.out.println("0");
            }
        }
       System.out.println("1");
      }
}