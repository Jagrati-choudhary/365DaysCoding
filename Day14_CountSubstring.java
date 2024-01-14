import java.util.*;
class CountSubstring
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s = sc.nextLine();
            int count =0 , ans =0;
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans+=count;
                count++;
            }
        }
          System.out.println(ans);
    }
}