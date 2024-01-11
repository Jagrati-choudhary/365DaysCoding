import java.util.*;
class CheckString
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s = sc.nextLine();
             char c[]=s.toCharArray();
             for(int i=0;i<c.length-1;i++)
        {
                 if(c[i]!=c[i+1])
                System.out.println("false");
                  break;
        }
                 System.out.println("true");
}
}