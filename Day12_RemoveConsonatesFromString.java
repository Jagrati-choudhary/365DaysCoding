import java.util.*;
class RemoveConsonatesFromString
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s = sc.nextLine();
             
            s = s.replaceAll("[^aeiouAEIOU]","");
            if(s.length() == 0)
                 System.out.println("No Vowel");
        else 
                 System.out.println(s);   

    }
} 
        