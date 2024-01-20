import java.util.*;
class SumOfDigit
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a number");
            int N = sc.nextInt();
            int sum =0;
            while(N!=0){
            sum = sum + N%10;;
             N = N/10;
        }
      System.out.println( sum);
    }
}