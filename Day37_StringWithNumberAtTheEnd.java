import java.util.*;
class StringWithNumberAtTheEnd
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the String");
    String s = sc.nextLine();
    int a = 0;
    int n = 0;
    for(int i=0;i<s.length();i++) 
   {
           if(s.charAt(i)>='0' && s.charAt(i)<='9') 
       {
           n = n*10 + s.charAt(i)-'0';
              a++;
       }
   }
        
        if(s.length()-a==n) 
          System.out.println(" 1");
        else 
        System.out.println(" 0");
  }
}