 import java.util.Scanner;
class Day1_MiniAndMaxiElement
 {
         public static void main(String[] args)
 {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the array element");
         int n = sc.nextInt();
         int a[] = new int[n];

         for(int i=0;i<n;i++)
       {
         System.out.println("a["+i+"]=");
                a[i]=sc.nextInt();
       }  
           int mini = a[0];
           int maxi = a[0];
            for(int i=1;i<n;i++)
          {
             if(mini>a[i])
                mini=a[i];
           else if(maxi<a[i])
                 maxi=a[i];
         }
            System.out.println(mini); 
             System.out.println(maxi); 
 }
 
 }
              