import java.util.*;
class ReversSubArray
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
            int l= sc.nextInt();
            int r = sc.nextInt();
           while(l<r)
        {
            int temp=arr[l-1];
            arr[l-1]=arr[r-1];
            arr[r-1]=temp;
            l++;
            r--;
       }
            for(int i=0;i<n;i++){
         System.out.print(arr[i]+ " ");
     }
   }
}