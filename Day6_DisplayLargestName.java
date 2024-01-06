
import java.util.*;
class DisplayLargestName
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the array element");
            int n = sc.nextInt();
            String name[] =new String[n]; 
            for(int i=0;i<n;i++)
         {
            System.out.println("name["+i+"]=");
                   name[i]=sc.next();
         }
          int max=0;
          int j=0;
          for(int i=0;i<n;i++){
          if(name[i].length()>max){
            max=name[i].length();
                j=i;
            }
        }
       System.out.println(name[j]);
}
}