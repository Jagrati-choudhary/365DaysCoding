 import java.util.Scanner;
class Day2_PlayWithOr
 {
         public static void main(String[] args)
 {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the array element");
         int n = sc.nextInt();
         int arr[] = new int[n];

         for(int i=0;i<n;i++)
       {
         System.out.println("arr["+i+"]=");
                arr[i]=sc.nextInt();
       }  
          // Complete the function
       int i;
       for( i=0;i<n-1;i++){
          
             arr[i]=arr[i] | arr[i+1]  ;
       }
         for(int j =0;j<n;j++){
        System.out.println(arr[j]);
}
 }
 }