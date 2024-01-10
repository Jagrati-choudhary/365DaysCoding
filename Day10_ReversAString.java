import java.util.*;
class ReversAString
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a string");
            String S = sc.nextLine();
             StringBuilder sb = new StringBuilder(S).reverse();
            System.out.println( sb.toString());
}
}