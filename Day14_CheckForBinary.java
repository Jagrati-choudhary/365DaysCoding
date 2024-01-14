import java.util.*;
class CheckForBinary
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a String");
            String s = sc.nextLine();
            for(int i=0;i<s.length();i++){
	    char ch =s.charAt(i);
	    if(ch == '0' || ch == '1')
        {
	      continue;
	}
	else{
            System.out.println("false");
	}

	  }
	  System.out.println("true");
     }
}