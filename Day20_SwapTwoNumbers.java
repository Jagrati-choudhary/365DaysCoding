import java.util.*;
class SwapTwoNumbers
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<Integer>();
            int temp = a;
            a =b;
            b= temp;
            arr.add(a);
            arr.add(b);
             System.out.println(arr);
     }
} 
          
