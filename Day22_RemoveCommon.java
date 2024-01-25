import java.util.*;
class RemoveCommon
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a two string");
            String s1 = sc.nextLine();
            String s2=sc.nextLine();
            String str = "", ch = "";
           for(int i=0;i<s1.length();i++)
         {
             if(s2.contains(s1.charAt(i)+"")){
                 s2 = s2.replace(s1.charAt(i)+"" , "");
                 ch = ch+s1.charAt(i);
             }
              if(!ch.contains(s1.charAt(i)+"")){
                 str = str+s1.charAt(i);
             }
         }
        str = str+s2;
       System.out.println( str.isEmpty()?"-1":str);
     }
}