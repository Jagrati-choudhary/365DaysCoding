import java.util.*;
class MaximumTripletSumOfArray
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
          {
            System.out.println("a["+i+"] = " );
             a[i] = sc.nextInt();
          }
             int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        for(int i = 0;i<n;i++){
            if(a[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = a[i];
            }
            
            else if(a[i]>max2){
                max3 = max2;
                max2 = a[i];
            }
            
            else if(a[i]>max3){
                max3 = a[i];
            }
        }
        
     System.out.println( max1+max2+max3);
      }
}
