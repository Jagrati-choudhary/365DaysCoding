import java.util.*;
class FindAllFactorialNumberLessOrEqualN
{
       public static void main(String args[])
   {

          Scanner sc = new Scanner(System.in);
		System.out.print("Emter the value: ");
		int N = sc.nextInt();
         ArrayList<Integer> arr = new ArrayList<Integer>();
         int n = 2;
         int fact = 1;
         while(fact <= N){
           arr.add(fact);
           fact = fact * n;
           n++;
       }
       System.out.println( arr);
    }
}