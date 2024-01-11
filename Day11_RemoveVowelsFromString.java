import java.util.*;
class RemoveVowelsFromString
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String S = sc.nextLine();
           System.out.println( S.replaceAll("[[aeiouAEIOU]]",""));
}
}