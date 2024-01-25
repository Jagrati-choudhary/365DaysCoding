import java.util.*;
class PrintTable
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a number");
            int n = sc.nextInt();
             int i =10;
           while(i > 0){
            System.out.print(i*n+" ");
            i--;
          
        }
        
        System.out.println();
    }
}