import java.util.*;
class ChangeTheString
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the String");
    String s = sc.nextLine();
    String str="";
     for(int i=0;i<s.length();i++)
   {
          if(s.charAt(i)>=97 && s.charAt(i)<=223)
       {
           str= s.toLowerCase();
           break;
       }
          else {
                str= s.toUpperCase();
                break;
            }
   }
       System.out.println( str);
  }
}