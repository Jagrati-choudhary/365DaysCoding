import java.util.*;
class DeleteAlternateCharacters
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s = sc.nextLine();
            String ans="";
            for(int i=0;i<s.length();i+=2)
        {
               ans = ans+s.charAt(i);
        }
        System.out.println(ans);
    }
}