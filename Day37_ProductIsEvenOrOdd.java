import java.util.*;
class ProductIsEvenOrOdd
{
    public static void main(String[] args)
  {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the values ");
            String n1 = sc.nextLine();
            String n2 = sc.nextLine();
            int n=n1.length();
            int m=n2.length();
            if((n1.charAt(n-1)*n2.charAt(m-1)) % 2 == 0){
                System.out.println(" 1");
            }
            else{
                  System.out.println(" 0");
                }
   }
}