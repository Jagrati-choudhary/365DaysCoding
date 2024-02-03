import java.util.*;
class TheORGate
{
       public static void main(String args[])
   {

          Scanner sc = new Scanner(System.in);
		System.out.print("Emter the Size: ");
		int N = sc.nextInt();
         int arr[]=new int [N];
         for (int i=0;i<N;i++){
          System.out.println("arr["+i+"]=" );
            arr[i] = sc.nextInt();
       }
          int a = 0;
        for(int i=0;i<N;i++){
            a =  a | arr[i]; 
        }
        System.out.println( a);
    }
}