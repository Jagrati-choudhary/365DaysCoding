import java.util.*;
class MaximumSumOfAnArray
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

        int ans=0;

        for(long i=0;i<n;i++){

            ans+=(arr[(int)i]*i);

            ans=ans%1000000007;

        }

        System.out.println((int)ans%1000000007);
    }
}