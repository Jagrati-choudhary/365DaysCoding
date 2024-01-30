import java.util.*;
class TriangleShrinkingDownward
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            String S = sc.nextLine();
            String res="";
           for(int i=0;i<S.length();i++){
           for(int j=0;j<S.length();j++){
               if(j<i){
                   res = res + '.';
               }
               else{
                   res = res + S.charAt(j);
               }
           }
       }
       System.out.println( res);
    }
}