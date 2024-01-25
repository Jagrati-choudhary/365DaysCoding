import java.util.*;
class UpperCaseConvertion
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            String s = sc.nextLine();
            String st = new String();
           String[] str = s.split(" ");
        
           for(int i=0;i<str.length;i++){
            str[i]=Character.toUpperCase(str[i].charAt(0))+str[i].substring(1)+" ";
            st+=str[i];
        }
          System.out.println( st);
     }
}
