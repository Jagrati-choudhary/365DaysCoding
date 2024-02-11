import java.util.*;
class KeypadTyping
{
       public static void main(String[] args)
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the String");
        String s = sc.nextLine();
        String str="";
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='a' && ch<='c')
        str+=2;
         if(ch>='d' && ch<='f')
        str+=3;
         if(ch>='g' && ch<='i')
        str+=4;
         if(ch>='j' && ch<='l')
        str+=5;
         if(ch>='m' && ch<='o')
        str+=6;
         if(ch>='p' && ch<='s')
        str+=7;
         if(ch>='t' && ch<='v')
        str+=8;
         if(ch>='w' && ch<='z')
        str+=9;
    
   
    }
     System.out.println( str);
  }
}