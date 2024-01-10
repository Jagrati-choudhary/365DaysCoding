import java.util.*;
class JavaString
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
           
             char ch;
           String rev="";
           String s3=s1.concat(s2);
           for(int i=0;i<s3.length();i++){
            ch=s3.charAt(i);
            rev=ch+rev;
        }
          System.out.println(rev);
}
}
