import java.util.*;
class ProductOfMaxInFristAndMinInSecond
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[m];
            for(int i=0;i<n;i++)
          {
            System.out.println("arr["+i+"] = " );
             arr[i] = sc.nextInt();
            
            System.out.println("brr["+i+"] = " );
             brr[i] = sc.nextInt();

          }
             int max=arr[0];
             int min=brr[0];
            for(int i=1;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
          for(int i=1;i<m;i++){
            if(min>brr[i]){
                min = brr[i];
            }
            
            
        }
        
        System.out.println(max*min);
     }
}