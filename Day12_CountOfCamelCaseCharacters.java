import java.util.*;
class CountOfCamelCaseCharacters
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s = sc.nextLine();
            int count=0;
            for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>=65 && ch<=90){
                count++;
            }
        }  
            System.out.println(count);
    }
}