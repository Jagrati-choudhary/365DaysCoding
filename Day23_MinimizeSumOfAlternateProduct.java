import java.util.*;
class MinimizeSumOfAlternateProduct
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
        int  sum=0;
        int i=0;
        int j=(int)n-1;
         while(i<j){
          sum=sum+arr[i]*arr[j];
          i++;
         j--;
   }
        System.out.println(sum);
  }
}