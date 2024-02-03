import java.util.*;
class MaxiMin
{
       public static void main(String args[])
   {

          Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int N = sc.nextInt();
		int[] A = new int[N];
		

		for (int i = 0; i < N; i++) {
			System.out.print("A[" + i + "]=");
			A[i] = sc.nextInt();
		}
         int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(max<A[i]){
                max = A[i];
            }
        }
        for(int i=0;i<N;i++){
            if(min>A[i]){
                min = A[i];
            }
        }
      System.out.print( max+min);
   }
}