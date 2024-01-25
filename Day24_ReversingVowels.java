import java.util.*;
class ReversingVowels
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            String s = sc.nextLine();

            
        StringBuffer t=new StringBuffer();
        StringBuffer p=new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            t.append(s.charAt(i));
        }
        t.reverse();
        char[] a=t.toString().toCharArray();
         int k=0;
         for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
           p.append(a[k]);
           k++;
          }
          else
          p.append(s.charAt(i));
         }
         System.out.println( p.toString());
      }
}