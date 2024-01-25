import java.util.*;
class MinimumProductOfKIntegers
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
          int k=sc.nextInt();
         Arrays.sort(arr);
        int min =1;
        for(int i=0;i<n;i++){
            if(i<k){
                min =(min * arr[i])  % 1000000007;
            }
        }
        System.out.println( (int)min);
      }
}