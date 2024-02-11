import java.util.*;
class RemoveDulicatesFromSortedArray
{ 
      public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enetr the size of array");
      int n= sc.nextInt();
      int A[]= new int [n];
      for(int i=0;i<n;i++)
   {
      System.out.println("A["+i+"]=" );
       A[i] = sc.nextInt();
   }  
       int res=1;
        for(int i=1;i<n;i++){
            if(A[i]!=A[i-1]){
                A[res]=A[i];
                res++;
            }
        }
        System.out.println( res);
   }
}