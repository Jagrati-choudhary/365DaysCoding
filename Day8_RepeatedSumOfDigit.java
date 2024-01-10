import java.util.*;
class RepeatedSumOfDigit
{
            public static void main(String[] args)
    {

              
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int n = sc.nextInt();
              if(n<10)
          System.out.println(n);
          int sum=0;
          while(n!=0){
              sum = sum  + n % 10 ;
              n = n/10;
          }
          int sum2=0;
           while(sum!=0){
            sum2 = sum2 + sum%10;
            sum = sum / 10;   
          }
           System.out.println(sum2);
}
}