import java.util.*;
class SumOfDivisors
{ 
      public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enetr the value");
      int n= sc.nextInt();
      int sum =0;
        for(int i=1;i<=n/2;i++){
            if(n%i ==0){
                sum = sum+i;
            }
        }
        System.out.println( sum);
   }
}