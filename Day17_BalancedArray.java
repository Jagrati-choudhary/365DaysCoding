import java.util.*;
class BalancedArray
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a Size");
            int n= sc.nextInt();
            int a[]=new int[n];
             for(int i=0;i<n;i++)
           {
            System.out.println("a["+i+"] =");
            a[i]=sc.nextInt();
           } 
              int x= n/2;
            long bal = 0;
            long bal2 = 0;
             for(int i=0;i<n;i++){
                   if(i<x){
                bal = bal + a[i];
            }
            else {
                bal2 = bal2 +a[i];
            }
        }
      System.out.println(Math.abs(bal-bal2));
   }
}
