import java.util.*;
class RemoveCharacters
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String string1 = sc.nextLine();
            String string2 = sc.nextLine();
             
            for(int i=0;i<string2.length();i++){
             char ch= string2.charAt(i);
            string1 = string1.replace(String.valueOf(ch) , "");
        }
             System.out.println(string1);
    }
}
       