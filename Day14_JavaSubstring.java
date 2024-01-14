import java.util.*;
class JavaSubstring
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s = sc.nextLine();
            int L = sc.nextInt();
            int R = sc.nextInt();
             System.out.println (s.substring(L ,R+1));
     }
}