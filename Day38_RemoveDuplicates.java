import java.util.*;
class RemoveDuplicates
{
       public static void main(String[] args)
   {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter the String");
             String S = sc.nextLine();
             TreeSet<Character> s = new TreeSet<>();
             String str = "";
        
             for(int i = 0; i < S.length(); i++) {
              char c = S.charAt(i);
              if(s.add(c)) {
                str += c;
            }
        }
                  System.out.println( str);
   }
}