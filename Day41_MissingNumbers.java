import java.util.*;
class MissingNumbers
{ 
      public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enetr the size of array");
      int N= sc.nextInt();
      int A[]= new int [N];
      for(int i=0;i<N;i++)
   {
      System.out.println("A["+i+"]=" );
       A[i] = sc.nextInt();
   }  
        int sum=0;
        for(int i=1; i<=N; i++){
            sum += i;
        }
        int curr_sum = 0;
        for(int i=0; i<N-1; i++){
            curr_sum += A[i];
        }
        if(curr_sum != sum)
                 sum -= curr_sum;
       System.out.println( sum);
   }
} 