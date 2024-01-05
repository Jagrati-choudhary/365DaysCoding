 import java.util.*;
 class SmallestAndSecoundSmallestElement
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
         
        int min=0;
        int min2 =0;
        Arrays.sort(a);
         min = a[0]; 
         
        for(int i=0; i<n-1;i++){
           
            if(a[i]!=a[i+1]){
                min2=a[i+1];
                break;
            }
            
        }
        if(min2==0){  
        
             System.out.println("1");
        }
        System.out.println(min);
         System.out.println(min2);
}
}