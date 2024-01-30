import java.util.*;
class CountEvenOdd
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
            
        int count=0;
        int count1=0;
         for(int i=0;i<n;i++){
             if(arr[i]%2!=0){
                 count++;
             }
             else if(arr[i]%2==0){
                 count1++;
             }
         }
         System.out.println(count+" "+count1);
       }
}