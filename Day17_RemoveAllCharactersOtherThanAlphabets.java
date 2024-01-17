import java.util.*;
class RemoveAllCharactersOtherThanAlphabets
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s = sc.nextLine();
             String str=s.replaceAll("[^a-zA-Z]","");
            if(str.length()==0){
           System.out.println( "-1");
        }
         System.out.println(str);
      }
}
        