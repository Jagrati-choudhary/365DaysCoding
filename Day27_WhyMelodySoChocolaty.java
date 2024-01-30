import java.util.*;
class WhyMelodySoChocolaty
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
           
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            arr[i]= arr[i] + arr[i+1];
            if(arr[i]>max){
                max = arr[i];
            }
        }
       System.out.println(max);
      }
}