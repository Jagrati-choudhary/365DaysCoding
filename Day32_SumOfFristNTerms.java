import java.util.*;
class SumOfFristNTrems
{
       public static void main(String args[])
   {

          Scanner sc = new Scanner(System.in);
		System.out.print("Emter the value: ");
		int N = sc.nextInt();
		int  s=0;
        while(N!=0){
            s+=N*N*N;
            N--;
        }
      System.out.print( s);
    }
}