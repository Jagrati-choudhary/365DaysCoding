import java.util.*;
class ReversAString
{
       public static void main(String args[])
   {

          Scanner sc = new Scanner(System.in);
		System.out.print("Emter the value: ");
		 String str = sc.nextLine();
            String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
       System.out.print( s);

    }
}