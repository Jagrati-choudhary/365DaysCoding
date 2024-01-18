import java.util.*;
class FascinatingNumbers
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a number");
            int n = sc.nextInt();
            int mul = n * 2;
           int mul2 = n* 3;
           String result = ""+n+mul+mul2;
           if(result.length() == 9){
             for(int i = 1; i<=9; i++){
            if(!result.contains(String.valueOf(i)))
                   System.out.println("No Fascinating");
            }
            System.out.println(" Fascinating");
        }
      
      }
}