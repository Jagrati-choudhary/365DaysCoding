import java.util.*;
class MaximumProductOfTwoNumbers
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
             
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
       for(int i=0; i<n;i++){
            if(arr[i]>=max2){
            max1=max2;
            max2=arr[i];
            }  else if(arr[i] >= max1){
                max1 = arr[i];
        }
        }
        System.out.println( max1*max2);
    }
}