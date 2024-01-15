import java.util.*;
class CountAlphabets
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String S = sc.nextLine();
           int count=0;
           for(int i=0;i<S.length();i++){
           if(  S.charAt(i)>='a' && S.charAt(i)<='z' ||   S.charAt(i)>='A' && S.charAt(i)<='Z'){
                count++;
            }
        }
        System.out.println(count);
    }
}